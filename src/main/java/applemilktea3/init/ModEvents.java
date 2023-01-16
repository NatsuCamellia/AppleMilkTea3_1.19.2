package applemilktea3.init;

import applemilktea3.core.AppleMilkTea3;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

@Mod.EventBusSubscriber(modid = AppleMilkTea3.MOD_ID)
public class ModEvents {
    @SubscribeEvent
    public static void addCustomTrades(VillagerTradesEvent event) {
        if (event.getType() == ModVillagers.CAFE_MASTER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ModItems.MINT_SEEDS.get(), 1);

            trades.get(1).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(ModItems.MINT_SEEDS.get(), 1),
                    10, 8, 0.2F));
            trades.get(2).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(Items.PUMPKIN_PIE, 4),
                    10, 8, 0.2F));
        }
    }
}
