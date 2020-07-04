
package ru.twilightdev.operationdestroyadditions.item;

import ru.twilightdev.operationdestroyadditions.procedure.ProcedureDrinkThingy1Drunk;
import ru.twilightdev.operationdestroyadditions.creativetab.TabODAdditions;
import ru.twilightdev.operationdestroyadditions.ElementsOperationDestroyAdditions;

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

@ElementsOperationDestroyAdditions.ModElement.Tag
public class ItemDrinkThingy1 extends ElementsOperationDestroyAdditions.ModElement {
	@GameRegistry.ObjectHolder("odadditions:drinkthingy1")
	public static final Item block = null;
	public ItemDrinkThingy1(ElementsOperationDestroyAdditions instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemFoodCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("odadditions:drinkthingy1", "inventory"));
	}
	public static class ItemFoodCustom extends ItemFood {
		public ItemFoodCustom() {
			super(0, 0f, false);
			setUnlocalizedName("drinkthingy1");
			setRegistryName("drinkthingy1");
			setAlwaysEdible();
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
