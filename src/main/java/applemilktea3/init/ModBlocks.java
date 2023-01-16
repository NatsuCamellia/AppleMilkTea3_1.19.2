package applemilktea3.init;

import applemilktea3.common.block.MintCropBlock;
import applemilktea3.common.block.WoodBoxBlock;
import applemilktea3.common.item.ModCreativeModeTab;
import applemilktea3.core.AppleMilkTea3;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
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

    public static final RegistryObject<Block> MINT_CROP = BLOCKS.register("mint_crop",
            () -> new MintCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));

    private static <T extends Block> RegistryObject<Block> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<Block> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, ModCreativeModeTab.AMT3_TAB);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, Supplier<T> block, CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
