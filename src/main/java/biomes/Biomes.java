package biomemod.biomes;

import net.minecraft.world.biome.BiomeGenBase;
import cpw.mods.fml.common.registry.GameRegistry;

public class Biomes {
	
	public static int biomeColor = 1204859;
	
	public static BiomeGenBase iceMountains = new IceMountains(63);
	public static BiomeGenBase floweryField = new FloweryField(64);
	public static BiomeGenBase grassyMeadow = new GrassyMeadow(65);
	public static BiomeGenBase redShroomPlains = new RedshroomPlains(66);
	public static BiomeGenBase stoneMountains = new StoneMountains(67);
	public static BiomeGenBase slimeLands = new SlimeLands(68);
	public static BiomeGenBase coldDesert = new ColdDesert(69);
	public static BiomeGenBase redRockMountains = new RedRockMountains(70);
	public static BiomeGenBase magmaSlimeLands = new MagmaSlimeLands(71);
	public static BiomeGenBase spiderHills = new SpiderHills(72);
	
	public static void init() {
		GameRegistry.addBiome(iceMountains);
		GameRegistry.addBiome(floweryField);
		GameRegistry.addBiome(grassyMeadow);
		GameRegistry.addBiome(redShroomPlains);
		GameRegistry.addBiome(stoneMountains);
		GameRegistry.addBiome(slimeLands);
		GameRegistry.addBiome(coldDesert);
		GameRegistry.addBiome(redRockMountains);
		GameRegistry.addBiome(magmaSlimeLands);
		GameRegistry.addBiome(spiderHills);
	}
}