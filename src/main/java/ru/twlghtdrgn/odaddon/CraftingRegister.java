package ru.twlghtdrgn.odaddon;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.common.crafting.IRecipeFactory;

public class CraftingRegister {
    public static void register() {
        registerRecipes("cooked_pork_block"); 
        registerRecipes("spam");
    }

    private static void registerRecipes(String name) {
        CraftingHelper.register(new ResourceLocation("odaddon", name), (IRecipeFactory) (context, json) -> CraftingHelper.getRecipe(json, context));
    }
}
