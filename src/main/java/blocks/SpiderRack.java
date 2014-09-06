package biomemod.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityCaveSpider;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.world.World;
import biomemod.creativetabs.ModTabs;
import biomemod.lib.ModInfo;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class SpiderRack extends Block {
	public SpiderRack(int par1) {
		super(par1, Material.sponge);
		this.setCreativeTab(ModTabs.biomeTab);
		this.setUnlocalizedName("spiderrack");
		this.setHardness(1.2F);
		this.setResistance(2F);
		this.setStepSound(Block.soundGravelFootstep);
	}
	
	@Override
	public void onBlockDestroyedByPlayer(World par1world, int par2, int par3,
			int par4, int par5) {
		int rand = (int) (Math.floor(8) * Math.random());
		int rand2 = (int) (Math.floor(9) * Math.random());
		if (par1world.difficultySetting != 0 && !par1world.isRemote) {
			if (rand <= 6) {
				Entity spider = ((int) (Math.random() * Math.floor(10)) >= 5) ? new EntityCaveSpider(
						par1world)
						: new EntitySpider(par1world);
				for (int i = 1; i <= rand2; i++) {
					spider.setLocationAndAngles(par2 + 0.5D, par3,
							par4 + 0.5D, 0.0F, 0.0F);
					par1world.spawnEntityInWorld(spider);
				}
			}
		}
	}
	
	@Override
	public int idDropped(int par1, Random par2random, int par3) {
		return 0;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
		blockIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":"
				+ "spiderrack");
	}
}