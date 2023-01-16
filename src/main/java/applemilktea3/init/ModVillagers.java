package applemilktea3.init;

import applemilktea3.core.AppleMilkTea3;
import com.google.common.collect.ImmutableSet;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.util.ObfuscationReflectionHelper;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.lang.reflect.InvocationTargetException;

public class ModVillagers {
    public static final DeferredRegister<PoiType> POI_TYPES =
            DeferredRegister.create(ForgeRegistries.POI_TYPES, AppleMilkTea3.MOD_ID);
    public static final DeferredRegister<VillagerProfession> VILLAGER_PROFESSIONS =
            DeferredRegister.create(ForgeRegistries.VILLAGER_PROFESSIONS, AppleMilkTea3.MOD_ID);

    public static final RegistryObject<PoiType> CAFE_POI = POI_TYPES.register("cafe_poi",
            () -> new PoiType(ImmutableSet.copyOf(ModBlocks.WOOD_BOX_OAK.get().getStateDefinition().getPossibleStates()),
                    1, 1));

    public static final RegistryObject<VillagerProfession> CAFE_MASTER = VILLAGER_PROFESSIONS.register("cafe_master",
            () -> new VillagerProfession("cafe_master", x -> x.get() == CAFE_POI.get(),
                    x -> x.get() == CAFE_POI.get(), ImmutableSet.of(), ImmutableSet.of(),
                    SoundEvents.VILLAGER_WORK_FARMER));
    public static void registerPOIs() {
        try {
            ObfuscationReflectionHelper.findMethod(PoiType.class,
                    "registerBlockStates", PoiType.class).invoke(null, CAFE_POI.get());
        } catch (InvocationTargetException | IllegalAccessException exception) {
            exception.printStackTrace();
        }
    }

    public static void register(IEventBus eventBus) {
        POI_TYPES.register(eventBus);
        VILLAGER_PROFESSIONS.register(eventBus);
    }
}
