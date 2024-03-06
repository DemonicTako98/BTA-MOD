package takomods.ExtendedItems.Item;


import net.minecraft.core.item.Item;
import net.minecraft.core.item.material.ToolMaterial;
import net.minecraft.core.item.tool.*;
import takomods.ExtendedItems.Extended_Tools;
import takomods.ExtendedItems.Item.Materials;
import turniplabs.halplibe.helper.ItemHelper;

public class Items
{
	private static int itemID(String configItemName)
	{
		return Extended_Tools.config.getInt("Item IDs." + configItemName);
	}

	//foodPorkchopRaw = (new ItemFood("food.porkchop.raw", 16447, 3, true)).setIconCoord(7, 5);
	//public static Item rawSteak = new ItemFood("food.steak.raw", 17000, 3, true).setIconCoord(7,5);
	//public static Item cookSteak = new ItemFood("Food.steak.cooked", 17001, 6, true).setIconCoord(7,5);

	public static Item dSteelSword = new ItemToolSword("dSteel.Sword", itemID("dSteelSword"), Materials.DiamondSteel);
	public static Item dSteelPickaxe = new ItemToolPickaxe("dSteel.Pickaxe", itemID("dSteelPickAxe"), Materials.DiamondSteel);
	public static Item dSteelAxe = new ItemToolAxe("dSteel.Axe", itemID("dSteelAxe"), Materials.DiamondSteel);
	public static Item dSteelShovel = new ItemToolShovel("dSteel.Shovel", itemID("dSteelShovel"), Materials.DiamondSteel);
	public static Item dSteelHoe = new ItemToolHoe("dSteel.Hoe", itemID("dSteelHoe"), Materials.DiamondSteel);
	public static Item ironRod = new Item("ironRod", itemID("ironRod")).setIconCoord(5, 3).setFull3D();

	public static void createItems()
	{
		//ItemHelper.createItem(More_Food.MOD_ID, rawSteak,"raw_steak.png");
		//ItemHelper.createItem(More_Food.MOD_ID, cookSteak, "cooked_steak");

		ItemHelper.createItem(Extended_Tools.MOD_ID, dSteelSword, "dSteelSword.png");
		ItemHelper.createItem(Extended_Tools.MOD_ID, dSteelPickaxe, "dSteelPickaxe.png");
		ItemHelper.createItem(Extended_Tools.MOD_ID, dSteelAxe,"dSteelAxe.png");
		ItemHelper.createItem(Extended_Tools.MOD_ID, dSteelShovel, "dSteelShovel.png");
		ItemHelper.createItem(Extended_Tools.MOD_ID, dSteelHoe, "dSteelHoe.png");
		ItemHelper.createItem(Extended_Tools.MOD_ID, ironRod, "ironRod");

	}
}
/;''
