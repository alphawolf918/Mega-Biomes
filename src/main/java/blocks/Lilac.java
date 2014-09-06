package biomemod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import biomemod.creativetabs.ModTabs;
import biomemod.lib.ModInfo;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Lilac extends BlockFlower {

	protected Lilac(int par1) {
		super(par1, Material.grass);
		this.setCreativeTab(ModTabs.biomeTab);
		this.setUnlocalizedName("lilac");
		this.setResistance(0F);
		this.setHardness(0F);
		this.setStepSound(Block.soundGrassFootstep);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
		blockIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":"
				+ "lilac");
	}
	
}
