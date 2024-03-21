package takomods.extenteditems.Items;

import net.minecraft.core.block.Block;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemArmor;
import net.minecraft.core.item.ItemFoodStackable;
import net.minecraft.core.item.tool.*;
import takomods.extenteditems.ExtendedItems;
import turniplabs.halplibe.helper.ItemHelper;
import useless.terrainapi.generation.overworld.api.ChunkDecoratorOverworldAPI;

public class Items
{
	private static int itemID(String string)
	{
		return ExtendedItems.config.getInt("Item IDs." + string);
	}
	public static Item dSteelSword = new ItemToolSword("dSteelSword", itemID("dSteelSword"), Materials.dSteel).setIconCoord(0,4);
	public static Item dSteelAxe = new ItemToolAxe("dSteelAxe", itemID("dSteelAxe"), Materials.dSteel);
	public static Item dSteelPickaxe = new ItemToolPickaxe("dSteelPickaxe", itemID("dSteelPickaxe"), Materials.dSteel);
	public static Item dSteelShovel = new ItemToolShovel("dSteelShovel", itemID("dSteelShovel"), Materials.dSteel);
	public static Item dSteelHoe = new ItemToolHoe("dSteelHoe", itemID("dSteelHoe"), Materials.dSteel);
	public static  Item dSteelIngot = new Item("dSteelIngot", itemID("dSteelIngot")).setIconCoord(1, 4);
	public static Item ironRod = new Item("ironRod", itemID("ironRod")).setIconCoord(1, 4);
	//Armor Items
	public static Item armorHelmetdSteel = new ItemArmor("dSteelHelmet", itemID("dSteelHelmet"), Materials.DSTEEL, 0).setIconCoord(0,0);
	public static Item armorChestplatedSteel = new ItemArmor("dSteelChest", itemID("dSteelChest"), Materials.DSTEEL, 1).setIconCoord(0,0);
	public static Item armorLeggingsdSteel = new ItemArmor("dSteelLegs", itemID("dSteelLegs"), Materials.DSTEEL, 2).setIconCoord(0,0);
	public static Item armorBootsdSteel = new ItemArmor("dSteelBoots", itemID("dSteelBoots"), Materials.DSTEEL, 3).setIconCoord(0,0);

	//Stackable Food
	public static Item foodPorkchopRaw = new ItemFoodStackable("foodPorkchopRaw", itemID("rawPork"), 3, true, 4).setIconCoord(7, 5);
	public static Item foodPorkchopCooked = new ItemFoodStackable("foodPorkchopCooked", itemID("cookedPork"), 8, true, 4).setIconCoord(7, 5);
	public static Item foodBeefRaw = new ItemFoodStackable("foodBeefRaw", itemID("rawBeef"), 3, true, 4).setIconCoord(7, 5);
	public static Item foodBeefCooked = new ItemFoodStackable("foodBeefCooked", itemID("cookedBeef"), 8, true, 4).setIconCoord(7, 5);
	public static void initializeItems()
	{
		ItemHelper.createItem(ExtendedItems.MOD_ID, dSteelSword, "dSteelSword.png");
		ItemHelper.createItem(ExtendedItems.MOD_ID, dSteelAxe, "dSteelAxe.png");
		ItemHelper.createItem(ExtendedItems.MOD_ID, dSteelPickaxe, "dSteelPickaxe.png");
		ItemHelper.createItem(ExtendedItems.MOD_ID, dSteelShovel, "dSteelShovel.png");
		ItemHelper.createItem(ExtendedItems.MOD_ID, dSteelHoe, "dSteelHoe.png");
		ItemHelper.createItem(ExtendedItems.MOD_ID, dSteelIngot, "dSteelIngot.png");
		ItemHelper.createItem(ExtendedItems.MOD_ID, ironRod, "ironRod.png");

		ItemHelper.createItem(ExtendedItems.MOD_ID, armorHelmetdSteel, "dSteelHelmet.png");
		ItemHelper.createItem(ExtendedItems.MOD_ID, armorChestplatedSteel, "dSteelChest.png");
		ItemHelper.createItem(ExtendedItems.MOD_ID, armorLeggingsdSteel, "dSteelLegs.png");
		ItemHelper.createItem(ExtendedItems.MOD_ID, armorBootsdSteel, "dSteelBoots.png");

		ItemHelper.createItem(ExtendedItems.MOD_ID, foodPorkchopRaw, "rawPork.png");
		ItemHelper.createItem(ExtendedItems.MOD_ID, foodPorkchopCooked, "cookedPork.png");
		ItemHelper.createItem(ExtendedItems.MOD_ID, foodBeefRaw, "rawBeef.png");
		ItemHelper.createItem(ExtendedItems.MOD_ID, foodBeefCooked, "cookedBeef.png");
	}
}
