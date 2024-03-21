package takomods.extenteditems;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import takomods.extenteditems.util.FurnaceRecipes;
import takomods.extenteditems.Items.Items;
import takomods.extenteditems.util.Recipes;
import turniplabs.halplibe.util.ConfigUpdater;
import turniplabs.halplibe.util.GameStartEntrypoint;
import turniplabs.halplibe.util.RecipeEntrypoint;
import turniplabs.halplibe.util.TomlConfigHandler;
import turniplabs.halplibe.util.toml.Toml;
import useless.terrainapi.generation.overworld.api.ChunkDecoratorOverworldAPI;

public class ExtendedItems implements ModInitializer, GameStartEntrypoint, RecipeEntrypoint {
    public static final String MOD_ID = "extendeditems";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	private static final ConfigUpdater configUpdater = ConfigUpdater.fromProperties();
	private static final Toml tomlProperties = new Toml("Extended Items config");
	public static TomlConfigHandler config;
	private static int ItemID = 24000;
	private int getNextItemID()
	{
		return ItemID++;
	}

	private void initializeConfig()
	{
		tomlProperties.addCategory("Item IDs")
			.addEntry("dSteelSword", getNextItemID())
			.addEntry("dSteelAxe", getNextItemID())
			.addEntry("dSteelPickaxe", getNextItemID())
			.addEntry("dSteelShovel", getNextItemID())
			.addEntry("dSteelHoe", getNextItemID())
			.addEntry("ironRod", getNextItemID())
			.addEntry("dSteelIngot", getNextItemID())
			.addEntry("dSteelHelmet", getNextItemID())
			.addEntry("dSteelChest", getNextItemID())
			.addEntry("dSteelLegs", getNextItemID())
			.addEntry("dSteelBoots", getNextItemID())
			.addEntry("rawPork", getNextItemID())
			.addEntry("cookedPork", getNextItemID())
			.addEntry("rawBeef", getNextItemID())
			.addEntry("cookedBeef", getNextItemID());

		config = new TomlConfigHandler(configUpdater, MOD_ID, tomlProperties);
	}
    @Override
    public void onInitialize()
	{
        LOGGER.info("Extended Items initialized.");
		initializeConfig();
    }

	@Override
	public void beforeGameStart()
	{
		Items.initializeItems();
	}

	@Override
	public void afterGameStart() {

	}

	@Override
	public void onRecipesReady()
	{
		Recipes.registerCraftingRecipes();
		FurnaceRecipes.RegisterFurnaceRecipes();
	}
}
