package biomemod.biomes;

import biomemod.blocks.Blocks;

public class RedRockMountains extends StoneMountains {

	public RedRockMountains(int par1) {
		super(par1);
		this.waterColorMultiplier = 0xdd0000;
		this.temperature = 9F;
		this.theBiomeDecorator.generateLakes = true;
		this.setDisableRain();
		this.setBiomeName("Red Rock Mountains");
		this.setMinMaxHeight(-0.5F, 2.0F);
		this.topBlock = (byte) Blocks.redRock.blockID;
		this.fillerBlock = (byte) Blocks.redRock.blockID;
	}
}
