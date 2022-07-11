package com.sholooloo.myass.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab MYASS_TAB = new CreativeModeTab("asstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.NUT.get());
        }
    };
}
