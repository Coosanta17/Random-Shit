package net.coosanta.random_shit.item;

import net.coosanta.random_shit.RandomShit;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item TROLLFACE = registerItem("trollface", new Item(new FabricItemSettings()));
    public static final Item SKULLEMOJI = registerItem("skull_emoji", new Item(new FabricItemSettings()));
    public static final Item SHIT = registerItem("random_shit", new Item(new FabricItemSettings()));

    private static void addItemsToRandomShitItemGroup(FabricItemGroupEntries entries){
        entries.add(TROLLFACE);
        entries.add(SKULLEMOJI);
        entries.add(SHIT);
    }

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(RandomShit.MOD_ID, name), item);
    }

    public static void registerModItems(){
        RandomShit.LOGGER.info("Registering mod items for "+RandomShit.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToRandomShitItemGroup);
    }
}
