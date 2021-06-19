package com.yusuf.bentenmod.core.machine.alientable;

import com.yusuf.bentenmod.Main;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.LockableLootTileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.NonNullList;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class AlienTableTileEntity extends LockableLootTileEntity implements ITickableTileEntity {

    public static final int slots = 10;
    public static final ITextComponent TITLE = new TranslationTextComponent("container." + Main.MOD_ID, ".alien_table");

}
