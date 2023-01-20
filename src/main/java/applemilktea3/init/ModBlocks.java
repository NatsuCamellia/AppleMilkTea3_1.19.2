package applemilktea3.init;

import applemilktea3.common.block.*;
import applemilktea3.common.item.ModCreativeModeTab;
import applemilktea3.common.worldgen.feature.tree.TeaTreeGrower;
import applemilktea3.common.worldgen.feature.tree.YuzuTreeGrower;
import applemilktea3.core.AppleMilkTea3;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, AppleMilkTea3.MOD_ID);

    public static final RegistryObject<Block> WOOD_BOX_ACACIA = registerBlock("wood_box_acacia", () -> new WoodBoxBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS)), ModCreativeModeTab.AMT3_TAB);
    public static final RegistryObject<Block> WOOD_BOX_BIRCH = registerBlock("wood_box_birch", () -> new WoodBoxBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS)), ModCreativeModeTab.AMT3_TAB);
    public static final RegistryObject<Block> WOOD_BOX_DARK_OAK = registerBlock("wood_box_dark_oak", () -> new WoodBoxBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)), ModCreativeModeTab.AMT3_TAB);
    public static final RegistryObject<Block> WOOD_BOX_JUNGLE = registerBlock("wood_box_jungle", () -> new WoodBoxBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS)), ModCreativeModeTab.AMT3_TAB);
    public static final RegistryObject<Block> WOOD_BOX_OAK = registerBlock("wood_box_oak", () -> new WoodBoxBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)), ModCreativeModeTab.AMT3_TAB);
    public static final RegistryObject<Block> WOOD_BOX_SPRUCE = registerBlock("wood_box_spruce", () -> new WoodBoxBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS)), ModCreativeModeTab.AMT3_TAB);

    public static final RegistryObject<Block> VEGIBAG_POTATO = registerBlock("vegibag_potato", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).destroyTime(0F)), ModCreativeModeTab.AMT3_TAB);
    public static final RegistryObject<Block> VEGIBAG_CARROT = registerBlock("vegibag_carrot", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).destroyTime(0F)), ModCreativeModeTab.AMT3_TAB);
    public static final RegistryObject<Block> VEGIBAG_PUMPKIN = registerBlock("vegibag_pumpkin", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).destroyTime(0F)), ModCreativeModeTab.AMT3_TAB);
    public static final RegistryObject<Block> VEGIBAG_SEED = registerBlock("vegibag_seed", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).destroyTime(0F)), ModCreativeModeTab.AMT3_TAB);
    public static final RegistryObject<Block> VEGIBAG_SUGARCANE = registerBlock("vegibag_sugarcane", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).destroyTime(0F)), ModCreativeModeTab.AMT3_TAB);
    public static final RegistryObject<Block> VEGIBAG_CACTUS = registerBlock("vegibag_cactus", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).destroyTime(0F)), ModCreativeModeTab.AMT3_TAB);
    public static final RegistryObject<Block> VEGIBAG_COCOA = registerBlock("vegibag_cocoa", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).destroyTime(0F)), ModCreativeModeTab.AMT3_TAB);
    public static final RegistryObject<Block> VEGIBAG_WART = registerBlock("vegibag_wart", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).destroyTime(0F)), ModCreativeModeTab.AMT3_TAB);
    public static final RegistryObject<Block> VEGIBAG_SUGAR = registerBlock("vegibag_sugar", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).destroyTime(0F)), ModCreativeModeTab.AMT3_TAB);

    public static final RegistryObject<Block> MINT_CROP = BLOCKS.register("mint_crop",
            () -> new MintCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));

    public static final RegistryObject<Block> YUZU_LOG = registerBlock("yuzu_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).requiresCorrectToolForDrops()), ModCreativeModeTab.AMT3_TAB);
    public static final RegistryObject<Block> YUZU_LEAVES = registerBlock("yuzu_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 60;
                }
            }, ModCreativeModeTab.AMT3_TAB);
    public static final RegistryObject<Block> YUZU_SAPLING = registerBlock("yuzu_sapling",
            () -> new SaplingBlock(new YuzuTreeGrower(),BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)), ModCreativeModeTab.AMT3_TAB);
    public static final RegistryObject<Block> TEA_SAPLING = registerBlock("tea_sapling",
            () -> new SaplingBlock(new TeaTreeGrower(),BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)), ModCreativeModeTab.AMT3_TAB);

    public static final RegistryObject<Block> TEA_TREE = registerBlock("tea_tree",
            () -> new TeaTreeBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES), ModItems.TEA_LEAF), ModCreativeModeTab.AMT3_TAB);
    private static <T extends Block> RegistryObject<Block> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<Block> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, ModCreativeModeTab.AMT3_TAB);
        return toReturn;
    }

    private static final RegistryObject<Block> MONITOR = registerBlock("monitor", () -> new MonitorBlock(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), ModCreativeModeTab.AMT3_TAB);

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, Supplier<T> block, CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
