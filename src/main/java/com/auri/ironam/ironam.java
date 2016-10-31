package com.auri.ironam;

import com.auri.ironam.proxy.CommonProxy;
import com.auri.ironam.recipies.ModRecipies;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = ironam.MODID, version = ironam.VERSION)
public class ironam
{
    @SidedProxy(serverSide = "com.auri.ironam.proxy.CommonProxy", clientSide = "com.auri.ironam.proxy.ClientProxy")
    public static CommonProxy proxy;
    public static final String MODID = "ironam";
    public static final String VERSION = "1.0";
    public static final String name = "Ironam";



    @Mod.Instance(MODID)
    public static ironam instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        CommonProxy.init();
        ModItems.init();
        ModRecipies.init();
        ModBlocks.init();
        System.out.print("[" + System.nanoTime() + "] [Ironam] Loading!\n");
    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }

}
