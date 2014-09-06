package biomemod.managers;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenerator;
import biomemod.biomes.Biomes;
import biomemod.worldgen.WorldLilacGen;
import cpw.mods.fml.common.IWorldGenerator;

public class EventManager implements IWorldGenerator {
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.dimensionId) {
		case 0:
			generateSurface(world, random, chunkX * 16, chunkZ * 16);
			break;
		}
	}
	
	private void generateSurface(World world, Random random, int x, int z) {
		if (world.getBiomeGenForCoords(x, z) == Biomes.floweryField) {
			this.spawnStructure(9, 10, world, random, x, 100, z,
					(new WorldLilacGen()));
			this.spawnStructure(9, 10, world, random, x, 90, z,
					(new WorldLilacGen()));
			this.spawnStructure(9, 10, world, random, x, 80, z,
					(new WorldLilacGen()));
			this.spawnStructure(9, 10, world, random, x, 70, z,
					(new WorldLilacGen()));
			this.spawnStructure(9, 10, world, random, x, 60, z,
					(new WorldLilacGen()));
			this.spawnStructure(9, 10, world, random, x, 55, z,
					(new WorldLilacGen()));
		}
	}
	
	/**
	 * Spawns a structure in the world
	 * 
	 */
	protected static void spawnStructure(int minChance, int maxChance,
			World world,
			Random random, int x, int y, int z, WorldGenerator wg) {
		int mRand = (int) (maxChance * Math.random());
		if (mRand <= minChance) {
			wg.generate(world, random, x, y, z);
		}
	}
}