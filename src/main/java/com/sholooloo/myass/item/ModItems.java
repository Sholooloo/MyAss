package com.sholooloo.myass.item;

import com.sholooloo.myass.MyAss;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MyAss.MODID);

    public static final RegistryObject<Item> NUT = ITEMS.register("nut",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MYASS_TAB)
                    .food(new FoodProperties.Builder().nutrition(3).saturationMod(4).build())
            ));
    public static final RegistryObject<Item> ROASTED_NUT = ITEMS.register("roasted_nut",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MYASS_TAB)
                    .food(new FoodProperties.Builder().nutrition(8).saturationMod(10).build())
            ));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
