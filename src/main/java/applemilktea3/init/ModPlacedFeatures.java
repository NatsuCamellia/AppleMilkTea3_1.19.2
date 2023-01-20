package applemilktea3.init;

import applemilktea3.core.AppleMilkTea3;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModPlacedFeatures {
    public static final DeferredRegister<PlacedFeature> PLACED_FEATURE =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, AppleMilkTea3.MOD_ID);
    public static final RegistryObject<PlacedFeature> YUZU_CHECKED = PLACED_FEATURE.register("yuzu_checked",
            () -> new PlacedFeature(ModConfiguredFeatures.YUZU.getHolder().get(),
                    List.of(PlacementUtils.filteredByBlockSurvival(ModBlocks.YUZU_SAPLING.get()))));

    public static final RegistryObject<PlacedFeature> YUZU_PLACED = PLACED_FEATURE.register("yuzu_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.YUZU_SPAWN.getHolder().get(), VegetationPlacements.treePlacement(
                            PlacementUtils.countExtra(3, 0.1F, 2))));

    public static final RegistryObject<PlacedFeature> TEA_TREE_CHECKED = PLACED_FEATURE.register("tea_tree_checked",
            () -> new PlacedFeature(ModConfiguredFeatures.TEA_TREE.getHolder().get(),
                    List.of(PlacementUtils.filteredByBlockSurvival(ModBlocks.TEA_SAPLING.get()))));

    public static final RegistryObject<PlacedFeature> TEA_TREE_PLACED = PLACED_FEATURE.register("tea_tree_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.TEA_TREE_SPAWN.getHolder().get(), VegetationPlacements.treePlacement(
                    PlacementUtils.countExtra(1, 0.05F, 2))));
    public static void register(IEventBus eventBus) {
        PLACED_FEATURE.register(eventBus);
    }
}
