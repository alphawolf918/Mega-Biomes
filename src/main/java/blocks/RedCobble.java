package biomemod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStone;
import net.minecraft.client.renderer.texture.IconRegister;
import biomemod.creativetabs.ModTabs;
import biomemod.lib.ModInfo;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class RedCobble extends BlockStone {
	public RedCobble(int par1) {
		super(par1);
		this.setCreativeTab(ModTabs.biomeTab);
		this.setHardness(2.0F);
		this.setResistance(10F);
		this.setStepSound(Block.soundStoneFootstep);
		this.setUnlocalizedName("redcobble");
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
		blockIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":"
				+ "redcobble");
	}
}
