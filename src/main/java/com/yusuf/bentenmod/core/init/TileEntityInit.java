package com.yusuf.bentenmod.core.init;

import com.yusuf.bentenmod.Main;
import com.yusuf.bentenmod.core.machine.alientable.AlienTableTileEntity;
import com.yusuf.bentenmod.core.machine.bententable.TableTileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class TileEntityInit {
    public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, Main.MOD_ID);

    public static final RegistryObject<TileEntityType<TableTileEntity>> TABLE_TE = TILE_ENTITY.register("table_block", () -> TileEntityType.Builder.of(TableTileEntity::new, BlockInit.TABLE_BLOCK.get()).build(null));
    public static final RegistryObject<TileEntityType<AlienTableTileEntity>> ALIEN_TABLE = TILE_ENTITY.register("alien_table", () -> TileEntityType.Builder.of(TableTileEntity::new, BlockInit.ALIEN_TABLE.get()).build(null));


}