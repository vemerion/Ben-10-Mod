package com.yusuf.bentenmod.core.machine.testtable;

import com.yusuf.bentenmod.core.init.ContainerInit;
import com.yusuf.bentenmod.core.machine.bententable.TableTileEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketBuffer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIntArray;
import net.minecraft.util.IntArray;
import net.yusuf.realyusufismailcore.util.OutputSlot;

import java.util.Objects;

public class TestContainer extends Container {
    private final IIntArray data;

    /**
     * ALT + ENTER > CONSTRUCTOR
     * SHIFT + F6 > CHANGE VARIABLE NAME
     */
    protected TestContainer(int id, PlayerInventory inv, TileEntity te, IIntArray data) {
        super(ContainerInit.TEST_CONTAINER.get(), id);

        this.data = data;

        addSlot(new Slot((IInventory) te, 0, 16, 40));
        addSlot(new Slot((IInventory) te, 1, 43, 40));
        addSlot(new Slot((IInventory) te, 2, 70, 40));
        addSlot(new Slot((IInventory) te, 3, 70, 40));
        addSlot(new Slot((IInventory) te, 4, 70, 40));
        addSlot(new Slot((IInventory) te, 5, 70, 40));
        addSlot(new Slot((IInventory) te, 6, 70, 40));

        addSlot(new OutputSlot((IInventory) te, 3, 138, 40));

        //player inventory
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 9; col++) {
                this.addSlot(new Slot(inv, col + row * 9 + 9, 8 + col * 18, (166 - (4 - row) * 18 - 10) + 13));
            }
        }
        // Player Hotbar
        for (int col = 0; col < 9; col++) {
            this.addSlot(new Slot(inv, col, 8 + col * 18, 142 + 13));
        }
        addDataSlots(data);
    }
    public TestContainer(int id, PlayerInventory playerInv, PacketBuffer buffer) {
        this(id, playerInv, getTileEntity(playerInv, buffer), new IntArray(2));
    }
    private static TestTileEntity getTileEntity(final PlayerInventory playerInv, final PacketBuffer data) {
        Objects.requireNonNull(playerInv, "Player Inventory cannot be null.");
        Objects.requireNonNull(data, "Packet Buffer cannot be null.");
        final TileEntity te = playerInv.player.level.getBlockEntity(data.readBlockPos());
        if (te instanceof TableTileEntity) {
            return (TestTileEntity) te;
        }
        throw new IllegalStateException("Tile Entity Is Not Correct");
    }
    @Override
    public boolean stillValid(PlayerEntity p_75145_1_) {
        return true;
    }
    @Override
    public ItemStack quickMoveStack(PlayerEntity player, int index) {
        ItemStack stack = ItemStack.EMPTY;
        Slot slot = this.slots.get(index);
        if (slot != null && slot.hasItem()) {
            ItemStack stack1 = slot.getItem();
            stack = stack1.copy();
            if (index < TableTileEntity.slots
                    && !this.moveItemStackTo(stack1, TableTileEntity.slots, this.slots.size(), true)) {
                return ItemStack.EMPTY;
            }
            if (!this.moveItemStackTo(stack1, 0, TableTileEntity.slots, false)) {
                return ItemStack.EMPTY;
            }

            if (stack1.isEmpty()) {
                slot.set(ItemStack.EMPTY);
            } else {
                slot.setChanged();
            }
        }
        return stack;
    }


}
