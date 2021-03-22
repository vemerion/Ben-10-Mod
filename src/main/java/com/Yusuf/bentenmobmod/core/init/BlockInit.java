package com.Yusuf.bentenmobmod.core.init;

import com.Yusuf.bentenmobmod.Main;


import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
			Main.MOD_ID);

	public static final RegistryObject<Block> LEGENDARY_BLOCK = BLOCKS
			.register("legendary_block",
			() -> new Block(AbstractBlock.Properties.create(Material.IRON, MaterialColor.IRON)
					.hardnessAndResistance(8f, 1200f).harvestTool(ToolType.PICKAXE).harvestLevel(3)
					.sound(SoundType.STONE)));
	
	public static final RegistryObject<Block> LEGENDARY_ORE_BLOCK = BLOCKS
			.register("legendary_ore_block",
			() -> new Block(AbstractBlock.Properties.create(Material.IRON, MaterialColor.IRON)
					.hardnessAndResistance(3f, 3f).harvestTool(ToolType.PICKAXE).harvestLevel(3)
					.sound(SoundType.ANCIENT_DEBRIS)));

}
