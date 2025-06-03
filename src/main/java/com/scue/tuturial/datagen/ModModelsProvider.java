package com.scue.tuturial.datagen;

import com.scue.tuturial.block.ModBlocks;
import com.scue.tuturial.item.Moditems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelsProvider extends FabricModelProvider {
    public ModModelsProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ICE_ETHER_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ICE_ETHER_ORC);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TBLOCK2);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(Moditems.ICE_ETHER, Models.GENERATED);
        itemModelGenerator.register(Moditems.RAW_ICE_ETHER, Models.GENERATED);
        itemModelGenerator.register(Moditems.CARDBOARD, Models.GENERATED);
        itemModelGenerator.register(Moditems.REDBULL,Models.GENERATED);
        itemModelGenerator.register(Moditems.SMOKESTICK,Models.GENERATED);
    }
}
