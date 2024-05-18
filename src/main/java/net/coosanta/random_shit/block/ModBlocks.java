package net.coosanta.random_shit.block;

import net.coosanta.random_shit.RandomShit;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block MOULDY_WOOL = registerBlock("mouldy_wool",
            new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL).mapColor(MapColor.PALE_YELLOW)));
    public static final Block SHITSTAINED_WOOL = registerBlock("shitstained_wool",
            new Block(FabricBlockSettings.copyOf(Blocks.BROWN_WOOL)));

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(RandomShit.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(RandomShit.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks(){
        RandomShit.LOGGER.info("Registering Blocks for "+RandomShit.MOD_ID);
    }
}
