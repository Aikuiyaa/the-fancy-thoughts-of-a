package com.scue.tuturial.datagen;

import com.scue.tuturial.TuturialMod;
import com.scue.tuturial.block.ModBlocks;
import com.scue.tuturial.item.Moditems;
import com.scue.tuturial.tags.ModBlockTags;
import com.scue.tuturial.tags.ModItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipesProvider extends FabricRecipeProvider {
    public ModRecipesProvider(FabricDataOutput output) {
        super(output);
    }

    List<ItemConvertible> inputs = List.of(Moditems.RAW_ICE_ETHER, ModBlocks.ICE_ETHER_ORC);

    @Override
    public void generate(Consumer<RecipeJsonProvider> consumer) {

        offerReversibleCompactingRecipes(consumer, RecipeCategory.BUILDING_BLOCKS, Moditems.ICE_ETHER, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ICE_ETHER_BLOCK);

        offerSmelting(consumer, inputs, RecipeCategory.MISC, Moditems.ICE_ETHER, 0.35f, 200, "ice_ether");

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Moditems.RAW_ICE_ETHER, 1)
                .input(Moditems.ICE_ETHER)
                .input(Moditems.CARDBOARD)
                .criterion(hasItem(Moditems.ICE_ETHER), conditionsFromItem(Moditems.ICE_ETHER))
                .offerTo(consumer, new Identifier(TuturialMod.MOD_ID, "needcardboard_raw_ice_ether"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, Items.SUGAR, 3)
                .pattern("###")
                .pattern("AAA")
                .input('#', Items.BEETROOT)
                .input('A', Moditems.CARDBOARD)
                .criterion(hasItem(Moditems.CARDBOARD), conditionsFromItem(Moditems.CARDBOARD))
                .offerTo(consumer);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,Moditems.SUPERCIGARETTE,1)
                .pattern("#A#")
                .input('#',Items.PAPER)
                .input('A',ModItemTags.MOD_FOOD)
                .criterion(hasItem(Items.PAPER),conditionsFromItem(Items.PAPER))
                .offerTo(consumer);





        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.TBLOCK2, 1)
                .pattern("###")
                .pattern(" A ")
                .input('#', ModItemTags.ICE_EHTER_TAG)
                .input('A', Items.DIAMOND)
                .criterion(hasItem(Moditems.CARDBOARD), conditionsFromItem(Moditems.CARDBOARD))
                .offerTo(consumer);
    }
}
