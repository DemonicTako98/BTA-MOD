package takomods.extenteditems.Items;

import net.minecraft.core.item.Item;
import net.minecraft.core.item.material.ToolMaterial;
import net.minecraft.core.item.tag.ItemTags;
import net.minecraft.core.item.tool.*;
import takomods.extenteditems.ExtendedItems;
import turniplabs.halplibe.helper.ItemHelper;

public class Items
{
	private static int itemID(String string)
	{
		return ExtendedItems.config.getInt("Item IDs." + string);
	}

	//toolSwordWood = (new ItemToolSword("tool.sword.wood", 16396, ToolMaterial.wood)).setIconCoord(0, 4).withTags(ItemTags.preventCreativeMining);
	public static Item dSteelSword = new ItemToolSword("dSteelSword", itemID("dSteelSword"), Materials.dSteel).setIconCoord(0,4);
	public static Item dSteelAxe = new ItemToolAxe("dSteelAxe", itemID("dSteelAxe"), Materials.dSteel);
	public static Item dSteelPickaxe = new ItemToolPickaxe("dSteelPickaxe", itemID("dSteelPickaxe"), Materials.dSteel);
	public static Item dSteelShovel = new ItemToolShovel("dSteelShovel", itemID("dSteelShovel"), Materials.dSteel);
	public static Item dSteelHoe = new ItemToolHoe("dSteelHoe", itemID("dSteelHoe"), Materials.dSteel);
	public static  Item dSteelIngot = new Item("dSteelIngot", itemID("dSteelIngot")).setIconCoord(1, 4);

	public static Item ironRod = new Item("ironRod", itemID("ironRod")).setIconCoord(1, 4);
	public static void initializeItems()
	{
		ItemHelper.createItem(ExtendedItems.MOD_ID, dSteelSword, "dSteelSword.png");
		ItemHelper.createItem(ExtendedItems.MOD_ID, dSteelAxe, "dSteelAxe.png");
		ItemHelper.createItem(ExtendedItems.MOD_ID, dSteelPickaxe, "dSteelPickaxe.png");
		ItemHelper.createItem(ExtendedItems.MOD_ID, dSteelShovel, "dSteelShovel.png");
		ItemHelper.createItem(ExtendedItems.MOD_ID, dSteelHoe, "dSteelHoe.png");
		ItemHelper.createItem(ExtendedItems.MOD_ID, dSteelIngot, "dSteelIngot.png");
		ItemHelper.createItem(ExtendedItems.MOD_ID, ironRod, "ironRod.png");
	}
}
