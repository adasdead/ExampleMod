package com.github.strangemod.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;

public class OldSword extends SwordItem {
    public OldSword(Tier p_43269_, int p_43270_, float p_43271_, Properties p_43272_) {
        super(p_43269_, p_43270_, p_43271_, p_43272_);

    }

    private static final Item.Properties PROPERTIES = new Item.Properties()
            .stacksTo(1).durability(1760);

    public OldSword(){super(Tiers.DIAMOND, 3, 96.0f, PROPERTIES);}
}

