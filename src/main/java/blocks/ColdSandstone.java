package biomemod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import biomemod.creativetabs.ModTabs;
import biomemod.lib.ModInfo;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ColdSandstone extends Block {
	public ColdSandstone(int par1) {
		super(par1, Material.rock);
		this.setCreativeTab(ModTabs.biomeTab);
		this.setUnlocalizedName("coldsandsmooth");
		this.setResistance(4F);
		this.setHardness(4F);
		this.setStepSound(Block.soundStoneFootstep);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
		blockIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":"
				+ "coldsandsmooth");
	}
}
