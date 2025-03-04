/*
package com.yusuf.bentenmod.data.client;


import com.yusuf.bentenmod.Main;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {


    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, Main.MOD_ID, existingFileHelper);
    }


    @Override
    protected void registerModels() {

            block("infinitum_ore");
            block("black_diamond_block");
            block("black_diamond_ore");
            block("fire_block");
            block("fire_ore");
            block("legendary_block");
            block("omnitrix_block");
            block("speed_block");
            block("ruby_block");
            block("ruby_ore");
            block("infinitum_block");
            block("speed_ore");
            block("omnitrix_ore");
            block("imperium_ore");
            block("legendary_ore_block");
            block("imperium_block");
            block("deepslate_legendary_ore_block");
            block("deepslate_ruby_ore");
            block("deepslate_black_diamond_ore");
            block("deepslate_imperium_ore");
            block("deepslate_speed_ore");
            block("deepslate_omnitrix_ore");


            ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));
            ModelFile itemhandHeld = getExistingFile(mcLoc("item/handheld"));

            //items
            builder(itemGenerated, "black_diamond");
            builder(itemGenerated, "black_diamond_scrap");
            builder(itemGenerated, "infinitum");
            builder(itemGenerated, "infinitum_scrap");
            builder(itemGenerated, "boot");
            builder(itemGenerated, "chestplate");
            builder(itemGenerated, "legendary_ore");
            builder(itemGenerated, "omnitrix");
            builder(itemGenerated, "fire");
            builder(itemGenerated, "ruby");
            builder(itemGenerated, "speed");
            builder(itemGenerated, "helmet");
            builder(itemGenerated, "leggings");
            builder(itemGenerated, "jacket");
            builder(itemGenerated, "heatblast_helmet");
            builder(itemGenerated, "heatblast_chestplate");
            builder(itemGenerated, "heatblast_leggings");
            builder(itemGenerated, "heatblast_boot");
            builder(itemGenerated, "xlr8_helmet");
            builder(itemGenerated, "xlr8_chestplate");
            builder(itemGenerated, "xlr8_leggings");
            builder(itemGenerated, "xlr8_boot");
            builder(itemGenerated, "omnitrix_apple");
            builder(itemGenerated, "enchanted_omnitrix_apple");
            builder(itemGenerated, "fire_apple");
            builder(itemGenerated, "ruby_apple");
            builder(itemGenerated, "vilgax_spawn_egg");
            builder(itemGenerated, "black_diamond_helmet");
            builder(itemGenerated, "black_diamond_chestplate");
            builder(itemGenerated, "black_diamond_leggings");
            builder(itemGenerated, "black_diamond_boots");
            builder(itemGenerated, "infinitum_helmet");
            builder(itemGenerated, "infinitum_chestplate");
            builder(itemGenerated, "infinitum_leggings");
            builder(itemGenerated, "infinitum_boots");
            builder(itemGenerated, "fourarms_helmet");
            builder(itemGenerated, "fourarms_chestplate");
            builder(itemGenerated, "fourarms_leggings");
            builder(itemGenerated, "fourarms_boot");
            builder(itemGenerated, "imperium");
            builder(itemGenerated, "raw_legendary");
            builder(itemGenerated, "raw_omnitrix");
            builder(itemGenerated, "raw_imperium");


            //tools
            tool(itemhandHeld, "axe");
            tool(itemhandHeld, "sword");
            tool(itemhandHeld, "heatblast_sword");
            tool(itemhandHeld, "black_diamond_sword");
            tool(itemhandHeld, "black_diamond_pickaxe");
            tool(itemhandHeld, "black_diamond_shovel");
            tool(itemhandHeld, "black_diamond_axe");
            tool(itemhandHeld, "black_diamond_hoe");
            tool(itemhandHeld, "infinitum_sword");
            tool(itemhandHeld, "infinitum_axe");
            tool(itemhandHeld, "infinitum_pickaxe");
            tool(itemhandHeld, "infinitum_shovel");
            tool(itemhandHeld, "infinitum_hoe");
            tool(itemhandHeld, "imperium_sword");
            tool(itemhandHeld, "imperium_pickaxe");
            tool(itemhandHeld, "imperium_pickaxe_upgraded");
            tool(itemhandHeld, "imperium_axe");

        }

        private ItemModelBuilder builder(ModelFile itemGenerated, String name) {
            return getBuilder(name).parent(itemGenerated).texture("layer0", "item/" + name);
        }

        private ItemModelBuilder tool(ModelFile itemhandHeld, String name) {
            return getBuilder(name).parent(itemhandHeld).texture("layer0", "item/" + name);
        }

        private void block(String name) {
            withExistingParent(name, modLoc("block/" + name));
        }

        /**
         * @see BlockStateProvider#simpleBlock(Block, net.minecraftforge.client.model.generators.ConfiguredModel...)
         * @see BlockStateProvider#getVariantBuilder(Block)
         * @see VariantBlockStateBuilder#partialState()
         * @see VariantBlockStateBuilder#setModels(VariantBlockStateBuilder.PartialBlockstate, ConfiguredModel...)
         * @see Blocks#FURNACE
         *
     //
    }

    */
