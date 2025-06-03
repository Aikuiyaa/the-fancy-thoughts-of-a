package com.scue.tuturial.datagen;

import com.scue.tuturial.block.ModBlocks;
import com.scue.tuturial.item.ModItemGroups;
import com.scue.tuturial.item.Moditems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class ModEnUsProvider extends FabricLanguageProvider {
    public ModEnUsProvider(FabricDataOutput dataOutput) {
        super(dataOutput,"en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(Moditems.ICE_ETHER,"Ice Ether");
        translationBuilder.add(Moditems.CARDBOARD,"SpeedAC");
        translationBuilder.add(Moditems.RAW_ICE_ETHER,"Raw Ice Ether");
        translationBuilder.add(ModItemGroups.Mod_Test,"Group1");
        translationBuilder.add("ItemGroup.t2","Group2");
        translationBuilder.add(ModBlocks.ICE_ETHER_BLOCK,"Ice Ether Block");
        translationBuilder.add(ModBlocks.ICE_ETHER_ORC,"Ice Ether Orc");
        translationBuilder.add(ModBlocks.TBLOCK2,"Cow Block");
        translationBuilder.add(Moditems.REDBULL,"Redd Bull");
        translationBuilder.add(Moditems.SMOKESTICK,"Smoke Stick");


    }
}
