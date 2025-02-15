package com.mrcrayfish.furniture.refurbished.network.message;

import com.mrcrayfish.framework.api.network.MessageContext;
import com.mrcrayfish.furniture.refurbished.network.play.ClientPlayHandler;
import com.mrcrayfish.furniture.refurbished.network.play.ServerPlayHandler;
import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import net.minecraft.network.FriendlyByteBuf;

import java.util.Map;

/**
 * Author: MrCrayfish
 */
public final class MessageWorkbench
{
    public record ItemCounts(Map<Integer, Integer> counts)
    {
        public static void encode(ItemCounts message, FriendlyByteBuf buffer)
        {
            buffer.writeVarInt(message.counts.size());
            for(Map.Entry<Integer, Integer> entry : message.counts.entrySet())
            {
                buffer.writeInt(entry.getKey());
                buffer.writeInt(entry.getValue());
            }
        }

        public static ItemCounts decode(FriendlyByteBuf buffer)
        {
            Map<Integer, Integer> counts = new Int2IntOpenHashMap();
            int size = buffer.readVarInt();
            while(size-- > 0)
            {
                int itemId = buffer.readInt();
                int count = buffer.readInt();
                counts.put(itemId, count);
            }
            return new ItemCounts(counts);
        }

        public static void handle(ItemCounts message, MessageContext context)
        {
            context.execute(() -> ClientPlayHandler.handleMessageWorkbenchItemCounts(message));
            context.setHandled(true);
        }
    }

    public record SelectRecipe(int index)
    {
        public static void encode(SelectRecipe message, FriendlyByteBuf buf)
        {
            buf.writeVarInt(message.index);
        }

        public static SelectRecipe decode(FriendlyByteBuf buf)
        {
            return new SelectRecipe(buf.readVarInt());
        }

        public static void handle(SelectRecipe message, MessageContext context)
        {
            context.execute(() -> ServerPlayHandler.handleMessageWorkbenchSelectRecipe(message, context.getPlayer().orElse(null)));
            context.setHandled(true);
        }
    }

    public record SearchNeighbours()
    {
        public static void encode(SearchNeighbours message, FriendlyByteBuf buffer) {}

        public static SearchNeighbours decode(FriendlyByteBuf buffer)
        {
            return new SearchNeighbours();
        }

        public static void handle(SearchNeighbours message, MessageContext context)
        {
            context.execute(() -> ServerPlayHandler.handleMessageWorkbenchSearchNeighbours(message, context.getPlayer().orElse(null)));
            context.setHandled(true);
        }
    }
}
