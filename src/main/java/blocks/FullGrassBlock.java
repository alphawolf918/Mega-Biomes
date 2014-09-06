package biomemod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;
import net.minecraftforge.common.IPlantable;
import biomemod.creativetabs.ModTabs;
import biomemod.lib.ModInfo;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class FullGrassBlock extends Block {

	protected FullGrassBlock(int par1) {
		super(par1, Material.grass);
		this.setCreativeTab(ModTabs.biomeTab);
		this.setHardness(.8F);
		this.setTickRandomly(true);
		this.setResistance(1.8F);
		this.setStepSound(this.soundGrassFootstep);
		this.setUnlocalizedName("fullgrassblock");
	}

	public boolean canSustainPlant(World world, int x, int y, int z,
			ForgeDirection direction, IPlantable plant) {
		return true;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
		blockIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":"
				+ "fullgrass");
	}
}
