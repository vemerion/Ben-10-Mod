package com.yusuf.bentenmod.data;

import com.yusuf.bentenmod.Main;
import com.yusuf.bentenmod.core.init.BlockInit;
import com.yusuf.bentenmod.core.init.TagsInit;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockTagsProvider extends BlockTagsProvider {

    public ModBlockTagsProvider(DataGenerator generatorIn, ExistingFileHelper existingFileHelper) {
        super(generatorIn, Main.MOD_ID, existingFileHelper);
    }


    @Override
    protected void addTags() {
        //ores
        tag(TagsInit.Blocks.ORES_BLACK_DIAMOND).add(BlockInit.BLACK_DIAMOND_ORE.get());
        tag(Tags.Blocks.ORES).addTag(TagsInit.Blocks.ORES_BLACK_DIAMOND);

        tag(TagsInit.Blocks.ORES_FIRE).add(BlockInit.FIRE_ORE.get());
        tag(Tags.Blocks.ORES).addTag(TagsInit.Blocks.ORES_FIRE);

        tag(TagsInit.Blocks.ORES_OMNITRIX).add(BlockInit.OMNITRIX_ORE.get());
        tag(Tags.Blocks.ORES).addTag(TagsInit.Blocks.ORES_OMNITRIX);

        tag(TagsInit.Blocks.ORES_INFINITUM).add(BlockInit.INFINITUM_ORE.get());
        tag(Tags.Blocks.ORES).addTag(TagsInit.Blocks.ORES_INFINITUM);

        tag(TagsInit.Blocks.ORES_RUBY).add(BlockInit.RUBY_ORE.get());
        tag(Tags.Blocks.ORES).addTag(TagsInit.Blocks.ORES_RUBY);

        tag(TagsInit.Blocks.ORES_SPEED).add(BlockInit.SPEED_ORE.get());
        tag(Tags.Blocks.ORES).addTag(TagsInit.Blocks.ORES_SPEED);

        tag(TagsInit.Blocks.ORES_IMPERIUM).add(BlockInit.IMPERIUM_ORE.get());
        tag(Tags.Blocks.ORES).addTag(TagsInit.Blocks.ORES_IMPERIUM);

        tag(TagsInit.Blocks.ORES_LEGENDARY_ORE_BLOCK).add(BlockInit.LEGENDARY_BLOCK.get());
        tag(Tags.Blocks.ORES).addTag(TagsInit.Blocks.ORES_LEGENDARY_ORE_BLOCK);

        tag(TagsInit.Blocks.ORES_BLACK_DIAMOND).add(BlockInit.BLACK_DIAMOND_ORE.get());
        tag(Tags.Blocks.ORES).addTag(TagsInit.Blocks.ORES_BLACK_DIAMOND);

        tag(TagsInit.Blocks.ORES_DEEPSLATE_LEGENDARY_ORE_BLOCK).add(BlockInit.DEEPSLATE_LEGENDARY_ORE_BLOCK.get());
        tag(Tags.Blocks.ORES).addTag(TagsInit.Blocks.ORES_DEEPSLATE_LEGENDARY_ORE_BLOCK);

        tag(TagsInit.Blocks.ORES_DEEPSLATE_BLACK_DIAMOND).add(BlockInit.DEEPSLATE_BLACK_DIAMOND_ORE.get());
        tag(Tags.Blocks.ORES).addTag(TagsInit.Blocks.ORES_DEEPSLATE_BLACK_DIAMOND);

        tag(TagsInit.Blocks.ORES_DEEPSLATE_OMNITRIX).add(BlockInit.DEEPSLATE_OMNITRIX_ORE.get());
        tag(Tags.Blocks.ORES).addTag(TagsInit.Blocks.ORES_DEEPSLATE_OMNITRIX);

        tag(TagsInit.Blocks.ORES_DEEPSLATE_RUBY).add(BlockInit.DEEPSLATE_RUBY_ORE.get());
        tag(Tags.Blocks.ORES).addTag(TagsInit.Blocks.ORES_DEEPSLATE_RUBY);

        tag(TagsInit.Blocks.ORES_BLACK_DIAMOND).add(BlockInit.BLACK_DIAMOND_ORE.get());
        tag(Tags.Blocks.ORES).addTag(TagsInit.Blocks.ORES_BLACK_DIAMOND);

        tag(TagsInit.Blocks.ORES_DEEPSLATE_SPEED).add(BlockInit.DEEPSLATE_SPEED_ORE.get());
        tag(Tags.Blocks.ORES).addTag(TagsInit.Blocks.ORES_DEEPSLATE_SPEED);

        tag(TagsInit.Blocks.ORES_DEEPSLATE_IMPERIUM).add(BlockInit.DEEPSLATE_IMPERIUM_ORE.get());
        tag(Tags.Blocks.ORES).addTag(TagsInit.Blocks.ORES_DEEPSLATE_IMPERIUM);
      

        //blocks
        tag(TagsInit.Blocks.STORAGE_LEGENDARY).add(BlockInit.LEGENDARY_BLOCK.get());
        tag(Tags.Blocks.ORES).addTag(TagsInit.Blocks.STORAGE_LEGENDARY);

        tag(TagsInit.Blocks.STORAGE_OMNITRIX).add(BlockInit.OMNITRIX_BLOCK.get());
        tag(Tags.Blocks.ORES).addTag(TagsInit.Blocks.STORAGE_OMNITRIX);

        tag(TagsInit.Blocks.STORAGE_INFINITUM).add(BlockInit.INFINITUM_BLOCK.get());
        tag(Tags.Blocks.ORES).addTag(TagsInit.Blocks.STORAGE_INFINITUM);

        tag(TagsInit.Blocks.STORAGE_FIRE).add(BlockInit.FIRE_BLOCK.get());
        tag(Tags.Blocks.ORES).addTag(TagsInit.Blocks.STORAGE_FIRE);

        tag(TagsInit.Blocks.STORAGE_SPEED).add(BlockInit.SPEED_BLOCK.get());
        tag(Tags.Blocks.ORES).addTag(TagsInit.Blocks.STORAGE_SPEED);

        tag(TagsInit.Blocks.STORAGE_BLACK_DIAMOND).add(BlockInit.BLACK_DIAMOND_BLOCK.get());
        tag(Tags.Blocks.ORES).addTag(TagsInit.Blocks.STORAGE_BLACK_DIAMOND);

    }
}

