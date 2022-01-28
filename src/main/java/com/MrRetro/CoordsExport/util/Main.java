package com.MrRetro.CoordsExport.util;

import com.MrRetro.CoordsExport.Coords.Exporter;
import com.MrRetro.CoordsExport.Coords.Tabs;
import com.MrRetro.CoordsExport.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.init.Items;
import java.lang.String;
@Mod(
        modid = "coordsexporter",
        version = "0.1",
        name = "Coords Exporter"
)
public class Main {
    @Instance
    public static Main instance;
    @SidedProxy(
            clientSide = "com.MrRetro.CoordsExport.proxy.ClientProxy",
            serverSide = "com.MrRetro.CoordsExport.proxy.CommonProxy"
    )
    public static CommonProxy proxy;
    public static Tabs tab;
    public Main() {
    }

    @EventHandler
    public static void preInit(FMLPreInitializationEvent event) {

        tab = new Tabs(CreativeTabs.getNextID(), "Yeee");
        proxy.preInit(event);
    }


    @EventHandler
    public static void Init(FMLInitializationEvent event) {
        proxy.Init(event);
    }

    @EventHandler
    public static void PostInit(FMLPostInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new Exporter());
        proxy.PostInit(event);
    }
}
