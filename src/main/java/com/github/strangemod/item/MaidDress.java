package com.github.strangemod.item;


import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

import static net.minecraft.world.effect.MobEffects.*;


public class MaidDress extends ArmorItem {
    public MaidDress(ArmorMaterial p_40386_, Type p_266831_, Properties p_40388_) {
        super(p_40386_, p_266831_, p_40388_);
    }
   @Override
    public void inventoryTick(@NotNull ItemStack itemStack,
    @NotNull Level level,
    @NotNull Entity entity,
    int itemSlot,
    boolean isSelected) {
       if (Inventory.ALL_ARMOR_SLOTS[0] == itemSlot && entity instanceof Player)
           ((Player)entity).addEffect(new MobEffectInstance(HEALTH_BOOST, 10, 0));
       if (Inventory.ALL_ARMOR_SLOTS[1] == itemSlot && entity instanceof Player)
           ((Player)entity).addEffect(new MobEffectInstance(DIG_SPEED, 10, 0));
       if (Inventory.ALL_ARMOR_SLOTS[2] == itemSlot && entity instanceof Player)
           ((Player)entity).addEffect(new MobEffectInstance(DAMAGE_RESISTANCE, 10, 0));
        if (Inventory.ALL_ARMOR_SLOTS[3] == itemSlot && entity instanceof Player)
            ((Player)entity).addEffect(new MobEffectInstance(MOVEMENT_SPEED, 10, 0));
    }
}