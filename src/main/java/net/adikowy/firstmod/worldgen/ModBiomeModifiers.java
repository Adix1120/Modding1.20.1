package net.adikowy.firstmod.worldgen;

import net.adikowy.firstmod.FirstMod;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBiomeModifiers
{

    public static final ResourceKey<BiomeModifier> ADD_ZBIGNIEW_ORE= registerKey("add_zbigniew_ore");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_ZBIGNIEW_ORE= registerKey("add_nether_zbigniew_ore");
    public static final ResourceKey<BiomeModifier> ADD_END_ZBIGNIEW_ORE= registerKey("add_end_zbigniew_ore");

    public static void bootstrap(BootstapContext<BiomeModifier> context)
    {
        var placedFeatures=context.lookup(Registries.PLACED_FEATURE);
        var biomes=context.lookup(Registries.BIOME);

        context.register(ADD_ZBIGNIEW_ORE,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.ZBIGNIEW_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_NETHER_ZBIGNIEW_ORE,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.NETHER_ZBIGNIEW_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_END_ZBIGNIEW_ORE,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.END_ZBIGNIEW_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

    }


    private static ResourceKey<BiomeModifier> registerKey(String name)
    {
        return ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(FirstMod.MOD_ID, name));
    }
}
