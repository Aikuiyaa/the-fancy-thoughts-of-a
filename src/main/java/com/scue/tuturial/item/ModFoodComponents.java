package com.scue.tuturial.item;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.FoodComponent;
import net.minecraft.entity.effect.StatusEffects;



public class ModFoodComponents {
    public static final FoodComponent REDBULL = new FoodComponent.Builder().hunger(3)
            .saturationModifier(0.7F)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED,400),1.0F)
            .build();

    public static final FoodComponent SMOKEBSTICK = new FoodComponent.Builder().hunger(1)
            .saturationModifier(0.5F)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED,400),1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE,400),1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH,400),1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 300, 0), 0.5F)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 100, 0), 0.3F)
            .build();
}