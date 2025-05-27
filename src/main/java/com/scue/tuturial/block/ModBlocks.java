package com.scue.tuturial.block;

import com.scue.tuturial.TuturialMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block ICE_ETHER_ORC = register("ice_ether_orc",new Block(AbstractBlock.Settings.copy(Blocks.STONE)));
    public static final Block TBLOCK = register("tblock",new Block(AbstractBlock.Settings.create().requiresTool().hardness(0.2f)));
    public static final Block TBLOCK2 = register("tblock2",new Block(AbstractBlock.Settings.create().hardness(0.3f)));

    public static Block register(String id, Block block) {
        registerblockItem(id,block);
        return Registry.register(Registries.BLOCK, new Identifier(TuturialMod.MOD_ID,id), block);
    }

    public static void registerblockItem(String id,Block block){
        Registry.register(Registries.ITEM, new Identifier(TuturialMod.MOD_ID,id),
                                    new BlockItem(block,new Item.Settings()));
    }

    public static void ModBlockRegister(){

    }
}
