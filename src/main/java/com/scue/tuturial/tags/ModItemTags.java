package com.scue.tuturial.tags;

import com.scue.tuturial.TuturialMod;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModItemTags {
    public static final TagKey<Item> ICE_EHTER_TAG = creatTags("ice_ether_tag");

    private static TagKey<Item> creatTags(String id) {
        return TagKey.of(RegistryKeys.ITEM, new Identifier(TuturialMod.MOD_ID,id));
    }
}


