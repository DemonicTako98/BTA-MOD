package takomods.extenteditems.Items;

import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import takomods.extenteditems.ExtendedItems;
import turniplabs.halplibe.helper.RecipeBuilder;
import turniplabs.halplibe.helper.recipeBuilders.RecipeBuilderShaped;

public class Recipes
{
	public static void registerCraftingRecipes()
	{

		//dSteelIngot
		RecipeBuilder.Shaped(ExtendedItems.MOD_ID)
			.setShape("DSD")
			.addInput('D', Item.diamond)
			.addInput('S', Item.ingotSteel)
			.create("dSteelIngot", new ItemStack(Items.dSteelIngot.getDefaultStack()));
		//ironRod
		RecipeBuilder.Shaped(ExtendedItems.MOD_ID)
			.setShape("I", "I")
			.addInput('I', Item.ingotIron)
			.create("ironRod", new ItemStack(Items.ironRod.getDefaultStack()));

		RecipeBuilderShaped SwordShapeTemplate = new RecipeBuilderShaped(ExtendedItems.MOD_ID, " D "," D "," I ");
		SwordShapeTemplate.addInput('D', Items.dSteelIngot)
			.addInput('I', Items.ironRod)
			.create("dSteelSword", Items.dSteelSword.getDefaultStack());

		RecipeBuilderShaped PickaxeShapeTemplate = new RecipeBuilderShaped(ExtendedItems.MOD_ID, "DDD"," I "," I ");
		PickaxeShapeTemplate.addInput('D', Items.dSteelIngot)
			.addInput('I', Items.ironRod)
			.create("dSteelPickaxe", Items.dSteelPickaxe.getDefaultStack());

		RecipeBuilderShaped AxeShapeTemplate = new RecipeBuilderShaped(ExtendedItems.MOD_ID, "DD ","DI "," I ");
		AxeShapeTemplate.addInput('D', Items.dSteelIngot)
			.addInput('I', Items.ironRod)
			.create("dSteelAxe", Items.dSteelAxe.getDefaultStack());

		RecipeBuilderShaped ShovelShapeTemplate = new RecipeBuilderShaped(ExtendedItems.MOD_ID, " D "," I "," I ");
		ShovelShapeTemplate.addInput('D', Items.dSteelIngot)
			.addInput('I', Items.ironRod)
			.create("dSteelShovel", Items.dSteelShovel.getDefaultStack());

		RecipeBuilderShaped HoeShapeTemplate = new RecipeBuilderShaped(ExtendedItems.MOD_ID, "DD "," I "," I ");
		HoeShapeTemplate.addInput('D', Items.dSteelIngot)
			.addInput('I', Items.ironRod)
			.create("dSteelHoe", Items.dSteelHoe.getDefaultStack());
	}
}
