package dev.electricsteve.itemrefill;

import dev.electricsteve.itemrefill.platform.Services;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Items;

public class CommonClass {
    public static void init() {
        Constants.LOG.debug("Hello from Common init on {}! we are currently in a {} environment!", Services.PLATFORM.getPlatformName(), Services.PLATFORM.getEnvironmentName());
    }
}