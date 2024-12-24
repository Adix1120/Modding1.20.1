package net.adikowy.firstmod.block;

import net.adikowy.firstmod.FirstMod;
import net.adikowy.firstmod.block.custom.ZbigniewBlock;
import net.adikowy.firstmod.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks
{
    public static final DeferredRegister<Block> BLOCKS=
            DeferredRegister.create(ForgeRegistries.BLOCKS, FirstMod.MOD_ID);

    public static final RegistryObject<Block> Block_Zbigniewa = registerBlock("zbigniew_block",
            () -> new ZbigniewBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_BLOCK)
                    .sound(SoundType.ANCIENT_DEBRIS), 15));

    public static final RegistryObject<Block> RAW_Zgieniew_Block = registerBlock("raw_zbigniew_block",
            () -> new ZbigniewBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_BLOCK)
                    .sound(SoundType.BONE_BLOCK), 10));



    public static final RegistryObject<Block> ZBIGNIEW_ORE= registerBlock("zbigniew_ore",
            ()-> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.5f)
                    .requiresCorrectToolForDrops(), UniformInt.of(2,8)));
    public static final RegistryObject<Block> DEEPSLATE_ZBIGNIEW_ORE= registerBlock("deepslate_zbigniew_ore",
            ()-> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).strength(2.5f)
                    .requiresCorrectToolForDrops(), UniformInt.of(2,9)));
    public static final RegistryObject<Block> NETHER_ZBIGNIEW_ORE= registerBlock("nether_zbigniew_ore",
            ()-> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK).strength(2.0f)
                    .requiresCorrectToolForDrops(), UniformInt.of(2,7)));
    public static final RegistryObject<Block> END_STONE_ZBIGNIEW_ORE= registerBlock("end_stone_zbigniew_ore",
            ()-> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE).strength(3.0f)
                    .requiresCorrectToolForDrops(), UniformInt.of(4,10)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block)
    {
        RegistryObject<T> toReturn= BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block)
    {
        return ModItems.ITEMS.register(name, ()-> new BlockItem(block.get(),new Item.Properties()));
    }

    public static void register(IEventBus eventBus)
    {
        BLOCKS.register(eventBus);
    }
}
