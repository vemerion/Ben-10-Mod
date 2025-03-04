package com.yusuf.bentenmod.data;

import com.yusuf.bentenmod.Main;
import com.yusuf.bentenmod.core.init.ItemInit;
import com.yusuf.bentenmod.core.init.TagsInit;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.SmithingRecipeBuilder;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ModSmitingRecipeBuild extends RecipeProvider implements IConditionBuilder {
    public ModSmitingRecipeBuild(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void buildShapelessRecipes(Consumer<IFinishedRecipe> consumer) {
        // THIS is where you call `smithing` or other recipe builders..
        // i.e.
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.DIAMOND_SWORD), Ingredient.of(ItemInit.BLACK_DIAMOND.get()), ItemInit.BLACK_DIAMOND_SWORD.get())
        .unlocks("has_item", has(TagsInit.Items.INGOTS_BLACK_DIAMOND))
        .save(consumer,modId("black_diamond_sword"));

        SmithingRecipeBuilder.smithing(Ingredient.of(Items.DIAMOND_AXE), Ingredient.of(ItemInit.BLACK_DIAMOND.get()), ItemInit.BLACK_DIAMOND_AXE.get())
                .unlocks("has_item",has(TagsInit.Items.INGOTS_BLACK_DIAMOND))
                .save(consumer,modId("black_diamond_axe"));

        SmithingRecipeBuilder.smithing(Ingredient.of(Items.DIAMOND_PICKAXE), Ingredient.of(ItemInit.BLACK_DIAMOND.get()), ItemInit.BLACK_DIAMOND_PICKAXE.get())
                .unlocks("has_item", has(TagsInit.Items.INGOTS_BLACK_DIAMOND))
                .save(consumer,modId("black_diamond_pickaxe"));

        SmithingRecipeBuilder.smithing(Ingredient.of(Items.DIAMOND_SHOVEL), Ingredient.of(ItemInit.BLACK_DIAMOND.get()), ItemInit.BLACK_DIAMOND_SHOVEL.get())
                .unlocks("has_item", has(TagsInit.Items.INGOTS_BLACK_DIAMOND))
                .save(consumer,modId("black_diamond_shovel"));

        SmithingRecipeBuilder.smithing(Ingredient.of(Items.DIAMOND_HOE), Ingredient.of(ItemInit.BLACK_DIAMOND.get()), ItemInit.BLACK_DIAMOND_HOE.get())
                .unlocks("has_item", has(TagsInit.Items.INGOTS_BLACK_DIAMOND))
                .save(consumer,modId("black_diamond_hoe"));


        SmithingRecipeBuilder.smithing(Ingredient.of(Items.DIAMOND_HELMET), Ingredient.of(ItemInit.BLACK_DIAMOND.get()), ItemInit.BLACK_DIAMOND_HELMET.get())
                .unlocks("has_item", has(TagsInit.Items.INGOTS_BLACK_DIAMOND))
                .save(consumer,modId("black_diamond_helmet"));

        SmithingRecipeBuilder.smithing(Ingredient.of(Items.DIAMOND_CHESTPLATE), Ingredient.of(ItemInit.BLACK_DIAMOND.get()), ItemInit.BLACK_DIAMOND_CHESTPLATE.get())
                .unlocks("has_item", has(TagsInit.Items.INGOTS_BLACK_DIAMOND))
                .save(consumer,modId("black_diamond_chestplate"));

        SmithingRecipeBuilder.smithing(Ingredient.of(Items.DIAMOND_LEGGINGS), Ingredient.of(ItemInit.BLACK_DIAMOND.get()), ItemInit.BLACK_DIAMOND_LEGGINGS.get())
                .unlocks("has_item", has(TagsInit.Items.INGOTS_BLACK_DIAMOND))
                .save(consumer,modId("black_diamond_leggings"));

        SmithingRecipeBuilder.smithing(Ingredient.of(Items.DIAMOND_BOOTS), Ingredient.of(ItemInit.BLACK_DIAMOND.get()), ItemInit.BLACK_DIAMOND_BOOTS.get())
                .unlocks("has_item",has(TagsInit.Items.INGOTS_BLACK_DIAMOND))
                .save(consumer,modId("black_diamond_boots"));


        SmithingRecipeBuilder.smithing(Ingredient.of(ItemInit.BLACK_DIAMOND_SWORD.get()), Ingredient.of(ItemInit.INFINITUM.get()), ItemInit.INFINITUM_SWORD.get())
                .unlocks("has_item", has(TagsInit.Items.INGOTS_INFINITUM))
                .save(consumer,modId("infinitum_sword"));

        SmithingRecipeBuilder.smithing(Ingredient.of(ItemInit.BLACK_DIAMOND_AXE.get()), Ingredient.of(ItemInit.INFINITUM.get()), ItemInit.INFINITUM_AXE.get())
                .unlocks("has_item", has(TagsInit.Items.INGOTS_INFINITUM))
                .save(consumer,modId("infinitum_axe"));

        SmithingRecipeBuilder.smithing(Ingredient.of(ItemInit.BLACK_DIAMOND_PICKAXE.get()), Ingredient.of(ItemInit.INFINITUM.get()), ItemInit.INFINITUM_PICKAXE.get())
                .unlocks("has_item",has(TagsInit.Items.INGOTS_INFINITUM))
                .save(consumer,modId("infinitum_pickaxe"));

        SmithingRecipeBuilder.smithing(Ingredient.of(ItemInit.BLACK_DIAMOND_SHOVEL.get()), Ingredient.of(ItemInit.INFINITUM.get()), ItemInit.INFINITUM_SHOVEL.get())
                .unlocks("has_item", has(TagsInit.Items.INGOTS_INFINITUM))
                .save(consumer,modId("infinitum_shovel"));

        SmithingRecipeBuilder.smithing(Ingredient.of(ItemInit.BLACK_DIAMOND_HOE.get()), Ingredient.of(ItemInit.INFINITUM.get()), ItemInit.INFINITUM_HOE.get())
                .unlocks("has_item", has(TagsInit.Items.INGOTS_INFINITUM))
                .save(consumer,modId("infinitum_hoe"));



        SmithingRecipeBuilder.smithing(Ingredient.of(ItemInit.BLACK_DIAMOND_HELMET.get()), Ingredient.of(ItemInit.INFINITUM.get()), ItemInit.INFINITUM_HELMET.get())
                .unlocks("has_item", has(TagsInit.Items.INGOTS_INFINITUM))
                .save(consumer,modId("infinitum_helmet"));

        SmithingRecipeBuilder.smithing(Ingredient.of(ItemInit.BLACK_DIAMOND_CHESTPLATE.get()), Ingredient.of(ItemInit.INFINITUM.get()), ItemInit.INFINITUM_CHESTPLATE.get())
                .unlocks("has_item", has(TagsInit.Items.INGOTS_INFINITUM))
                .save(consumer,modId("infinitum_chestplate"));

        SmithingRecipeBuilder.smithing(Ingredient.of(ItemInit.BLACK_DIAMOND_LEGGINGS.get()), Ingredient.of(ItemInit.INFINITUM.get()), ItemInit.INFINITUM_LEGGINGS.get())
                .unlocks("has_item", has(TagsInit.Items.INGOTS_INFINITUM))
                .save(consumer,modId("infinitum_leggings"));

        SmithingRecipeBuilder.smithing(Ingredient.of(ItemInit.BLACK_DIAMOND_BOOTS.get()), Ingredient.of(ItemInit.INFINITUM.get()), ItemInit.INFINITUM_BOOTS.get())
                .unlocks("has_item", has(TagsInit.Items.INGOTS_INFINITUM))
                .save(consumer,modId("infinitum_boots"));





    }
    private static ResourceLocation modId(String path){
        return new ResourceLocation(Main.MOD_ID, path);
    }

}
