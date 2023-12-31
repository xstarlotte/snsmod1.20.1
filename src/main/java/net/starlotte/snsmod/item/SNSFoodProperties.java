package net.starlotte.snsmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class SNSFoodProperties {
    public static final FoodProperties TIER_1 = new FoodProperties.Builder().nutrition(3).saturationMod(0.25f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200), 0.5f)
            .effect(() -> new MobEffectInstance(MobEffects.JUMP, 100), 0.5f)
            .build();
    public static final FoodProperties TIER_2 = new FoodProperties.Builder().nutrition(6).saturationMod(0.50f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 400), 0.75f)
            .effect(() -> new MobEffectInstance(MobEffects.JUMP, 200), 0.75f)
            .build();
}
