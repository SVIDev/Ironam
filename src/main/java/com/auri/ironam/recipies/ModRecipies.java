package com.auri.ironam.recipies;

import com.auri.ironam.ModBlocks;
import com.auri.ironam.ModItems;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by 1800855 on 10/20/16.
 */
public class ModRecipies {
    public static void init()
    {
        GameRegistry.addShapelessRecipe(
                new ItemStack(ModItems.materialEctoball),
                Items.SLIME_BALL,
                Items.MAGMA_CREAM,
                Items.BONE
        );

        GameRegistry.addShapedRecipe(
                new ItemStack(ModItems.materialEctoplasm),
                "AAA",
                "AAA",
                "AAA",
                'A', ModItems.materialEctoball
        );

        GameRegistry.addShapedRecipe(
                new ItemStack(ModBlocks.blockEcto),
                "AAA",
                "AAA",
                "AAA",
                'A', ModItems.materialEctoplasm
        );

        GameRegistry.addShapedRecipe(
                new ItemStack(ModItems.itemBinder),
                "A A",
                " B ",
                " C ",
                'A', ModItems.materialEctoplasm,
                'B', ModItems.materialPureEctoplasm,
                'C', ModItems.materialSpiritDiamond
        );

        GameRegistry.addShapelessRecipe(
                new ItemStack(ModItems.materialPureEctoplasm),
                ModItems.materialEctoplasm,
                ModItems.materialSpiritDiamond
        );

        GameRegistry.addShapelessRecipe(
                new ItemStack(ModItems.materialSpiritDiamond),
                ModItems.materialEctoplasm,
                Items.DIAMOND
        );

        GameRegistry.addShapelessRecipe(
                new ItemStack(ModItems.materialSpiritIron),
                ModItems.materialEctoplasm,
                Items.IRON_INGOT
        );

        GameRegistry.addShapelessRecipe(
                new ItemStack(ModItems.materialSpiritGold),
                ModItems.materialEctoplasm,
                Items.GOLD_INGOT
        );
    }
}
