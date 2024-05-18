package net.coosanta.random_shit.item;

import net.coosanta.random_shit.RandomShit;
import net.coosanta.random_shit.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup COOSANTAS_RANDOM_SHIT = Registry.register(Registries.ITEM_GROUP,
            new Identifier(RandomShit.MOD_ID, "coosantas_random_shit"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.coosantas_random_shit"))
                    .icon(() -> new ItemStack(ModItems.SHIT)).entries((displayContext, entries) -> {
                        entries.add(ModItems.SHIT);
                        entries.add(ModItems.TROLLFACE);
                        entries.add(ModItems.SKULLEMOJI);

                        entries.add(ModBlocks.MOULDY_WOOL);

                    }).build());

    public static void registerItemGroup(){
        RandomShit.LOGGER.info("Registering Item Group for "+RandomShit.MOD_ID);
    }
}
