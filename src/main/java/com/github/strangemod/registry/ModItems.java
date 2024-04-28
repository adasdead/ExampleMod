package com.github.strangemod.registry;

import com.github.strangemod.StrangeMod;
import com.github.strangemod.item.*;
import com.github.strangemod.item.pill.FlyyyyyPill;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.github.strangemod.registry.plugin.RegisterTypes.register;
import static com.github.strangemod.registry.plugin.RegisterTypes.registerRecord;

@SuppressWarnings("unused")
public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, StrangeMod.MOD_ID);
    public static final RegistryObject<Item> STAFF_OF_LIGHTNING = register("staff_of_lightning", StaffOfLightningItem::new);
    public static final RegistryObject<Item> AWAKENED_IRON_INGOT = register("awakened_iron_ingot", 64);
    public static final RegistryObject<Item> STEEL_INGOT = register("steel_ingot");
    public static final RegistryObject<Item> CHIPS = register("chips", ChipsItem::new);
    public static final RegistryObject<Item> FUNNY_NOKIA = register("funny_nokia", FunnyNokiaItem::new);
    public static final RegistryObject<Item> AWAKENED_PICKAXE = register("awakened_pickaxe", AwakenedPickaxeItem::new);
    public static final RegistryObject<Item> GUY_FAWKES_MASK = register("guy_fawkes_mask", GuyFawkesMaskItem::new);
    public static final RegistryObject<Item> AWAKING_SPHERE = register("awaking_sphere", 1, true);
    public static final RegistryObject<Item> LIGHTBOLT_SPHERE = register("lightbolt_sphere", 1, true);
    public static final RegistryObject<Item> FORK = register("fork", ForkItem::new);

    public static final RegistryObject<Item> POTATO_KNISH = register("potato_knish", PotatoKnishes::new);
   public static final RegistryObject<Item> STAR_FELL_MUSIC_DISC = registerRecord("star_fell_music_disc",
            ModSoundEvents.STAR_FELL,"1m35s");

    public static final RegistryObject<Item> COKE_COAL = register("coke_coal",
            CoalCoke::new);

    public static final RegistryObject<Item> POISONED_SWORD = register("poisoned_sword", PoisonedSwordItem::new);
    public static final RegistryObject<Item> OLD_SWORD = register("old_sword", OldSword::new);
    public static final RegistryObject<Item> POCO = register("poco", PocoPhone::new);


    //Steel Items


    // Pills
    public static final RegistryObject<Item> FLYYYYY_PILL = register("flyyyyy_pill", FlyyyyyPill::new);

    // Maid Dress/Armor
    public static final RegistryObject<Item> MAID_HELMET = ITEMS.register("maid_helmet",
            () -> new MaidDress(ModArmorMaterial.MAID, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> MAID_CHESTPLATE = ITEMS.register("maid_chestplate",
            () -> new MaidDress(ModArmorMaterial.MAID, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> MAID_LEGGINGS = ITEMS.register("maid_leggings",
            () -> new MaidDress(ModArmorMaterial.MAID, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> MAID_BOOTS = ITEMS.register("maid_boots",
            () -> new MaidDress(ModArmorMaterial.MAID, ArmorItem.Type.BOOTS, new Item.Properties()));

}