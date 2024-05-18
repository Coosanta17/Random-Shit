package net.coosanta.random_shit;

import net.coosanta.random_shit.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RandomShit implements ModInitializer {
	public static final String MOD_ID = "coosantas_random_shit";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		LOGGER.info("Shit just got random!");
	}
}