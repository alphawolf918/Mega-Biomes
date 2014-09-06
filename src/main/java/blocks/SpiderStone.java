package biomemod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import biomemod.creativetabs.ModTabs;
import biomemod.lib.ModInfo;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class SpiderStone extends Block {
	public SpiderStone(int par1) {
		super(par1, Material.rock);
		this.setCreativeTab(ModTabs.biomeTab);
		this.setHardness(1.4F);
		this.setResistance(5F);
		this.setStepSound(Block.soundStoneFootstep);
		this.setUnlocalizedName("spiderstone");
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
		blockIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":"
				+ "spiderstone");
	}
}