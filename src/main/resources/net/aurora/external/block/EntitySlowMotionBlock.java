package net.aurora.external.block;

import java.util.Hashtable;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.vrogojin.aurora.redentities.RedTrigger;
import net.vrogojin.aurora.redentities.skeleton.RedEntitySkeleton;
import net.vrogojin.aurora.redsignalmanager.RedSignalManager;

public class EntitySlowMotionBlock extends RedEntitySkeleton {

	@Override
	public void writeToNBT(NBTTagCompound par1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void readFromNBT(NBTTagCompound par1) {
		// TODO Auto-generated method stub

	}

	@Override
	public Hashtable<String, String> dispatchEncodedProperties(
			Hashtable<String, String> properties) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPropertiesEncoded(boolean sendMotion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String act(RedTrigger trigger, int dimension, int x, int y, int z,
			String message, Entity entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void onStopped() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onBlocked() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTeleported() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean canMove() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Hashtable<String, String> clientDispatchEncodedProperties(
			Hashtable<String, String> properties) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String clientGetPropertiesEncoded(boolean sendMotion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String clientAct(RedTrigger trigger, int dimension, int x, int y,
			int z, String message, Entity entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void clientOnStopped() {
		// TODO Auto-generated method stub

	}

	@Override
	public void clientOnBlocked() {
		// TODO Auto-generated method stub

	}

	@Override
	public void clientOnTeleported() {
		// TODO Auto-generated method stub

	}

	@Override
	public String guiCaption() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void render() {
		// TODO Auto-generated method stub

	}

	@Override
	public void guiAddModes() {
		// TODO Auto-generated method stub

	}

	@Override
	public void guiAddButtons() {
		// TODO Auto-generated method stub

	}

	@Override
	public void guiAddTextFields() {
		// TODO Auto-generated method stub

	}

	@Override
	public void guiAddLabels() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean guiAction(String btnID) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void loadPropsFromGui(RedSignalManager redManager) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onEntityCollidedWithBlock(World world, int par2, int par3,
			int par4, Entity par5Entity) {
		// TODO Auto-generated method stub
		if (par5Entity instanceof EntityLiving) {
			((EntityLiving)par5Entity).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 200, 1));
		}

	}

	@Override
	public boolean onBlockActivated(World world, int x, int y, int z,
			EntityPlayer player, int side, float hitX, float hitY, float hitZ) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void onBlockDestroyedByPlayer(World world, int x, int y, int z,
			int metaData) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onBlockPlacedBy(World world, int x, int y, int z,
			EntityLivingBase entityLiving, ItemStack par6ItemStack) {
		// TODO Auto-generated method stub

	}

}
