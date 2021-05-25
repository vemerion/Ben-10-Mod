package com.yusuf.bentenmobmod.data.loot;

import com.yusuf.bentenmobmod.Main;
import com.yusuf.bentenmobmod.core.init.BlockInit;
import com.yusuf.bentenmobmod.core.init.ItemInit;
import net.minecraft.block.Block;
import net.minecraft.data.loot.BlockLootTables;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.stream.Collectors;

public class ModBlockLootTables extends BlockLootTables {
    @Override
    protected void addTables() {
        //ores
        registerLootTable(BlockInit.BLACK_DIAMOND_ORE.get(),
                droppingItemWithFortune(BlockInit.BLACK_DIAMOND_ORE.get(), ItemInit.BLACK_DIAMOND_SCRAP.get()));
        registerLootTable(BlockInit.INFINITUM_ORE.get(),
                droppingItemWithFortune(BlockInit.INFINITUM_ORE.get(), ItemInit.INFINITUM_SCRAP.get()));
        registerLootTable(BlockInit.RUBY_ORE.get(),
                droppingItemWithFortune(BlockInit.RUBY_ORE.get(), ItemInit.RUBY.get()));
        registerLootTable(BlockInit.OMNITRIX_ORE.get(),
                droppingItemWithFortune(BlockInit.OMNITRIX_ORE.get(), ItemInit.OMNITRIX.get()));
        registerLootTable(BlockInit.SPEED_ORE.get(),
                droppingItemWithFortune(BlockInit.SPEED_ORE.get(), ItemInit.SPEED.get()));
        registerLootTable(BlockInit.LEGENDARY_ORE_BLOCK.get(),
                droppingItemWithFortune(BlockInit.LEGENDARY_ORE_BLOCK.get(), ItemInit.LEGENDARY_ORE.get()));
        registerLootTable(BlockInit.FIRE_ORE.get(),
                droppingItemWithFortune(BlockInit.FIRE_ORE.get(), ItemInit.FIRE.get()));

        //blocks
        registerDropSelfLootTable(BlockInit.OMNITRIX_BLOCK.get());
        registerDropSelfLootTable(BlockInit.FIRE_BLOCK.get());
        registerDropSelfLootTable(BlockInit.RUBY_BLOCK.get());
        registerDropSelfLootTable(BlockInit.SPEED_BLOCK.get());
        registerDropSelfLootTable(BlockInit.INFINITUM_BLOCK.get());
        registerDropSelfLootTable(BlockInit.BLACK_DIAMOND_BLOCK.get());
        registerDropSelfLootTable(BlockInit.IMPERIUM_ORE.get());
        registerDropSelfLootTable(BlockInit.VILGAX_BLOCK.get());
        registerDropSelfLootTable(BlockInit.LEGENDARY_BLOCK.get());



    }
    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ForgeRegistries.BLOCKS.getValues().stream()
                .filter(block -> Main.MOD_ID.equals(block.getRegistryName().getNamespace()))
                .collect(Collectors.toSet());
    }
    }

