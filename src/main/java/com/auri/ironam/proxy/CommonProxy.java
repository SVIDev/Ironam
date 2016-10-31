package com.auri.ironam.proxy;

import com.auri.ironam.EventHandlerCommon;
import com.auri.ironam.ItemBase;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;

/**
 * Created by 1800855 on 10/17/16.
 */
public class CommonProxy {
    public static void init()
    {
        MinecraftForge.EVENT_BUS.register(new EventHandlerCommon());
        EventHandlerCommon handler = new EventHandlerCommon();
        MinecraftForge.EVENT_BUS.register(handler);
        FMLCommonHandler.instance().bus().register(handler);
    }
    public void registerItemRenderer(Item item, int i, String name)
    {
    }
}
