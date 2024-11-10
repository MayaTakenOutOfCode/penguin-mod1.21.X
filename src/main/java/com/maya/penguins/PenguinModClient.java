package com.maya.penguins;

import com.maya.penguins.items.ModItems;
import net.fabricmc.api.ClientModInitializer;

public class PenguinModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        //init client
        ModItems.registerModItems();
    }
}
