package net.adikowy.firstmod.item;

import net.adikowy.firstmod.FirstMod;
import net.adikowy.firstmod.item.custom.FuelItem;
import net.minecraft.world.item.*;
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

    public static final RegistryObject<Item> CEBULKA=ITEMS.register("cebulka",
            ()-> new Item(new Item.Properties().food(ModFoods.CEBULKA)));

    public static final RegistryObject<Item> CZIPS_CEBULA=ITEMS.register("czips_cebula",
            ()-> new Item(new Item.Properties().food(ModFoods.CZIPS_CEBULA)));

    public static final RegistryObject<Item> CRACKED_ZBYSIU=ITEMS.register("cracked_zbysiu",
            ()-> new FuelItem(new Item.Properties(),200));

    public static final RegistryObject<Item> ZBIGNIEW_SWORD=ITEMS.register("zbigniew_sword",
            ()-> new SwordItem(ModToolTiers.ZBIGNIEW,5,-2.4f,new Item.Properties()));

    public static final RegistryObject<Item> ZBIGNIEW_PICKAXE=ITEMS.register("zbigniew_pickaxe",
            ()-> new PickaxeItem(ModToolTiers.ZBIGNIEW,1,-1,new Item.Properties()));

    public static final RegistryObject<Item> ZBIGNIEW_AXE=ITEMS.register("zbigniew_axe",
            ()-> new AxeItem(ModToolTiers.ZBIGNIEW,6,-3.0f,new Item.Properties()));

    public static final RegistryObject<Item> ZBIGNIEW_SHOVEL=ITEMS.register("zbigniew_shovel",
            ()-> new ShovelItem(ModToolTiers.ZBIGNIEW,0,-1,new Item.Properties()));

    public static final RegistryObject<Item> ZBIGNIEW_HOE=ITEMS.register("zbigniew_hoe",
            ()-> new HoeItem(ModToolTiers.ZBIGNIEW,0,-1,new Item.Properties()));

    public static final RegistryObject<Item> ZBIGNIEW_HELMET=ITEMS.register("zbigniew_helmet",
            ()-> new ArmorItem(ModArmorMaterials.ZBIGNIEW, ArmorItem.Type.HELMET,new Item.Properties()));

    public static final RegistryObject<Item> ZBIGNIEW_CHESTPLATE=ITEMS.register("zbigniew_chestplate",
            ()-> new ArmorItem(ModArmorMaterials.ZBIGNIEW, ArmorItem.Type.CHESTPLATE,new Item.Properties()));

    public static final RegistryObject<Item> ZBIGNIEW_LEGGINGS=ITEMS.register("zbigniew_leggings",
            ()-> new ArmorItem(ModArmorMaterials.ZBIGNIEW, ArmorItem.Type.LEGGINGS,new Item.Properties()));

    public static final RegistryObject<Item> ZBIGNIEW_BOOTS=ITEMS.register("zbigniew_boots",
            ()-> new ArmorItem(ModArmorMaterials.ZBIGNIEW, ArmorItem.Type.BOOTS,new Item.Properties()));

    public static final RegistryObject<Item> IRON_ROD=ITEMS.register("iron_rod",
            ()-> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
