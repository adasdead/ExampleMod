package com.github.strangemod.item;


import com.github.strangemod.registry.ModSoundEvents;


import com.github.strangemod.util.Tooltips;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.awt.event.KeyEvent;
import java.util.List;


public class PocoPhone extends Item   {
    private static final Item.Properties PROPERTIES = new Item.Properties()
            .stacksTo(1).durability(1);


    public PocoPhone() {
        super(new Properties());
    }


    @Override
    public @NotNull InteractionResult useOn(UseOnContext pContext) {
        Player player = Minecraft.getInstance().player;
        Level playerLevel = player.level();
        BlockPos pos = Minecraft.getInstance().player.getOnPos();
        BlockState blockState = playerLevel.getBlockState(pos);

         if (blockState.is(Blocks.REDSTONE_BLOCK)) {
            pContext.getLevel().playSeededSound(player, player.getX(), player.getY(), player.getZ(), ModSoundEvents.OMAGAD_POCO.get(), SoundSource.BLOCKS, 1f, 1f, 0);
            playerLevel.explode(null, player.getX(), player.getY(), player.getZ(), 1f, true, Level.ExplosionInteraction.TNT);
         }
        return InteractionResult.SUCCESS;

    }
    @Override
    public void appendHoverText(@NotNull ItemStack stack,
                                @Nullable Level world,
                                @NotNull List<Component> components,
                                @NotNull TooltipFlag flag) {

        Tooltips.Appender appender = Tooltips.appender(components);
        appender.translate("tooltip.strange_mod.poco.0");
        appender.translate("tooltip.strange_mod.poco.1");

        super.appendHoverText(stack, world, components, flag);
    }

}



