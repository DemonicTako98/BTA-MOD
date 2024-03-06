package takomods.ExtendedItems;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import takomods.ExtendedItems.Item.Items;
import turniplabs.halplibe.util.ConfigUpdater;
import turniplabs.halplibe.util.GameStartEntrypoint;
import turniplabs.halplibe.util.RecipeEntrypoint;
import turniplabs.halplibe.util.TomlConfigHandler;
import turniplabs.halplibe.util.toml.Toml;


public class Extended_Tools implements ModInitializer, GameStartEntrypoint, RecipeEntrypoint
{
	public static final String MOD_ID = "extendedItems";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	private static final ConfigUpdater configUpdater = ConfigUpdater.fromProperties();
	private static final Toml tomProperties = new Toml("MoreStuff Config");
	public static TomlConfigHandler config;

	private static int itemID = 17000;
	private int getNextID()
	{
		return itemID++;
	}

	public void initializeConfig()
	{
		tomProperties.addCategory("Item IDs")
			.addEntry("dSteelSword", getNextID())
			.addEntry("dSteelPickAxe", getNextID())
			.addEntry("dSteelShovel", getNextID())
			.addEntry("dSteelAxe", getNextID())
			.addEntry("dSteelHoe", getNextID())
			.addEntry("ironRod", getNextID());

		config = new TomlConfigHandler(configUpdater, MOD_ID, tomProperties);
	}
	@Override
	public void onInitialize()
	{
		LOGGER.info("extendedItems Initialized.");
		initializeConfig();
		Items.createItems();
	}


	@Override
	public void beforeGameStart()
	{

	}

	@Override
	public void afterGameStart()
	{

	}

	@Override
	public void onRecipesReady()
	{

	}
}
