package com.MrRetro.CoordsExport.Coords;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Tabs extends CreativeTabs {
    public Tabs(int a, String b) {
        super(a, b);
    }

    public ItemStack getTabIconItem() {
        return new ItemStack(Items.FISH);
    }
}
