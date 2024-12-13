package net.thyids.tutorialmod.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.thyids.tutorialmod.Tutorialmod;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Tutorialmod.MODID);

    public static final DeferredItem<Item> TutorialItem = ITEMS.register("tutorialitem",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
