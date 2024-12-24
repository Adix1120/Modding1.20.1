package net.adikowy.firstmod.item;

import net.adikowy.firstmod.FirstMod;
import net.adikowy.firstmod.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers
{
    public static final Tier ZBIGNIEW = TierSortingRegistry.registerTier
            (
            new ForgeTier(3, 1800,7,5,15,
                    ModTags.Blocks.NEEDS_ZBIGNIEW_TOOL,()-> Ingredient.of(ModItems.Zbigniew.get())),
            new ResourceLocation(FirstMod.MOD_ID, "zbigniew"), List.of(Tiers.DIAMOND),List.of()
            );

}
