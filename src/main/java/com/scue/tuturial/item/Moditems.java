package com.scue.tuturial.item;

import com.scue.tuturial.TuturialMod;

import com.scue.tuturial.custom.Prospector;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class Moditems {
    public static final Item ICE_ETHER = new Item(new Item.Settings());
    public static final Item RAW_ICE_ETHER = new Item(new Item.Settings());
    public static final Item CARDBOARD = new Item(new Item.Settings());
    public static final Item CIGARETTE = new Item(new Item.Settings().food(ModFoodComponets.CIGERATTE));
    public static final Item SUPERCIGARETTE = new Item(new Item.Settings().food(ModFoodComponets.SUPERCIGERATTE));
    public static final Item PROSPECTOR = new Prospector(new Item.Settings());
    public static void registerModItems() {
        Registry.register(Registries.ITEM, new Identifier(TuturialMod.MOD_ID, "ice_ether"), ICE_ETHER);
        Registry.register(Registries.ITEM, new Identifier(TuturialMod.MOD_ID, "raw_ice_ether"), RAW_ICE_ETHER);
        Registry.register(Registries.ITEM, new Identifier(TuturialMod.MOD_ID, "material/cardboard"), CARDBOARD);
        Registry.register(Registries.ITEM,new Identifier(TuturialMod.MOD_ID, "cigarette"), CIGARETTE);
        Registry.register(Registries.ITEM,new Identifier(TuturialMod.MOD_ID, "supercigarette"), SUPERCIGARETTE);
        Registry.register(Registries.ITEM,new Identifier(TuturialMod.MOD_ID,"prospector"),PROSPECTOR);
    }
}
