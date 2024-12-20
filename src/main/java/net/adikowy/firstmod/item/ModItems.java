package net.adikowy.firstmod.item;

import net.adikowy.firstmod.FirstMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS=
            DeferredRegister.create(ForgeRegistries.ITEMS, FirstMod.MOD_ID);
    public static final RegistryObject<Item> Zbigniew = ITEMS.register("zbigniew",() -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_ZBIGNIEW=ITEMS.register("raw_zbigniew",
            ()-> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }

}
