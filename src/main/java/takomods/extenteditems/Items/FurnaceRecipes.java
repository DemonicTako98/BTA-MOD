package takomods.extenteditems.Items;


import takomods.extenteditems.ExtendedItems;
import turniplabs.halplibe.helper.RecipeBuilder;


public class FurnaceRecipes
{
	public static void RegisterFurnaceRecipes()
	{
		RecipeBuilder.Furnace(ExtendedItems.MOD_ID)
			.setInput(Items.foodPorkchopRaw)
			.create("cookedPork", Items.foodPorkchopCooked.getDefaultStack());
		RecipeBuilder.BlastFurnace(ExtendedItems.MOD_ID)
			.setInput(Items.foodPorkchopRaw)
			.create("cookedPork", Items.foodPorkchopCooked.getDefaultStack());
	}
}
