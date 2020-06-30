
package ru.twilightdev.operationdestroyaddittions.item;

import ru.twilightdev.operationdestroyaddittions.procedure.ProcedureDrinkThingy1Drunk;
import ru.twilightdev.operationdestroyaddittions.creativetab.TabODAdditions;
import ru.twilightdev.operationdestroyaddittions.ElementsOperationDestroyAddittions;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemFood;
import net.minecraft.item.Item;
import net.minecraft.item.EnumAction;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

@ElementsOperationDestroyAddittions.ModElement.Tag
public class ItemDrinkThingy1 extends ElementsOperationDestroyAddittions.ModElement {
	@GameRegistry.ObjectHolder("odaddittions:drinkthingy1")
	public static final Item block = null;
	public ItemDrinkThingy1(ElementsOperationDestroyAddittions instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemFoodCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("odaddittions:drinkthingy1", "inventory"));
	}
	public static class ItemFoodCustom extends ItemFood {
		public ItemFoodCustom() {
			super(7, 0.3f, false);
			setUnlocalizedName("drinkthingy1");
			setRegistryName("drinkthingy1");
			setCreativeTab(TabODAdditions.tab);
			setMaxStackSize(8);
		}

		@Override
		public int getMaxItemUseDuration(ItemStack stack) {
			return 16;
		}

		@Override
		public EnumAction getItemUseAction(ItemStack par1ItemStack) {
			return EnumAction.DRINK;
		}

		@Override
		protected void onFoodEaten(ItemStack itemStack, World world, EntityPlayer entity) {
			super.onFoodEaten(itemStack, world, entity);
			int x = (int) entity.posX;
			int y = (int) entity.posY;
			int z = (int) entity.posZ;
			{
				java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
				$_dependencies.put("entity", entity);
				ProcedureDrinkThingy1Drunk.executeProcedure($_dependencies);
			}
		}
	}
}
