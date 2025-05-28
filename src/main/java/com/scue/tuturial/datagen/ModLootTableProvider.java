package com.scue.tuturial.datagen;

import com.scue.tuturial.block.ModBlocks;
import com.scue.tuturial.item.Moditems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {

        addDrop(ModBlocks.ICE_ETHER_BLOCK);
//        addDrop(ModBlocks.ICE_ETHER_ORC,oreDrops(ModBlocks.ICE_ETHER_ORC, Moditems.RAW_ICE_ETHER));
        addDrop(ModBlocks.ICE_ETHER_ORC,likecopperOreDrops(ModBlocks.ICE_ETHER_ORC,Moditems.ICE_ETHER,2,5));
    }

    public LootTable.Builder likecopperOreDrops(Block drop, Item item,int min,int max) {
        return dropsWithSilkTouch(
                drop,
                this.applyExplosionDecay(
                        drop,
                        ItemEntry.builder(item)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(min, max)))
                                .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))
                )
        );
    }
}
