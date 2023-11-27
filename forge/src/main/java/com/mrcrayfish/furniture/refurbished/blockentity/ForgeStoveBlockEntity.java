package com.mrcrayfish.furniture.refurbished.blockentity;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.Container;
import net.minecraft.world.WorldlyContainer;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.wrapper.CombinedInvWrapper;
import net.minecraftforge.items.wrapper.InvWrapper;
import net.minecraftforge.items.wrapper.SidedInvWrapper;

import javax.annotation.Nullable;

/**
 * Author: MrCrayfish
 */
public class ForgeStoveBlockEntity extends StoveBlockEntity
{
    private @Nullable LazyOptional<IItemHandlerModifiable>[] handlers;

    public ForgeStoveBlockEntity(BlockPos pos, BlockState state)
    {
        super(pos, state);
    }

    @Override
    public void onNeighbourChanged()
    {
        this.invalidateItemHandlers();
    }

    @Override
    public void setBlockState(BlockState state)
    {
        super.setBlockState(state);
        this.invalidateItemHandlers();
    }

    @Override
    public <T> LazyOptional<T> getCapability(Capability<T> cap, @Nullable Direction side)
    {
        if(side != null && cap == ForgeCapabilities.ITEM_HANDLER && !this.remove)
        {
            LazyOptional<IItemHandlerModifiable>[] handlers = this.getOrCreateItemHandlers();
            if(side == Direction.DOWN)
            {
                return handlers[1].cast();
            }
            return handlers[0].cast();
        }
        return super.getCapability(cap, side);
    }

    /**
     * Gets or lazily creates the item handlers used for providing capability support. The stove
     * has a special case where if a cooking block is placed on the stove, the inventory of the
     * cooking block is combined with the down direction inventory of the stove.
     *
     * @return An array of lazy optionals containing the item handlers
     */
    @SuppressWarnings("unchecked")
    private LazyOptional<IItemHandlerModifiable>[] getOrCreateItemHandlers()
    {
        if(this.handlers == null)
        {
            LazyOptional<IItemHandlerModifiable>[] handlers = new LazyOptional[2];
            handlers[0] = LazyOptional.of(() -> new InvWrapper(this));
            handlers[1] = LazyOptional.of(() -> {
                IItemHandlerModifiable stoveHandler = new SidedInvWrapper(this, Direction.DOWN);
                IItemHandlerModifiable cookingHandler = this.createCookingBlockItemHandler();
                if(cookingHandler != null) {
                    return new CombinedInvWrapper(stoveHandler, cookingHandler);
                }
                return stoveHandler;
            });
            this.handlers = handlers;
        }
        return this.handlers;
    }

    /**
     * Creates an item handler for the above cooking block if it exists and is a container.
     * An appropriate item handler will be created if the container is a worldly container, only
     * accessing the down direction of the cooking block.
     *
     * @return A IItemHandlerModifiable of the cooking block or null if no cooking block exists
     */
    @Nullable
    private IItemHandlerModifiable createCookingBlockItemHandler()
    {
        ICookingBlock block = this.getCookingBlock();
        if(block instanceof WorldlyContainer container)
        {
            return new SidedInvWrapper(container, Direction.DOWN);
        }
        else if(block instanceof Container container)
        {
            return new InvWrapper(container);
        }
        return null;
    }

    /**
     * Invalidates the item handlers for the stove.
     */
    private void invalidateItemHandlers()
    {
        this.handlers = null;
    }
}
