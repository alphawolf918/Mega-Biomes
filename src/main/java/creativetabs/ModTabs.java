package biomemod.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ModTabs {
	public static CreativeTabs biomeTab = new BiomesTab(
			CreativeTabs.getNextID(), "biometab");
	
	public static void init(){
		LanguageRegistry.instance().addStringLocalization(
				"itemGroup." + "biometab", "en_US", "Mega Biomes");
	}
}
