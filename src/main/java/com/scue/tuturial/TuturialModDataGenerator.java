package com.scue.tuturial;

import com.scue.tuturial.block.ModBlocks;
import com.scue.tuturial.datagen.*;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class TuturialModDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
			FabricDataGenerator.Pack pack= fabricDataGenerator.createPack();
			pack.addProvider(ModRecipesProvider::new);
			pack.addProvider(ModModelsProvider::new);
			pack.addProvider(ModBlockTagProvider::new);
			pack.addProvider(ModItemsTagProvider::new);
			pack.addProvider(ModEnUsProvider::new);
			pack.addProvider(ModLootTableProvider::new);

	}
}
