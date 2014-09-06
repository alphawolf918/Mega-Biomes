package biomemod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import biomemod.creativetabs.ModTabs;
import biomemod.lib.ModInfo;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class RedRockBricks extends Block {
	public RedRockBricks(int par1) {
		super(par1, Material.rock);
		this.setCreativeTab(ModTabs.biomeTab);
		this.setUnlocalizedName("redrockbrick");
		this.setStepSound(Block.soundStoneFootstep);
		this.setHardness(5F);
		this.setResistance(6F);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
		blockIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":"
				+ "redrockbrick");
	}
}