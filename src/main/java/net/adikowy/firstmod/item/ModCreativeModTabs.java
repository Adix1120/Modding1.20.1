package net.adikowy.firstmod.item;

import net.adikowy.firstmod.FirstMod;
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
                    })
                    .build());

    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
