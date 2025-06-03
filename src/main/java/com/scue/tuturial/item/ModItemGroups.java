package com.scue.tuturial.item;

import com.scue.tuturial.TuturialMod;
import com.scue.tuturial.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {


    private static RegistryKey<ItemGroup> register(String id) {
        return RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(TuturialMod.MOD_ID,id));
    }




    public static final ItemGroup Mod_Test2 = Registry.register(
            Registries.ITEM_GROUP,
            new Identifier(TuturialMod.MOD_ID, "mod_test2"),
            ItemGroup.create(null,-1)
                    .displayName(Text.translatable("ItemGroup.t2"))
                    .icon(()->new ItemStack(Moditems.RAW_ICE_ETHER))
                    .entries((displayContext, entries) -> {
                        entries.add(Moditems.ICE_ETHER);
                        entries.add(ModBlocks.ICE_ETHER_ORC);
                        entries.add(ModBlocks.ICE_ETHER_BLOCK);
                        entries.add(ModBlocks.TBLOCK2);
                        entries.add(Moditems.REDBULL);
                        entries.add(Moditems.SMOKESTICK);
                    }).build()
    );


    public static final RegistryKey<ItemGroup> Mod_Test = register("mod_test");
    public static void ModRegister(){
        Registry.register(
                Registries.ITEM_GROUP,
                Mod_Test,
                ItemGroup.create(null,-1)
                        .displayName(Text.translatable("itemGroup.tuturial_group"))
                        .icon(()->new ItemStack(Moditems.ICE_ETHER))
                        .entries((displayContext, entries) -> {
                            entries.add(Moditems.ICE_ETHER);
                            entries.add(Moditems.RAW_ICE_ETHER);
                            entries.add(Moditems.CARDBOARD);
                        }).build());

    }

}
