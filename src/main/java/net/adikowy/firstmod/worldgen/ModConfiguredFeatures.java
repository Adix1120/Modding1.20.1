package net.adikowy.firstmod.worldgen;

import net.adikowy.firstmod.FirstMod;
import net.adikowy.firstmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class ModConfiguredFeatures
{

    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_ZBIGNIEW_ORE_KEY= registerKey("zbigniew_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_ZBIGNIEW_ORE_KEY= registerKey("nether_zbigniew_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_ZBIGNIEW_ORE_KEY= registerKey("end_zbigniew_ore");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>>context)
    {
        RuleTest stoneReplaceable=new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceable=new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherrackReplaceable=new BlockMatchTest(Blocks.NETHERRACK);
        RuleTest endReplaceable=new BlockMatchTest(Blocks.END_STONE);

        List<OreConfiguration.TargetBlockState> overworldZbigniewOres = List.of(OreConfiguration.target(stoneReplaceable,
                ModBlocks.ZBIGNIEW_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceable, ModBlocks.DEEPSLATE_ZBIGNIEW_ORE.get().defaultBlockState()));

        register(context,OVERWORLD_ZBIGNIEW_ORE_KEY, Feature.ORE,new OreConfiguration(overworldZbigniewOres,8));
        register(context, NETHER_ZBIGNIEW_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceable,
                ModBlocks.NETHER_ZBIGNIEW_ORE.get().defaultBlockState(),8));
        register(context, END_ZBIGNIEW_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceable,
                ModBlocks.END_STONE_ZBIGNIEW_ORE.get().defaultBlockState(),8));


    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name)
    {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(FirstMod.MOD_ID, name));
    }
    private static <FC extends FeatureConfiguration,F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>>context,
                                                                                         ResourceKey<ConfiguredFeature<?, ?>> key,F feature, FC configuration)
    {
        context.register(key, new ConfiguredFeature<>(feature,configuration));
    }
}
