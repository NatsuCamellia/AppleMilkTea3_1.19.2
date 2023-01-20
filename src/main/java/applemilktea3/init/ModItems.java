package applemilktea3.init;

import applemilktea3.common.item.ModCreativeModeTab;
import applemilktea3.core.AppleMilkTea3;
import net.minecraft.world.food.FoodProperties;
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
    public static final RegistryObject<Item> MILK_CANDY = ITEMS.register("milk_candy",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.3f).build()).tab(ModCreativeModeTab.AMT3_TAB)));
    public static final RegistryObject<Item> YUZU_MARMALADE = ITEMS.register("yuzu_marmalade",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.AMT3_TAB)));
    public static final RegistryObject<Item> YUZU_CANDY = ITEMS.register("yuzu_candy",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.3f).build()).tab(ModCreativeModeTab.AMT3_TAB)));
    public static final RegistryObject<Item> MINT_SAUCE = ITEMS.register("mint_sauce",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.AMT3_TAB)));
    public static final RegistryObject<Item> MINT_CANDY = ITEMS.register("mint_candy",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.3f).build()).tab(ModCreativeModeTab.AMT3_TAB)));

    public static final RegistryObject<Item> MINT = ITEMS.register("mint",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.AMT3_TAB)));
    public static final RegistryObject<Item> YUZU = ITEMS.register("yuzu",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationMod(0.3f).build()).tab(ModCreativeModeTab.AMT3_TAB)));

    public static final RegistryObject<Item> BAKED_APPLE = ITEMS.register("baked_apple", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(0.3f).build()).tab(ModCreativeModeTab.AMT3_TAB)));
    public static final RegistryObject<Item> APPLE_TART = ITEMS.register("apple_tart", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(8).saturationMod(0.3f).build()).tab(ModCreativeModeTab.AMT3_TAB)));
    public static final RegistryObject<Item> YUZU_MOUSSE = ITEMS.register("yuzu_mousse", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(8).saturationMod(0.3f).build()).tab(ModCreativeModeTab.AMT3_TAB)));
    public static final RegistryObject<Item> SANDWICH_APPLE = ITEMS.register("sandwich_apple", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(0.3f).build()).tab(ModCreativeModeTab.AMT3_TAB)));
    public static final RegistryObject<Item> SANDWICH_EGG = ITEMS.register("sandwich_egg", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(0.3f).build()).tab(ModCreativeModeTab.AMT3_TAB)));
    public static final RegistryObject<Item> SANDWICH_YUZU = ITEMS.register("sandwich_yuzu", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(0.3f).build()).tab(ModCreativeModeTab.AMT3_TAB)));
    public static final RegistryObject<Item> TOFFEE_APPLE = ITEMS.register("toffee_apple", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(0.3f).build()).tab(ModCreativeModeTab.AMT3_TAB)));
    public static final RegistryObject<Item> TOFFEE_APPLE_ICY = ITEMS.register("toffee_apple_icy", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(0.3f).build()).tab(ModCreativeModeTab.AMT3_TAB)));
    public static final RegistryObject<Item> TOFFEE_APPLE_WIND = ITEMS.register("toffee_apple_wind", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(0.3f).build()).tab(ModCreativeModeTab.AMT3_TAB)));
    public static final RegistryObject<Item> TOFFEE_APPLE_GOLDEN = ITEMS.register("toffee_apple_golden", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(8).saturationMod(0.3f).build()).tab(ModCreativeModeTab.AMT3_TAB)));
    public static final RegistryObject<Item> TOFFEE_APPLE_GREEN = ITEMS.register("toffee_apple_green", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(0.3f).build()).tab(ModCreativeModeTab.AMT3_TAB)));

    public static final RegistryObject<Item> TEA_LEAF = ITEMS.register("tea_leaf", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.AMT3_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
