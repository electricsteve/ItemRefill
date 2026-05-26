package dev.electricsteve.itemrefill;


import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class ItemRefill {
    public ItemRefill(IEventBus eventBus) {
        CommonClass.init();
    }
}