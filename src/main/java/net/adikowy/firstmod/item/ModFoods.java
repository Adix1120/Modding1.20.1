package net.adikowy.firstmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods
{
    public static final FoodProperties CEBULKA=new FoodProperties.Builder().nutrition(6).fast()
            .saturationMod(2.5f).effect(()-> new MobEffectInstance(MobEffects.REGENERATION,100),1)
            .effect(()->new MobEffectInstance(MobEffects.DIG_SPEED,200,1),1).build();
    public static final FoodProperties CZIPS_CEBULA=new FoodProperties.Builder().nutrition(4).fast()
            .saturationMod(2).effect(()-> new MobEffectInstance(MobEffects.JUMP,100,2),1)
            .effect(()->new MobEffectInstance(MobEffects.MOVEMENT_SPEED,100,1),1).build();
}
