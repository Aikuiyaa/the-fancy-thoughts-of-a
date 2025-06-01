package com.scue.tuturial.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponets {
    public static  final FoodComponent CIGERATTE = new FoodComponent.Builder()
                                                     .hunger(3)
                                                     .saturationModifier(0.6f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED,200),1)
                                                     .build();

    public static  final FoodComponent SUPERCIGERATTE = new FoodComponent.Builder()
            .hunger(3)
            .saturationModifier(0.6f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED,200),1)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,200),1)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH,200),1)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE,200),1)
            .build();
}
