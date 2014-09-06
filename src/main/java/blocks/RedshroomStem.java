package biomemod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import biomemod.creativetabs.ModTabs;
import biomemod.lib.ModInfo;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class RedshroomStem extends Block {

	public RedshroomStem(int par1) {
		super(par1, Material.coral);
		this.setCreativeTab(ModTabs.biomeTab);
		this.setUnlocalizedName("redstem");
		this.setHardness(3F);
		this.setResistance(0.2F);
		this.setStepSound(Block.soundPowderFootstep);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
		blockIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":"
				+ "redstem");
	}
}
