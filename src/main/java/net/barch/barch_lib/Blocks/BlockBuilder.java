package net.barch.barch_lib.Blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;

/**
 * In this class are contained the utils for creating blocks.
 * So far the only one is {@link BlockBuilder#CloneBlock(Block)}
 */
public class BlockBuilder {

    private static AbstractBlock.Settings Settings;


    /**
     * A warning: this only runs .sounds, .strength, .resistance, .mapColor, and .slipperiness methods
     * @param block The block to clone the stats of.
     * @return the FabricBlockSettings
     */
    public static AbstractBlock.Settings CloneBlock(Block block) {


        Settings = Block.Settings.create()
                .sounds(block.getDefaultState().getSoundGroup())
                .strength(block.getHardness())
                .resistance(block.getBlastResistance())
                .mapColor(block.getDefaultMapColor())
                .slipperiness(block.getSlipperiness());

        return Settings;

    };

}