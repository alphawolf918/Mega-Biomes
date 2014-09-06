package biomemod.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStone;
import net.minecraft.client.renderer.texture.IconRegister;
import biomemod.creativetabs.ModTabs;
import biomemod.lib.ModInfo;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class RedRock extends BlockStone {
	public RedRock(int par1) {
		super(par1);
		this.setCreativeTab(ModTabs.biomeTab);
		this.setHardness(1.6F);
		this.setResistance(10F);
		this.setStepSound(Block.soundStoneFootstep);
		this.setUnlocalizedName("redrock");
	}

	public int idDropped(int i, Random random, int j) {
		return Blocks.redCobble.blockID;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
		blockIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":"
				+ "redrock");
	}
}