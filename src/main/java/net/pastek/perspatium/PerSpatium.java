package net.pastek.perspatium;

import com.mojang.logging.LogUtils;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.pastek.perspatium.entity.client.BurnerRenderer;
import net.pastek.perspatium.entity.client.AscherRenderer;
import net.pastek.perspatium.entity.client.FroostRenderer;
import net.pastek.perspatium.entity.client.MarsRenderer;
import net.pastek.perspatium.registers.PSCreativeTab;
import net.pastek.perspatium.registers.PSBlocks;
import net.pastek.perspatium.registers.PSEntities;
import net.pastek.perspatium.registers.PSItems;
import org.slf4j.Logger;

@Mod(PerSpatium.MOD_ID)
public class PerSpatium
{
    public static final String MOD_ID = "perspatium";
    private static final Logger LOGGER = LogUtils.getLogger();

    public PerSpatium()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        PSCreativeTab.register(modEventBus);
        PSItems.register(modEventBus);
        PSBlocks.register(modEventBus);
        PSEntities.register(modEventBus);

        modEventBus.addListener(this::commonSetup);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        LOGGER.info("Allo la Terre? Ici la Lune!");
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            EntityRenderers.register(PSEntities.BURNER.get(), BurnerRenderer::new);
            EntityRenderers.register(PSEntities.ASCHER.get(), AscherRenderer::new);
            EntityRenderers.register(PSEntities.MARS.get(), MarsRenderer::new);
            EntityRenderers.register(PSEntities.FROOST.get(), FroostRenderer::new);
        }
    }
}

