package biomemod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSand;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import biomemod.creativetabs.ModTabs;
import biomemod.lib.ModInfo;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ColdSand extends BlockSand {

	public ColdSand(int par1) {
		super(par1, Material.sand);
		this.setCreativeTab(ModTabs.biomeTab);
		this.setStepSound(Block.soundSandFootstep);
		this.setHardness(.5F);
		this.setUnlocalizedName("coldsand");
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
		blockIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":"
				+ "coldsand");
	}
}
