package biomemod;

import biomemod.biomes.Biomes;
import biomemod.blocks.Blocks;
import biomemod.creativetabs.ModTabs;
import biomemod.lib.ModInfo;
import biomemod.lib.Recipes;
import biomemod.managers.EventManager;
import biomemod.proxies.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = ModInfo.ID, name = ModInfo.NAME, version = ModInfo.VERSION)
@NetworkMod(channels = { ModInfo.CHANNEL }, clientSideRequired = true,
		serverSideRequired = true)
public class BiomeMod {
	
	@SidedProxy(clientSide = ModInfo.PROXY_LOCATION + ".ClientProxy",
			serverSide = ModInfo.PROXY_LOCATION
					+ ".CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event) {
		GameRegistry.registerWorldGenerator(new EventManager());
		ModTabs.init();
		Blocks.init();
		Biomes.init();
		Recipes.init();
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {
		
	}
}