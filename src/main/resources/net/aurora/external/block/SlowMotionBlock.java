package net.aurora.external.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

//block following tutorial
public class SlowMotionBlock extends Block {

	protected SlowMotionBlock(Material material) {
		super(material);
	}

	public SlowMotionBlock(String unlocalizedName, Material material,
			float hardness, float resistance) {
		super(material);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHardness(hardness);
		this.setResistance(resistance);
	}

	public SlowMotionBlock(String unlocalizedName, float hardness,
			float resistance) {
		this(unlocalizedName, Material.rock, hardness, resistance);
	}

	public SlowMotionBlock(String unlocalizedName) {
		this(unlocalizedName, 2.0f, 10.0f);
	}
}
