package com.maya.penguins.items;

import com.maya.penguins.PenguinMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item PENGUIN_SPAWN_EGG = registerItem("penguin_spawn_egg", new Item(new Item.Settings()));
    public static final Item PENGUIN_FEATHER = registerItem("penguin_feather", new Item(new Item.Settings()));
    public static final Item SHRIMP = registerItem("shrimp", new Item(new Item.Settings()));
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(PenguinMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        PenguinMod.LOGGER.info("Register mod items for" + PenguinMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.SPAWN_EGGS).register(entries -> {
            entries.add(PENGUIN_SPAWN_EGG);

        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(PENGUIN_FEATHER);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
            entries.add(SHRIMP);
        });
    }
}
