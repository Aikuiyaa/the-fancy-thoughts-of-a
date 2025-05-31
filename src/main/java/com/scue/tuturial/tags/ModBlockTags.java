package com.scue.tuturial.tags;

import com.scue.tuturial.TuturialMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModBlockTags {
    public static final TagKey<Block> ICE_ETHER_BLOCKTAG=creatTags("ice_ether_block_tag");
    private static TagKey<Block> creatTags(String id) {
        return TagKey.of(RegistryKeys.BLOCK, new Identifier(TuturialMod.MOD_ID, id));

    }


}
