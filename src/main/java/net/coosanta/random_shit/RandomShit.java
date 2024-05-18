package net.coosanta.random_shit;

import net.coosanta.random_shit.block.ModBlocks;
import net.coosanta.random_shit.item.ModItemGroup;
import net.coosanta.random_shit.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RandomShit implements ModInitializer {
	public static final String MOD_ID = "coosantas_random_shit";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroup();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		LOGGER.info("\nShit just got random!");
	}
}