package com.scue.tuturial.datagen;

import com.scue.tuturial.TuturialMod;
import com.scue.tuturial.block.ModBlocks;
import com.scue.tuturial.tags.ModBlockTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
         getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                 .add(ModBlocks.ICE_ETHER_ORC)
                 .add(ModBlocks.ICE_ETHER_BLOCK);
         getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                 .add(ModBlocks.ICE_ETHER_ORC)
                 .add(ModBlocks.ICE_ETHER_BLOCK);
         getOrCreateTagBuilder(ModBlockTags.ICE_ETHER_BLOCKTAG)
                 .add(ModBlocks.ICE_ETHER_BLOCK)
                 .add(ModBlocks.ICE_ETHER_ORC);


    }
}
