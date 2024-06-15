package net.coosanta.random_shit.block;

import net.coosanta.random_shit.RandomShit;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.block.MapColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
    public static final Block MOULDY_WOOL = registerBlock("mouldy_wool",
            new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL).mapColor(MapColor.PALE_YELLOW)));
    public static final Block SHITSTAINED_WOOL = registerBlock("shitstained_wool",
            new Block(FabricBlockSettings.copyOf(Blocks.BROWN_WOOL)));
    // Textures of  ^^^ these ^^^ blocks taken (stolen) from https://www.planetminecraft.com/project/the-backrooms-5763207/
    public static final Block SHIT_BLOCK = registerBlock("shit_block",
            new Block(FabricBlockSettings.copyOf(Blocks.MUD)));
    public static final Block DRIED_SHIT_BLOCK = registerBlock("dried_shit_block",
            new Block(FabricBlockSettings.copyOf(Blocks.PACKED_MUD)));

    // Void Block
    public static final Block VOID_ORE = registerBlock("void_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(2f), UniformIntProvider.create(3, 7)));
    public static final Block DEEPSLATE_VOID_ORE = registerBlock("deepslate_void_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(4.5f, 3f), UniformIntProvider.create(5, 9)));
    public static final Block NETHER_VOID_ORE = registerBlock("nether_void_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.NETHERRACK).strength(0.8f), UniformIntProvider.create(3, 7)));
    public static final Block END_VOID_ORE = registerBlock("end_void_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.END_STONE).strength(4f,6f), UniformIntProvider.create(9, 12)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(RandomShit.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(RandomShit.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        RandomShit.LOGGER.info("Registering Blocks for " + RandomShit.MOD_ID);
    }
}