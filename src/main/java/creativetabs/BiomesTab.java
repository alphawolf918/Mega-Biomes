package biomemod.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import biomemod.blocks.Blocks;

public class BiomesTab extends CreativeTabs {

	public BiomesTab(int par1, String par2Str) {
		super(par1, par2Str);
	}

	@Override
	public int getTabIconItemIndex() {
		return Blocks.fullGrassBlock.blockID;
	}

}
