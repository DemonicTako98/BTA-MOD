package takomods.extenteditems.util;


import takomods.extenteditems.ExtendedItems;
import takomods.extenteditems.Items.Items;
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

		RecipeBuilder.Furnace(ExtendedItems.MOD_ID)
			.setInput(Items.foodBeefRaw)
			.create("cookedBeef", Items.foodBeefCooked.getDefaultStack());
		RecipeBuilder.BlastFurnace(ExtendedItems.MOD_ID)
			.setInput(Items.foodBeefRaw)
			.create("cookedBeef", Items.foodBeefCooked.getDefaultStack());
	}
}
