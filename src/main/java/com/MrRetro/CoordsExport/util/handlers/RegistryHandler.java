package com.MrRetro.CoordsExport.util.handlers;

import com.MrRetro.CoordsExport.Coords.CustomItem;
import com.MrRetro.CoordsExport.Coords.ModelRegister;
import com.MrRetro.CoordsExport.blocks.CustomBlock;
import com.MrRetro.CoordsExport.util.Reference;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class RegistryHandler {
    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event)
    {
        event.getRegistry().registerAll(CustomItem.items.toArray(new Item[0]));
    }

    @SubscribeEvent
    public static void onBlockRegister(RegistryEvent.Register<Block> event)
    {
        event.getRegistry().registerAll(CustomBlock.blocks.toArray(new Block[0]));
    }

    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event)
    {

        for (Item item : CustomItem.items)
            if (item instanceof ModelRegister)
                ((ModelRegister)item).SetModel();

        for (Block block : CustomBlock.blocks)
            if (block instanceof ModelRegister)
                ((ModelRegister)block).SetModel();
    }
}
