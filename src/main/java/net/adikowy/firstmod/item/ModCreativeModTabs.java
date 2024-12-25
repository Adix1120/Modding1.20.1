package net.adikowy.firstmod.item;

import net.adikowy.firstmod.FirstMod;
import net.adikowy.firstmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs
{
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS=
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FirstMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ZBIGNIEW_TAB=CREATIVE_MODE_TABS.register("zbigniew_tab",
            ()-> CreativeModeTab.builder().icon(()->new ItemStack(ModItems.Zbigniew.get()))
                    .title(Component.translatable("creativetab.firstmod_tab"))
                    .displayItems((itemDisplayParameters, output) ->
                    {
                        output.accept(ModItems.Zbigniew.get());
                        output.accept(ModItems.RAW_ZBIGNIEW.get());
                        output.accept(ModBlocks.Block_Zbigniewa.get());
                        output.accept(ModBlocks.RAW_Zgieniew_Block.get());
                        output.accept(ModBlocks.ZBIGNIEW_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_ZBIGNIEW_ORE.get());
                        output.accept(ModBlocks.NETHER_ZBIGNIEW_ORE.get());
                        output.accept(ModBlocks.END_STONE_ZBIGNIEW_ORE.get());
                        output.accept(ModItems.CEBULKA.get());
                        output.accept(ModItems.CZIPS_CEBULA.get());
                        output.accept(ModItems.CRACKED_ZBYSIU.get());
                        output.accept(ModItems.IRON_ROD.get());
                        output.accept(ModItems.ZBIGNIEW_SWORD.get());
                        output.accept(ModItems.ZBIGNIEW_PICKAXE.get());
                        output.accept(ModItems.ZBIGNIEW_AXE.get());
                        output.accept(ModItems.ZBIGNIEW_SHOVEL.get());
                        output.accept(ModItems.ZBIGNIEW_HOE.get());
                        output.accept(ModItems.ZBIGNIEW_HELMET.get());
                        output.accept(ModItems.ZBIGNIEW_CHESTPLATE.get());
                        output.accept(ModItems.ZBIGNIEW_LEGGINGS.get());
                        output.accept(ModItems.ZBIGNIEW_BOOTS.get());
                    })
                    .build());

    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
