package applemilktea3.common.item;

import applemilktea3.init.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab AMT3_TAB = new CreativeModeTab("applemilktea3_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.MINT.get());
        }
    };
}
