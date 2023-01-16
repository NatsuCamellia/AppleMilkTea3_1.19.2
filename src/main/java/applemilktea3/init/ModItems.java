package applemilktea3.init;

import applemilktea3.common.item.ModCreativeModeTab;
import applemilktea3.core.AppleMilkTea3;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AppleMilkTea3.MOD_ID);

    public static final RegistryObject<Item> MINT_SEEDS = ITEMS.register("mint_seeds",
            () -> new ItemNameBlockItem(ModBlocks.MINT_CROP.get(),
                    new Item.Properties().tab(ModCreativeModeTab.AMT3_TAB)));

    public static final RegistryObject<Item> CONDENSED_MILK = ITEMS.register("condensed_milk",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.AMT3_TAB)));

    public static final RegistryObject<Item> MINT_SAUCE = ITEMS.register("mint_sauce",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.AMT3_TAB)));

    public static final RegistryObject<Item> MINT = ITEMS.register("mint",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.AMT3_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
