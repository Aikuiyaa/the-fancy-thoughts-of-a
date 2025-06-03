package com.scue.tuturial.item;

import com.scue.tuturial.TuturialMod;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class Moditems {
    public static final Item ICE_ETHER = new Item(new Item.Settings());
    public static final Item RAW_ICE_ETHER = new Item(new Item.Settings());
    public static final Item CARDBOARD = new Item(new Item.Settings());
    public static final Item REDBULL = new Item(new Item.Settings().food(ModFoodComponents.REDBULL));
    public static final Item SMOKESTICK = new Item(new Item.Settings().food(ModFoodComponents.SMOKEBSTICK));

    public static void registerModItems() {
        Registry.register(Registries.ITEM, new Identifier(TuturialMod.MOD_ID, "ice_ether"), ICE_ETHER);
        Registry.register(Registries.ITEM, new Identifier(TuturialMod.MOD_ID, "raw_ice_ether"), RAW_ICE_ETHER);
        Registry.register(Registries.ITEM, new Identifier(TuturialMod.MOD_ID, "material/cardboard"), CARDBOARD);
        Registry.register(Registries.ITEM, new Identifier(TuturialMod.MOD_ID, "redbull"), REDBULL);
        Registry.register(Registries.ITEM, new Identifier(TuturialMod.MOD_ID, "smokestick"), SMOKESTICK);
    }
}
