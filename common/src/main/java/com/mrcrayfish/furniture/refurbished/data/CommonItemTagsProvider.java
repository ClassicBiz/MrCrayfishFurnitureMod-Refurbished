package com.mrcrayfish.furniture.refurbished.data;

import com.mrcrayfish.furniture.refurbished.core.ModBlocks;
import com.mrcrayfish.furniture.refurbished.core.ModItems;
import com.mrcrayfish.furniture.refurbished.core.ModTags;
import com.mrcrayfish.furniture.refurbished.data.tag.TagBuilder;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

import java.util.function.Function;

/**
 * Author: MrCrayfish
 */
public class CommonItemTagsProvider
{
    public static void accept(Function<TagKey<Item>, TagBuilder<Item>> builder)
    {
        // TODO throw exception if items are not in a category tag
        TagBuilder<Item> general = builder.apply(ModTags.Items.GENERAL);
        general.add(ModBlocks.TABLE_OAK.get().asItem());
        general.add(ModBlocks.TABLE_SPRUCE.get().asItem());
        general.add(ModBlocks.TABLE_BIRCH.get().asItem());
        general.add(ModBlocks.TABLE_JUNGLE.get().asItem());
        general.add(ModBlocks.TABLE_ACACIA.get().asItem());
        general.add(ModBlocks.TABLE_DARK_OAK.get().asItem());
        general.add(ModBlocks.TABLE_MANGROVE.get().asItem());
        general.add(ModBlocks.TABLE_CHERRY.get().asItem());
        general.add(ModBlocks.TABLE_CRIMSON.get().asItem());
        general.add(ModBlocks.TABLE_WARPED.get().asItem());
        general.add(ModBlocks.CHAIR_OAK.get().asItem());
        general.add(ModBlocks.CHAIR_SPRUCE.get().asItem());
        general.add(ModBlocks.CHAIR_BIRCH.get().asItem());
        general.add(ModBlocks.CHAIR_JUNGLE.get().asItem());
        general.add(ModBlocks.CHAIR_ACACIA.get().asItem());
        general.add(ModBlocks.CHAIR_DARK_OAK.get().asItem());
        general.add(ModBlocks.CHAIR_MANGROVE.get().asItem());
        general.add(ModBlocks.CHAIR_CHERRY.get().asItem());
        general.add(ModBlocks.CHAIR_CRIMSON.get().asItem());
        general.add(ModBlocks.CHAIR_WARPED.get().asItem());
        general.add(ModBlocks.DESK_OAK.get().asItem());
        general.add(ModBlocks.DESK_SPRUCE.get().asItem());
        general.add(ModBlocks.DESK_BIRCH.get().asItem());
        general.add(ModBlocks.DESK_JUNGLE.get().asItem());
        general.add(ModBlocks.DESK_ACACIA.get().asItem());
        general.add(ModBlocks.DESK_DARK_OAK.get().asItem());
        general.add(ModBlocks.DESK_MANGROVE.get().asItem());
        general.add(ModBlocks.DESK_CHERRY.get().asItem());
        general.add(ModBlocks.DESK_CRIMSON.get().asItem());
        general.add(ModBlocks.DESK_WARPED.get().asItem());
        general.add(ModBlocks.DRAWER_OAK.get().asItem());
        general.add(ModBlocks.DRAWER_SPRUCE.get().asItem());
        general.add(ModBlocks.DRAWER_BIRCH.get().asItem());
        general.add(ModBlocks.DRAWER_JUNGLE.get().asItem());
        general.add(ModBlocks.DRAWER_ACACIA.get().asItem());
        general.add(ModBlocks.DRAWER_DARK_OAK.get().asItem());
        general.add(ModBlocks.DRAWER_MANGROVE.get().asItem());
        general.add(ModBlocks.DRAWER_CHERRY.get().asItem());
        general.add(ModBlocks.DRAWER_CRIMSON.get().asItem());
        general.add(ModBlocks.DRAWER_WARPED.get().asItem());

        TagBuilder<Item> bedroom = builder.apply(ModTags.Items.BEDROOM);
        bedroom.add(ModBlocks.DESK_OAK.get().asItem());
        bedroom.add(ModBlocks.DESK_SPRUCE.get().asItem());
        bedroom.add(ModBlocks.DESK_BIRCH.get().asItem());
        bedroom.add(ModBlocks.DESK_JUNGLE.get().asItem());
        bedroom.add(ModBlocks.DESK_ACACIA.get().asItem());
        bedroom.add(ModBlocks.DESK_DARK_OAK.get().asItem());
        bedroom.add(ModBlocks.DESK_MANGROVE.get().asItem());
        bedroom.add(ModBlocks.DESK_CHERRY.get().asItem());
        bedroom.add(ModBlocks.DESK_CRIMSON.get().asItem());
        bedroom.add(ModBlocks.DESK_WARPED.get().asItem());
        bedroom.add(ModBlocks.DRAWER_OAK.get().asItem());
        bedroom.add(ModBlocks.DRAWER_SPRUCE.get().asItem());
        bedroom.add(ModBlocks.DRAWER_BIRCH.get().asItem());
        bedroom.add(ModBlocks.DRAWER_JUNGLE.get().asItem());
        bedroom.add(ModBlocks.DRAWER_ACACIA.get().asItem());
        bedroom.add(ModBlocks.DRAWER_DARK_OAK.get().asItem());
        bedroom.add(ModBlocks.DRAWER_MANGROVE.get().asItem());
        bedroom.add(ModBlocks.DRAWER_CHERRY.get().asItem());
        bedroom.add(ModBlocks.DRAWER_CRIMSON.get().asItem());
        bedroom.add(ModBlocks.DRAWER_WARPED.get().asItem());

        TagBuilder<Item> kitchen = builder.apply(ModTags.Items.KITCHEN);
        kitchen.add(ModBlocks.KITCHEN_CABINETRY_OAK.get().asItem());
        kitchen.add(ModBlocks.KITCHEN_CABINETRY_SPRUCE.get().asItem());
        kitchen.add(ModBlocks.KITCHEN_CABINETRY_BIRCH.get().asItem());
        kitchen.add(ModBlocks.KITCHEN_CABINETRY_JUNGLE.get().asItem());
        kitchen.add(ModBlocks.KITCHEN_CABINETRY_ACACIA.get().asItem());
        kitchen.add(ModBlocks.KITCHEN_CABINETRY_DARK_OAK.get().asItem());
        kitchen.add(ModBlocks.KITCHEN_CABINETRY_MANGROVE.get().asItem());
        kitchen.add(ModBlocks.KITCHEN_CABINETRY_CHERRY.get().asItem());
        kitchen.add(ModBlocks.KITCHEN_CABINETRY_CRIMSON.get().asItem());
        kitchen.add(ModBlocks.KITCHEN_CABINETRY_WARPED.get().asItem());
        kitchen.add(ModBlocks.KITCHEN_DRAWER_OAK.get().asItem());
        kitchen.add(ModBlocks.KITCHEN_DRAWER_SPRUCE.get().asItem());
        kitchen.add(ModBlocks.KITCHEN_DRAWER_BIRCH.get().asItem());
        kitchen.add(ModBlocks.KITCHEN_DRAWER_JUNGLE.get().asItem());
        kitchen.add(ModBlocks.KITCHEN_DRAWER_ACACIA.get().asItem());
        kitchen.add(ModBlocks.KITCHEN_DRAWER_DARK_OAK.get().asItem());
        kitchen.add(ModBlocks.KITCHEN_DRAWER_MANGROVE.get().asItem());
        kitchen.add(ModBlocks.KITCHEN_DRAWER_CHERRY.get().asItem());
        kitchen.add(ModBlocks.KITCHEN_DRAWER_CRIMSON.get().asItem());
        kitchen.add(ModBlocks.KITCHEN_DRAWER_WARPED.get().asItem());
        kitchen.add(ModBlocks.KITCHEN_SINK_OAK.get().asItem());
        kitchen.add(ModBlocks.KITCHEN_SINK_SPRUCE.get().asItem());
        kitchen.add(ModBlocks.KITCHEN_SINK_BIRCH.get().asItem());
        kitchen.add(ModBlocks.KITCHEN_SINK_JUNGLE.get().asItem());
        kitchen.add(ModBlocks.KITCHEN_SINK_ACACIA.get().asItem());
        kitchen.add(ModBlocks.KITCHEN_SINK_DARK_OAK.get().asItem());
        kitchen.add(ModBlocks.KITCHEN_SINK_MANGROVE.get().asItem());
        kitchen.add(ModBlocks.KITCHEN_SINK_CHERRY.get().asItem());
        kitchen.add(ModBlocks.KITCHEN_SINK_CRIMSON.get().asItem());
        kitchen.add(ModBlocks.KITCHEN_SINK_WARPED.get().asItem());
        kitchen.add(ModBlocks.KITCHEN_CABINETRY_WHITE.get().asItem());
        kitchen.add(ModBlocks.KITCHEN_CABINETRY_ORANGE.get().asItem());
        kitchen.add(ModBlocks.KITCHEN_CABINETRY_MAGENTA.get().asItem());
        kitchen.add(ModBlocks.KITCHEN_CABINETRY_LIGHT_BLUE.get().asItem());
        kitchen.add(ModBlocks.KITCHEN_CABINETRY_YELLOW.get().asItem());
        kitchen.add(ModBlocks.KITCHEN_CABINETRY_LIME.get().asItem());
        kitchen.add(ModBlocks.KITCHEN_CABINETRY_PINK.get().asItem());
        kitchen.add(ModBlocks.KITCHEN_CABINETRY_GRAY.get().asItem());
        kitchen.add(ModBlocks.KITCHEN_CABINETRY_LIGHT_GRAY.get().asItem());
        kitchen.add(ModBlocks.KITCHEN_CABINETRY_CYAN.get().asItem());
        kitchen.add(ModBlocks.KITCHEN_CABINETRY_PURPLE.get().asItem());
        kitchen.add(ModBlocks.KITCHEN_CABINETRY_BLUE.get().asItem());
        kitchen.add(ModBlocks.KITCHEN_CABINETRY_BROWN.get().asItem());
        kitchen.add(ModBlocks.KITCHEN_CABINETRY_GREEN.get().asItem());
        kitchen.add(ModBlocks.KITCHEN_CABINETRY_RED.get().asItem());
        kitchen.add(ModBlocks.KITCHEN_CABINETRY_BLACK.get().asItem());
        kitchen.add(ModBlocks.KITCHEN_DRAWER_WHITE.get().asItem());
        kitchen.add(ModBlocks.KITCHEN_DRAWER_ORANGE.get().asItem());
        kitchen.add(ModBlocks.KITCHEN_DRAWER_MAGENTA.get().asItem());
        kitchen.add(ModBlocks.KITCHEN_DRAWER_LIGHT_BLUE.get().asItem());
        kitchen.add(ModBlocks.KITCHEN_DRAWER_YELLOW.get().asItem());
        kitchen.add(ModBlocks.KITCHEN_DRAWER_LIME.get().asItem());
        kitchen.add(ModBlocks.KITCHEN_DRAWER_PINK.get().asItem());
        kitchen.add(ModBlocks.KITCHEN_DRAWER_GRAY.get().asItem());
        kitchen.add(ModBlocks.KITCHEN_DRAWER_LIGHT_GRAY.get().asItem());
        kitchen.add(ModBlocks.KITCHEN_DRAWER_CYAN.get().asItem());
        kitchen.add(ModBlocks.KITCHEN_DRAWER_PURPLE.get().asItem());
        kitchen.add(ModBlocks.KITCHEN_DRAWER_BLUE.get().asItem());
        kitchen.add(ModBlocks.KITCHEN_DRAWER_BROWN.get().asItem());
        kitchen.add(ModBlocks.KITCHEN_DRAWER_GREEN.get().asItem());
        kitchen.add(ModBlocks.KITCHEN_DRAWER_RED.get().asItem());
        kitchen.add(ModBlocks.KITCHEN_DRAWER_BLACK.get().asItem());
        kitchen.add(ModBlocks.KITCHEN_SINK_WHITE.get().asItem());
        kitchen.add(ModBlocks.KITCHEN_SINK_ORANGE.get().asItem());
        kitchen.add(ModBlocks.KITCHEN_SINK_MAGENTA.get().asItem());
        kitchen.add(ModBlocks.KITCHEN_SINK_LIGHT_BLUE.get().asItem());
        kitchen.add(ModBlocks.KITCHEN_SINK_YELLOW.get().asItem());
        kitchen.add(ModBlocks.KITCHEN_SINK_LIME.get().asItem());
        kitchen.add(ModBlocks.KITCHEN_SINK_PINK.get().asItem());
        kitchen.add(ModBlocks.KITCHEN_SINK_GRAY.get().asItem());
        kitchen.add(ModBlocks.KITCHEN_SINK_LIGHT_GRAY.get().asItem());
        kitchen.add(ModBlocks.KITCHEN_SINK_CYAN.get().asItem());
        kitchen.add(ModBlocks.KITCHEN_SINK_PURPLE.get().asItem());
        kitchen.add(ModBlocks.KITCHEN_SINK_BLUE.get().asItem());
        kitchen.add(ModBlocks.KITCHEN_SINK_BROWN.get().asItem());
        kitchen.add(ModBlocks.KITCHEN_SINK_GREEN.get().asItem());
        kitchen.add(ModBlocks.KITCHEN_SINK_RED.get().asItem());
        kitchen.add(ModBlocks.KITCHEN_SINK_BLACK.get().asItem());
        kitchen.add(ModItems.FRIDGE_LIGHT.get());
        kitchen.add(ModItems.FRIDGE_DARK.get());
        kitchen.add(ModBlocks.TOASTER_LIGHT.get().asItem());
        kitchen.add(ModBlocks.TOASTER_DARK.get().asItem());
        kitchen.add(ModBlocks.MICROWAVE_LIGHT.get().asItem());
        kitchen.add(ModBlocks.MICROWAVE_DARK.get().asItem());
        kitchen.add(ModBlocks.CUTTING_BOARD_OAK.get().asItem());
        kitchen.add(ModBlocks.CUTTING_BOARD_SPRUCE.get().asItem());
        kitchen.add(ModBlocks.CUTTING_BOARD_BIRCH.get().asItem());
        kitchen.add(ModBlocks.CUTTING_BOARD_JUNGLE.get().asItem());
        kitchen.add(ModBlocks.CUTTING_BOARD_ACACIA.get().asItem());
        kitchen.add(ModBlocks.CUTTING_BOARD_DARK_OAK.get().asItem());
        kitchen.add(ModBlocks.CUTTING_BOARD_MANGROVE.get().asItem());
        kitchen.add(ModBlocks.CUTTING_BOARD_CHERRY.get().asItem());
        kitchen.add(ModBlocks.CUTTING_BOARD_CRIMSON.get().asItem());
        kitchen.add(ModBlocks.CUTTING_BOARD_WARPED.get().asItem());
        kitchen.add(ModItems.SPATULA.get());
        kitchen.add(ModItems.KNIFE.get());

        TagBuilder<Item> outdoors = builder.apply(ModTags.Items.OUTDOORS);
        outdoors.add(ModBlocks.CRATE_OAK.get().asItem());
        outdoors.add(ModBlocks.CRATE_SPRUCE.get().asItem());
        outdoors.add(ModBlocks.CRATE_BIRCH.get().asItem());
        outdoors.add(ModBlocks.CRATE_JUNGLE.get().asItem());
        outdoors.add(ModBlocks.CRATE_ACACIA.get().asItem());
        outdoors.add(ModBlocks.CRATE_DARK_OAK.get().asItem());
        outdoors.add(ModBlocks.CRATE_MANGROVE.get().asItem());
        outdoors.add(ModBlocks.CRATE_CHERRY.get().asItem());
        outdoors.add(ModBlocks.CRATE_CRIMSON.get().asItem());
        outdoors.add(ModBlocks.CRATE_WARPED.get().asItem());
        outdoors.add(ModBlocks.GRILL_WHITE.get().asItem());
        outdoors.add(ModBlocks.GRILL_ORANGE.get().asItem());
        outdoors.add(ModBlocks.GRILL_MAGENTA.get().asItem());
        outdoors.add(ModBlocks.GRILL_LIGHT_BLUE.get().asItem());
        outdoors.add(ModBlocks.GRILL_YELLOW.get().asItem());
        outdoors.add(ModBlocks.GRILL_LIME.get().asItem());
        outdoors.add(ModBlocks.GRILL_PINK.get().asItem());
        outdoors.add(ModBlocks.GRILL_GRAY.get().asItem());
        outdoors.add(ModBlocks.GRILL_LIGHT_GRAY.get().asItem());
        outdoors.add(ModBlocks.GRILL_CYAN.get().asItem());
        outdoors.add(ModBlocks.GRILL_PURPLE.get().asItem());
        outdoors.add(ModBlocks.GRILL_BLUE.get().asItem());
        outdoors.add(ModBlocks.GRILL_BROWN.get().asItem());
        outdoors.add(ModBlocks.GRILL_GREEN.get().asItem());
        outdoors.add(ModBlocks.GRILL_RED.get().asItem());
        outdoors.add(ModBlocks.GRILL_BLACK.get().asItem());
        outdoors.add(ModBlocks.COOLER_WHITE.get().asItem());
        outdoors.add(ModBlocks.COOLER_ORANGE.get().asItem());
        outdoors.add(ModBlocks.COOLER_MAGENTA.get().asItem());
        outdoors.add(ModBlocks.COOLER_LIGHT_BLUE.get().asItem());
        outdoors.add(ModBlocks.COOLER_YELLOW.get().asItem());
        outdoors.add(ModBlocks.COOLER_LIME.get().asItem());
        outdoors.add(ModBlocks.COOLER_PINK.get().asItem());
        outdoors.add(ModBlocks.COOLER_GRAY.get().asItem());
        outdoors.add(ModBlocks.COOLER_LIGHT_GRAY.get().asItem());
        outdoors.add(ModBlocks.COOLER_CYAN.get().asItem());
        outdoors.add(ModBlocks.COOLER_PURPLE.get().asItem());
        outdoors.add(ModBlocks.COOLER_BLUE.get().asItem());
        outdoors.add(ModBlocks.COOLER_BROWN.get().asItem());
        outdoors.add(ModBlocks.COOLER_GREEN.get().asItem());
        outdoors.add(ModBlocks.COOLER_RED.get().asItem());
        outdoors.add(ModBlocks.COOLER_BLACK.get().asItem());
        outdoors.add(ModItems.SPATULA.get());
        outdoors.add(ModItems.KNIFE.get());

        TagBuilder<Item> storage = builder.apply(ModTags.Items.STORAGE);
        storage.add(ModBlocks.DRAWER_OAK.get().asItem());
        storage.add(ModBlocks.DRAWER_SPRUCE.get().asItem());
        storage.add(ModBlocks.DRAWER_BIRCH.get().asItem());
        storage.add(ModBlocks.DRAWER_JUNGLE.get().asItem());
        storage.add(ModBlocks.DRAWER_ACACIA.get().asItem());
        storage.add(ModBlocks.DRAWER_DARK_OAK.get().asItem());
        storage.add(ModBlocks.DRAWER_MANGROVE.get().asItem());
        storage.add(ModBlocks.DRAWER_CHERRY.get().asItem());
        storage.add(ModBlocks.DRAWER_CRIMSON.get().asItem());
        storage.add(ModBlocks.DRAWER_WARPED.get().asItem());
        storage.add(ModBlocks.CRATE_OAK.get().asItem());
        storage.add(ModBlocks.CRATE_SPRUCE.get().asItem());
        storage.add(ModBlocks.CRATE_BIRCH.get().asItem());
        storage.add(ModBlocks.CRATE_JUNGLE.get().asItem());
        storage.add(ModBlocks.CRATE_ACACIA.get().asItem());
        storage.add(ModBlocks.CRATE_DARK_OAK.get().asItem());
        storage.add(ModBlocks.CRATE_MANGROVE.get().asItem());
        storage.add(ModBlocks.CRATE_CHERRY.get().asItem());
        storage.add(ModBlocks.CRATE_CRIMSON.get().asItem());
        storage.add(ModBlocks.CRATE_WARPED.get().asItem());
        storage.add(ModBlocks.KITCHEN_DRAWER_OAK.get().asItem());
        storage.add(ModBlocks.KITCHEN_DRAWER_SPRUCE.get().asItem());
        storage.add(ModBlocks.KITCHEN_DRAWER_BIRCH.get().asItem());
        storage.add(ModBlocks.KITCHEN_DRAWER_JUNGLE.get().asItem());
        storage.add(ModBlocks.KITCHEN_DRAWER_ACACIA.get().asItem());
        storage.add(ModBlocks.KITCHEN_DRAWER_DARK_OAK.get().asItem());
        storage.add(ModBlocks.KITCHEN_DRAWER_MANGROVE.get().asItem());
        storage.add(ModBlocks.KITCHEN_DRAWER_CHERRY.get().asItem());
        storage.add(ModBlocks.KITCHEN_DRAWER_CRIMSON.get().asItem());
        storage.add(ModBlocks.KITCHEN_DRAWER_WARPED.get().asItem());
        storage.add(ModBlocks.KITCHEN_SINK_OAK.get().asItem());
        storage.add(ModBlocks.KITCHEN_SINK_SPRUCE.get().asItem());
        storage.add(ModBlocks.KITCHEN_SINK_BIRCH.get().asItem());
        storage.add(ModBlocks.KITCHEN_SINK_JUNGLE.get().asItem());
        storage.add(ModBlocks.KITCHEN_SINK_ACACIA.get().asItem());
        storage.add(ModBlocks.KITCHEN_SINK_DARK_OAK.get().asItem());
        storage.add(ModBlocks.KITCHEN_SINK_MANGROVE.get().asItem());
        storage.add(ModBlocks.KITCHEN_SINK_CHERRY.get().asItem());
        storage.add(ModBlocks.KITCHEN_SINK_CRIMSON.get().asItem());
        storage.add(ModBlocks.KITCHEN_SINK_WARPED.get().asItem());
        storage.add(ModBlocks.KITCHEN_DRAWER_WHITE.get().asItem());
        storage.add(ModBlocks.KITCHEN_DRAWER_ORANGE.get().asItem());
        storage.add(ModBlocks.KITCHEN_DRAWER_MAGENTA.get().asItem());
        storage.add(ModBlocks.KITCHEN_DRAWER_LIGHT_BLUE.get().asItem());
        storage.add(ModBlocks.KITCHEN_DRAWER_YELLOW.get().asItem());
        storage.add(ModBlocks.KITCHEN_DRAWER_LIME.get().asItem());
        storage.add(ModBlocks.KITCHEN_DRAWER_PINK.get().asItem());
        storage.add(ModBlocks.KITCHEN_DRAWER_GRAY.get().asItem());
        storage.add(ModBlocks.KITCHEN_DRAWER_LIGHT_GRAY.get().asItem());
        storage.add(ModBlocks.KITCHEN_DRAWER_CYAN.get().asItem());
        storage.add(ModBlocks.KITCHEN_DRAWER_PURPLE.get().asItem());
        storage.add(ModBlocks.KITCHEN_DRAWER_BLUE.get().asItem());
        storage.add(ModBlocks.KITCHEN_DRAWER_BROWN.get().asItem());
        storage.add(ModBlocks.KITCHEN_DRAWER_GREEN.get().asItem());
        storage.add(ModBlocks.KITCHEN_DRAWER_RED.get().asItem());
        storage.add(ModBlocks.KITCHEN_DRAWER_BLACK.get().asItem());
        storage.add(ModBlocks.KITCHEN_SINK_WHITE.get().asItem());
        storage.add(ModBlocks.KITCHEN_SINK_ORANGE.get().asItem());
        storage.add(ModBlocks.KITCHEN_SINK_MAGENTA.get().asItem());
        storage.add(ModBlocks.KITCHEN_SINK_LIGHT_BLUE.get().asItem());
        storage.add(ModBlocks.KITCHEN_SINK_YELLOW.get().asItem());
        storage.add(ModBlocks.KITCHEN_SINK_LIME.get().asItem());
        storage.add(ModBlocks.KITCHEN_SINK_PINK.get().asItem());
        storage.add(ModBlocks.KITCHEN_SINK_GRAY.get().asItem());
        storage.add(ModBlocks.KITCHEN_SINK_LIGHT_GRAY.get().asItem());
        storage.add(ModBlocks.KITCHEN_SINK_CYAN.get().asItem());
        storage.add(ModBlocks.KITCHEN_SINK_PURPLE.get().asItem());
        storage.add(ModBlocks.KITCHEN_SINK_BLUE.get().asItem());
        storage.add(ModBlocks.KITCHEN_SINK_BROWN.get().asItem());
        storage.add(ModBlocks.KITCHEN_SINK_GREEN.get().asItem());
        storage.add(ModBlocks.KITCHEN_SINK_RED.get().asItem());
        storage.add(ModBlocks.KITCHEN_SINK_BLACK.get().asItem());
        storage.add(ModBlocks.COOLER_WHITE.get().asItem());
        storage.add(ModBlocks.COOLER_ORANGE.get().asItem());
        storage.add(ModBlocks.COOLER_MAGENTA.get().asItem());
        storage.add(ModBlocks.COOLER_LIGHT_BLUE.get().asItem());
        storage.add(ModBlocks.COOLER_YELLOW.get().asItem());
        storage.add(ModBlocks.COOLER_LIME.get().asItem());
        storage.add(ModBlocks.COOLER_PINK.get().asItem());
        storage.add(ModBlocks.COOLER_GRAY.get().asItem());
        storage.add(ModBlocks.COOLER_LIGHT_GRAY.get().asItem());
        storage.add(ModBlocks.COOLER_CYAN.get().asItem());
        storage.add(ModBlocks.COOLER_PURPLE.get().asItem());
        storage.add(ModBlocks.COOLER_BLUE.get().asItem());
        storage.add(ModBlocks.COOLER_BROWN.get().asItem());
        storage.add(ModBlocks.COOLER_GREEN.get().asItem());
        storage.add(ModBlocks.COOLER_RED.get().asItem());
        storage.add(ModBlocks.COOLER_BLACK.get().asItem());
        storage.add(ModItems.FRIDGE_LIGHT.get());
        storage.add(ModItems.FRIDGE_DARK.get());

        TagBuilder<Item> items = builder.apply(ModTags.Items.ITEMS);
        items.add(ModItems.SPATULA.get());
        items.add(ModItems.KNIFE.get());
    }
}
