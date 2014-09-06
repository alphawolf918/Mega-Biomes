package biomemod.biomes;

import net.minecraft.entity.monster.EntityCaveSpider;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.SpawnListEntry;
import biomemod.lib.DataInfo;

public class SpiderHills extends BiomeGenBase {
	public SpiderHills(int par1) {
		super(par1);
		this.waterColorMultiplier = 0x000;
		this.setColor(Biomes.biomeColor);
		this.setMinMaxHeight(1.0F, 2.0F);
		this.setBiomeName("Spider Hills");
		this.temperature = 9F;
		this.rainfall = 6F;
		this.theBiomeDecorator.mushroomsPerChunk = 4;
		this.spawnableMonsterList.add(new SpawnListEntry(EntitySpider.class,
				20, 4, 5));
		this.spawnableMonsterList.add(new SpawnListEntry(
				EntityCaveSpider.class,
				20, 4, 5));
		this.topBlock = (byte) DataInfo.spiderRackBlockID;
		this.fillerBlock = (byte) DataInfo.spiderStoneBlockID;
	}
}