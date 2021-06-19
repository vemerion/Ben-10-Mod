
package com.yusuf.bentenmod.core.machine.alientable;

import com.yusuf.bentenmod.core.init.TileEntityInit;
import com.yusuf.bentenmod.core.machine.bententable.TableTileEntity;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.inventory.container.SimpleNamedContainerProvider;
import net.minecraft.inventory.container.WorkbenchContainer;
import net.minecraft.stats.Stats;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.IWorldPosCallable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.ToolType;

public class AlienTable extends Block {
    private static final ITextComponent CONTAINER_TITLE = new TranslationTextComponent("container.crafting");

    public AlienTable() {
        super(Properties.of(Material.HEAVY_METAL)
                .strength(3)
                .harvestTool(ToolType.PICKAXE)
                .harvestLevel(1)
                .requiresCorrectToolForDrops()
                .sound(SoundType.NETHER_ORE)
        );
    }

    public ActionResultType use(BlockState p_225533_1_, World p_225533_2_, BlockPos p_225533_3_, PlayerEntity p_225533_4_, Hand p_225533_5_, BlockRayTraceResult p_225533_6_) {
        if (p_225533_2_.isClientSide) {
            return ActionResultType.SUCCESS;
        } else {
            p_225533_4_.openMenu(p_225533_1_.getMenuProvider(p_225533_2_, p_225533_3_));
            p_225533_4_.awardStat(Stats.INTERACT_WITH_CRAFTING_TABLE);
            return ActionResultType.CONSUME;
        }
    }

    @Override
    public INamedContainerProvider getMenuProvider(BlockState p_220052_1_, World p_220052_2_, BlockPos p_220052_3_) {
        return new SimpleNamedContainerProvider((p_220270_2_, p_220270_3_, p_220270_4_) -> {
            return new WorkbenchContainer(p_220270_2_, p_220270_3_, IWorldPosCallable.create(p_220052_2_, p_220052_3_));
        }, CONTAINER_TITLE);
    }
        

}



//TODO Start making it