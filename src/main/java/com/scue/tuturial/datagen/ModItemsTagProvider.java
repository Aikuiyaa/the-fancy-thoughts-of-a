package com.scue.tuturial.datagen;

import com.scue.tuturial.item.Moditems;
import com.scue.tuturial.tags.ModItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModItemsTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemsTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
            getOrCreateTagBuilder(ModItemTags.ICE_EHTER_TAG)
                    .add(Moditems.CARDBOARD)
                    .add(Moditems.ICE_ETHER)
                    .add(Moditems.RAW_ICE_ETHER);

        getOrCreateTagBuilder(ModItemTags.MOD_FOOD)
                .add(Moditems.CIGARETTE);
    }
}
