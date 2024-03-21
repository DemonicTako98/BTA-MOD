package takomods.extenteditems;

import net.minecraft.core.block.Block;
import useless.terrainapi.api.TerrainAPI;
import useless.terrainapi.generation.overworld.OverworldConfig;
import useless.terrainapi.generation.overworld.api.ChunkDecoratorOverworldAPI;

import static takomods.extenteditems.ExtendedItems.LOGGER;
import static takomods.extenteditems.ExtendedItems.MOD_ID;
public class TerrainApiPlugin implements TerrainAPI
{
	@Override
	public String getModID()
	{
		return MOD_ID;
	}
	public static final OverworldConfig overworldConfig = ChunkDecoratorOverworldAPI.overworldConfig;
	public void onInitialize()
	{
		LOGGER.info("Ores Initialized");
		ChunkDecoratorOverworldAPI.oreFeatures.addManagedOreFeature(getModID(), Block.oreNethercoalNetherrack, 30, 90, 0.0f,1.0f, false);
	}
}
