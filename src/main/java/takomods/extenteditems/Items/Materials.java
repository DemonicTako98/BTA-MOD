package takomods.extenteditems.Items;

import net.minecraft.core.item.material.ArmorMaterial;
import net.minecraft.core.item.material.ToolMaterial;
import net.minecraft.core.util.helper.DamageType;
import org.checkerframework.checker.units.qual.A;
import takomods.extenteditems.ExtendedItems;
import turniplabs.halplibe.helper.ArmorHelper;

public class Materials
{
	public static final ToolMaterial dSteel = new ToolMaterial().setDurability(5012).setEfficiency(15.0f, 45.0f).setMiningLevel(3).setDamage(4).setBlockHitDelay(4);
	public static final ArmorMaterial DSTEEL = ArmorHelper.createArmorMaterial(ExtendedItems.MOD_ID, "Diamond_Steel", 2000, 100.0f, 100.0f, 100.0f, 100.0f);
}
