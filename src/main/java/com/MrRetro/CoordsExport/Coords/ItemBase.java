package com.MrRetro.CoordsExport.Coords;

import com.MrRetro.CoordsExport.util.Main;
import net.minecraft.item.Item;

import static com.MrRetro.CoordsExport.util.Main.tab;

public class ItemBase extends Item implements ModelRegister {

    public ItemBase(String name)
    {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tab);
        CustomItem.items.add(this);
    }

    @Override
    public void SetModel()
    {
        Main.proxy.registerItem(this, 0, "inventory");
    }

}
