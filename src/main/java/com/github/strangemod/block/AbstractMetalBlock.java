package com.github.strangemod.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;

public abstract class AbstractMetalBlock extends Block {
    public AbstractMetalBlock() {
        super(Properties.of()
                .instrument(NoteBlockInstrument.BASEDRUM)
                .requiresCorrectToolForDrops()
                .strength(2.0F, 2.0F)
                .sound(SoundType.METAL)
                .noOcclusion());
    }

    public static class Impl extends AbstractMetalBlock {
    }
}
