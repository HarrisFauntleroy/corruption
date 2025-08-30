package com.harrisfauntleroy.corruption.tabs;

import com.harrisfauntleroy.corruption.CorruptionMod;
import com.harrisfauntleroy.corruption.blocks.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CorruptionMod.MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> CORRUPTION_TAB =
            CREATIVE_MODE_TABS.register(
                    "corruption_tab",
                    () ->
                            CreativeModeTab.builder()
                                    .title(
                                            Component.translatable(
                                                    "creativetab.corruption.corruption_tab"))
                                    .icon(() -> new ItemStack(ModBlocks.CORRUPTION_BLOCK.get()))
                                    .displayItems(
                                            (parameters, output) -> {
                                                output.accept(
                                                        ModBlocks.CORRUPTION_BLOCK_ITEM.get());
                                            })
                                    .build());
}
