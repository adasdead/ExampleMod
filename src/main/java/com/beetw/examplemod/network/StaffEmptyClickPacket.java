package com.beetw.examplemod.network;

import com.beetw.examplemod.item.StaffOfLightningItem;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketBuffer;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkEvent;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;
import java.util.function.Supplier;

@SuppressWarnings({"unused", "InstantiationOfUtilityClass"})
public class StaffEmptyClickPacket {
    @Contract(value = "_ -> new", pure = true)
    public static @NotNull StaffEmptyClickPacket decode(PacketBuffer buf) {
        return new StaffEmptyClickPacket();
    }

    public static void encode(StaffEmptyClickPacket msg, PacketBuffer buf) {
    }

    public static class Handler {
        public static void handle(StaffEmptyClickPacket msg,
                                  @NotNull Supplier<NetworkEvent.Context> ctx) {

            ctx.get().enqueueWork(() -> handleWork(ctx));
            ctx.get().setPacketHandled(true);
        }

        private static void handleWork(@NotNull Supplier<NetworkEvent.Context> ctx) {
            PlayerEntity player = Objects.requireNonNull(ctx.get().getSender());
            ItemStack itemInHand = player.getMainHandItem();

            if (!itemInHand.isEmpty() && (itemInHand.getItem() instanceof StaffOfLightningItem)) {
                World world = Objects.requireNonNull(ctx.get().getSender()).getLevel();
                ((StaffOfLightningItem) itemInHand.getItem()).onEmptyClick(world, player);
            }
        }
    }

}
