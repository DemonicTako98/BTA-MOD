package takomods.extenteditems.util;

import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import takomods.extenteditems.ExtendedItems;
import takomods.extenteditems.Items.Items;
import turniplabs.halplibe.helper.RecipeBuilder;
import turniplabs.halplibe.helper.recipeBuilders.RecipeBuilderShaped;

public class Recipes
{
	public static void registerCraftingRecipes()
	{
		//Templates
		RecipeBuilderShaped SwordShapeTemplate = new RecipeBuilderShaped(ExtendedItems.MOD_ID, " D ", " D ", " I ");
		RecipeBuilderShaped PickaxeShapeTemplate = new RecipeBuilderShaped(ExtendedItems.MOD_ID, "DDD", " I ", " I ");
		RecipeBuilderShaped AxeShapeTemplate = new RecipeBuilderShaped(ExtendedItems.MOD_ID, "DD ", "DI ", " I ");
		RecipeBuilderShaped ShovelShapeTemplate = new RecipeBuilderShaped(ExtendedItems.MOD_ID, " D ", " I ", " I ");
		RecipeBuilderShaped HoeShapeTemplate = new RecipeBuilderShaped(ExtendedItems.MOD_ID, "DD ", " I ", " I ");
		RecipeBuilderShaped ArmorHelmetTemplate = new RecipeBuilderShaped(ExtendedItems.MOD_ID, "DDD", "D D");
		RecipeBuilderShaped ArmorChestTemplate = new RecipeBuilderShaped(ExtendedItems.MOD_ID, "D D","DDD","DDD");
		RecipeBuilderShaped ArmorLegsTemplate = new RecipeBuilderShaped(ExtendedItems.MOD_ID, "DDD","D D","D D");
		RecipeBuilderShaped ArmorBootsTemplate = new RecipeBuilderShaped(ExtendedItems.MOD_ID, "D D","D D");

		//Recipes
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
		SwordShapeTemplate.addInput('D', Items.dSteelIngot)
			.addInput('I', Items.ironRod)
			.create("dSteelSword", Items.dSteelSword.getDefaultStack());
		PickaxeShapeTemplate.addInput('D', Items.dSteelIngot)
			.addInput('I', Items.ironRod)
			.create("dSteelPickaxe", Items.dSteelPickaxe.getDefaultStack());
		AxeShapeTemplate.addInput('D', Items.dSteelIngot)
			.addInput('I', Items.ironRod)
			.create("dSteelAxe", Items.dSteelAxe.getDefaultStack());
		ShovelShapeTemplate.addInput('D', Items.dSteelIngot)
			.addInput('I', Items.ironRod)
			.create("dSteelShovel", Items.dSteelShovel.getDefaultStack());
		HoeShapeTemplate.addInput('D', Items.dSteelIngot)
			.addInput('I', Items.ironRod)
			.create("dSteelHoe", Items.dSteelHoe.getDefaultStack());

		ArmorHelmetTemplate.addInput('D', Items.dSteelIngot)
			.create("dSteelHelmet", Items.armorHelmetdSteel.getDefaultStack());
		ArmorChestTemplate.addInput('D', Items.dSteelIngot)
			.create("dSteelChest", Items.armorChestplatedSteel.getDefaultStack());
		ArmorLegsTemplate.addInput('D', Items.dSteelIngot)
			.create("dSteelLegs", Items.armorLeggingsdSteel.getDefaultStack());
		ArmorBootsTemplate.addInput('D', Items.dSteelIngot)
			.create("dSteelBoots", Items.armorBootsdSteel.getDefaultStack());
	}
}
