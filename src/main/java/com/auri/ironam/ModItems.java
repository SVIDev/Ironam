package com.auri.ironam;

/**
 * Created by 1800855 on 10/17/16.
 */
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
public class ModItems {


    public static ItemBase materialEctoplasm;
    public static ItemBase materialEctoball;
    public static ItemBase itemBinder;;
    public static ItemBase materialPureEctoplasm;
    public static ItemBase materialSpiritDiamond;
    public static ItemBase materialSpiritIron;
    public static ItemBase materialSpiritGold;


    public static void init()
    {
        materialEctoplasm = register(new ItemBase("materialEctoplasm").setCreativeTab(CreativeTabs.MATERIALS));
        materialEctoball = register(new ItemBase("materialEctoball").setCreativeTab(CreativeTabs.MATERIALS));
        itemBinder = register(new ItemBase("itemBinder").setCreativeTab(CreativeTabs.TOOLS));
        materialPureEctoplasm = register(new ItemBase("materialPureEctoplasm").setCreativeTab(CreativeTabs.MATERIALS));
        materialSpiritDiamond = register(new ItemBase("materialSpiritDiamond").setCreativeTab(CreativeTabs.MATERIALS));
        materialSpiritIron = register(new ItemBase("materialSpiritIron").setCreativeTab(CreativeTabs.MATERIALS));
        materialSpiritGold = register(new ItemBase("materialSpiritGold").setCreativeTab(CreativeTabs.MATERIALS));
    }

    private static <T extends Item> T register(T item)
    {
        GameRegistry.register(item);

        if (item instanceof ItemBase)
        {
            ((ItemBase)item).registerItemModel();
        }

        return item;
    }
}
