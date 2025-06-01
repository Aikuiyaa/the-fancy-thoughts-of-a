package com.scue.tuturial.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.realms.dto.PlayerActivity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Prospector extends Item {
    public Prospector(Settings settings) {
        super(settings);
    }
    public ActionResult useOnBlock(ItemUsageContext context) {
        BlockPos pos= context.getBlockPos();
        PlayerEntity player = context.getPlayer();
        World world = context.getWorld();
       if (!world.isClient){
           boolean foundblock = false;

        if(Screen.hasControlDown()) {   //只实现模糊搜索
            for (int y = 0; y <= pos.getY() + 64 && !foundblock; y++) {
                for (int x = -2; x <= 2 && !foundblock; x++) {
                    for (int z = -2; z <= 2 && !foundblock; z++) {
                        BlockPos newpos = pos.down(y).north(z).west(x);
                        BlockState blockState = world.getBlockState(newpos);

                        if (RightBlock(blockState)) {
                            foundblock = true; // 标记已找到
                            if (player != null) {
                                player.sendMessage(Text.of("找到钻石"));
                            }
                        }
                    }
                }
            }

            // 如果所有循环结束后仍未找到钻石
            if (!foundblock && player != null) {
                player.sendMessage(Text.of("未找到钻石"));
            }
        }


        //实现精准搜索
           for (int y = 0; y <= pos.getY() + 64 && !foundblock; y++) {
               BlockPos newpos = pos.down(y);
               BlockState blockState = world.getBlockState(newpos);

               if (RightBlock(blockState)) {
                   foundblock = true; // 标记已找到
                   if (player != null) {
                       player.sendMessage(Text.of("精准找到钻石"));
                   }
               }

               if (!foundblock && player != null) {
                   player.sendMessage(Text.of("未精准找到钻石"));
               }
           }

           // 如果所有循环结束后仍未找到钻石


           
        
       }

        return ActionResult.PASS;

    }

    public boolean RightBlock(BlockState b1){
        return b1.isIn(BlockTags.DIAMOND_ORES);

    }


}