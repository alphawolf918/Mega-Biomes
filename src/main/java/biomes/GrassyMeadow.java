package biomemod.biomes;

import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.SpawnListEntry;
import net.minecraft.world.gen.feature.WorldGenBigTree;
import biomemod.blocks.Blocks;

public class GrassyMeadow extends BiomeGenBase {
	
	public GrassyMeadow(int par1) {
		super(par1);
		this.waterColorMultiplier = 0xaa00ff;
		this.setBiomeName("Grassy Meadow");
		this.setColor(Biomes.biomeColor);
		this.setMinMaxHeight(0.2F, 0.2F);
		this.worldGeneratorBigTree = new WorldGenBigTree(true);
		this.temperature = 5F;
		this.rainfall = 1F;
		this.spawnableCreatureList.clear();
		this.spawnableCreatureList.add(new SpawnListEntry(EntitySheep.class, 5,
				6, 8));
		this.theBiomeDecorator.treesPerChunk = 1;
		this.theBiomeDecorator.grassPerChunk = 50;
		this.theBiomeDecorator.reedsPerChunk = 5;
		this.theBiomeDecorator.sandPerChunk = -999;
		this.theBiomeDecorator.sandPerChunk2 = -999;
		this.theBiomeDecorator.mushroomsPerChunk = -999;
		this.theBiomeDecorator.clayPerChunk = -999;
		this.topBlock = (byte) Blocks.fullGrassBlock.blockID;
		this.fillerBlock = (byte) Blocks.fullGrassBlock.blockID;
	}
}
