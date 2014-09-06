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

public class RedshroomBlock extends Block {

	public RedshroomBlock(int par1) {
		super(par1, Material.coral);
		this.setCreativeTab(ModTabs.biomeTab);
		this.setUnlocalizedName("redshroomblock");
		this.setHardness(3F);
		this.setResistance(0F);
		this.setStepSound(Block.soundPowderFootstep);
	}

	public boolean canSustainPlant(World world, int x, int y, int z,
			ForgeDirection direction, IPlantable plant) {
		int plantID = plant.getPlantID(world, x, y, z);
		return (plantID == Block.mushroomBrown.blockID || plantID == Block.mushroomRed.blockID);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
		blockIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":"
				+ "shroomblock");
	}

}
