package net.pastek.perspatium.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.pastek.perspatium.PerSpatium;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = PerSpatium.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Datagen {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(event.includeServer(), PerSpatiumLootTableProvider.create(packOutput));

        generator.addProvider(event.includeClient(), new PerSpatiumBlockStateProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new PerSpatiumItemModelProvider(packOutput, existingFileHelper));
        PerSpatiumTagGenerator blockTagGenerator = generator.addProvider(event.includeServer(),
                new PerSpatiumTagGenerator(packOutput, lookupProvider, existingFileHelper));
    }
}