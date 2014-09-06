package biomemod.worldgen;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import biomemod.blocks.Blocks;
import biomemod.lib.DataInfo;

public class WorldLilacGen extends WorldGenerator {
	protected int[] GetValidSpawnBlocks() {
		return new int[] { Blocks.fullGrassBlock.blockID, Block.grass.blockID };
	}
	
	public boolean LocationIsValidSpawn(World world, int i, int j, int k) {
		int distanceToAir = 0;
		int checkID = world.getBlockId(i, j, k);
		
		while (checkID != 0) {
			distanceToAir++;
			checkID = world.getBlockId(i, j + distanceToAir, k);
		}
		
		if (distanceToAir > 3) {
			return false;
		}
		j += distanceToAir - 1;
		
		int blockID = world.getBlockId(i, j, k);
		int blockIDAbove = world.getBlockId(i, j + 1, k);
		int blockIDBelow = world.getBlockId(i, j - 1, k);
		for (int x : GetValidSpawnBlocks()) {
			if (blockIDAbove != 0) {
				return false;
			}
			if (blockID == x) {
				return true;
			} else if (blockID == Blocks.fullGrassBlock.blockID
					&& blockIDBelow == x) {
				return true;
			}
		}
		return false;
	}
	
	public WorldLilacGen() {
	}
	
	@Override
	public boolean generate(World world, Random rand, int i, int j, int k) {
		// check that each corner is one of the valid spawn blocks
		if (!LocationIsValidSpawn(world, i, j, k)) {
			return false;
		}
		
		world.setBlock(i + 0, j + 0, k + 0, DataInfo.lilacBlockID);
		return true;
	}
}