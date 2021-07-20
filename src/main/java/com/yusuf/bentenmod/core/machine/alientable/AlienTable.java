package com.yusuf.bentenmod.core.machine.alientable;

import com.yusuf.bentenmod.common.LangKeys;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CraftingTableBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.IWorldPosCallable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.network.NetworkHooks;

import javax.annotation.Nullable;
import java.util.List;

/**
 * @see CraftingTableBlock
 */
public class AlienTable extends Block {
   //private static final ITextComponent CONTAINER_TITLE = new TranslationTextComponent("container.alien_table");

    /**
     * @see TranslationTextComponent
     * @see Container
     */

    public AlienTable() {
        super(Properties.of(Material.HEAVY_METAL)
                .strength(3)
                .harvestTool(ToolType.AXE)
                .harvestLevel(2)
                .requiresCorrectToolForDrops()
                .sound(SoundType.NETHER_ORE)
        );
    }

    @Override
    public ActionResultType use(BlockState p_225533_1_, World level, BlockPos pos, PlayerEntity playerEntity, Hand p_225533_5_, BlockRayTraceResult p_225533_6_) {
        if (!level.isClientSide()) {
            INamedContainerProvider containerProvider = new INamedContainerProvider() {
                @Override
                public ITextComponent getDisplayName() {
                    return LangKeys.ALIEN_TABLE_SCREEN;
                }
                @Nullable
                @Override
                public AlienTableContainer createMenu(int id, PlayerInventory playerInventory, PlayerEntity playerEntity) {
                    return new AlienTableContainer(id, playerInventory, IWorldPosCallable.NULL);

                }
            };
            NetworkHooks.openGui((ServerPlayerEntity) playerEntity, containerProvider, pos);
        }
        return ActionResultType.SUCCESS;
}

    @Override
    public void appendHoverText(ItemStack p_190948_1_, @Nullable IBlockReader p_190948_2_, List<ITextComponent> p_190948_3_, ITooltipFlag p_190948_4_) {
        p_190948_3_.add(LangKeys.ALIEN_TABLE_DISC);
    }
}

