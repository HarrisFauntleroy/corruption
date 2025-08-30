package com.harrisfauntleroy.corruption.blocks;

import com.harrisfauntleroy.corruption.CorruptionMod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(CorruptionMod.MODID);
    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(CorruptionMod.MODID);

    public static final DeferredBlock<CorruptionBlock> CORRUPTION_BLOCK =
            BLOCKS.register(
                    "corruption_block",
                    () ->
                            new CorruptionBlock(
                                    BlockBehaviour.Properties.of()
                                            .strength(0.5F)
                                            .sound(SoundType.SLIME_BLOCK)
                                            .randomTicks()));

    public static final DeferredItem<BlockItem> CORRUPTION_BLOCK_ITEM =
            ITEMS.register(
                    "corruption_block",
                    () -> new BlockItem(CORRUPTION_BLOCK.get(), new Item.Properties()));

    public static void register() {
        // This method can be called to trigger static initialization
    }
}
