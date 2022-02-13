package com.MrRetro.CoordsExport.blocks;

import com.MrRetro.CoordsExport.Coords.CustomItem;
import com.MrRetro.CoordsExport.Coords.ModelRegister;
import com.MrRetro.CoordsExport.util.Main;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

import static com.MrRetro.CoordsExport.util.Main.tab;

public class BlockBase extends Block implements ModelRegister {
    public BlockBase(String name, Material material) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tab);
        CustomBlock.blocks.add(this);
        CustomItem.items.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public void SetModel()
    {
        Main.proxy.registerItem(Item.getItemFromBlock(this), 0, "inventory");
    }
}
