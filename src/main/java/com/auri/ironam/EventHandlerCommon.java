package com.auri.ironam;

import com.sun.tools.internal.xjc.reader.gbind.ElementSets;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.player.PlayerDropsEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import com.auri.ironam.ironam;

/**
 * Created by 1800855 on 10/17/16.
 */
public class EventHandlerCommon {
    ItemStack handlerBinder = new ItemStack(ModItems.itemBinder);
    @SubscribeEvent
    public void onPlayerDrop(PlayerDropsEvent e) {
        System.out.print("Dropped!");
    }

    @SubscribeEvent
    public void onRightClick(PlayerInteractEvent e)
    {
        EntityPlayer player = e.getEntityPlayer();
        ItemStack heldItem = player.getHeldItem(EnumHand.MAIN_HAND);
        System.out.print("Player: " + player + "\n");
        System.out.print("Held Item: " + heldItem + "\n");
        if (heldItem == handlerBinder)
        {
            System.out.print("BinderRC!\n");
        }
    }

}
