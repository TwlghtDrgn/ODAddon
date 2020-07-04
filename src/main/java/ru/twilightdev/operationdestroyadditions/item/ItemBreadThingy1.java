
package ru.twilightdev.operationdestroyadditions.item;

import ru.twilightdev.operationdestroyadditions.creativetab.TabODAdditions;
import ru.twilightdev.operationdestroyadditions.ElementsOperationDestroyAdditions;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemFood;
import net.minecraft.item.Item;
import net.minecraft.item.EnumAction;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

@ElementsOperationDestroyAdditions.ModElement.Tag
public class ItemBreadThingy1 extends ElementsOperationDestroyAdditions.ModElement {
	@GameRegistry.ObjectHolder("odadditions:foodthingy1")
	public static final Item block = null;
	public ItemBreadThingy1(ElementsOperationDestroyAdditions instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemFoodCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("odadditions:foodthingy1", "inventory"));
	}
	public static class ItemFoodCustom extends ItemFood {
		public ItemFoodCustom() {
			super(5, 0.7f, false);
			setUnlocalizedName("foodthingy1");
			setRegistryName("foodthingy1");
			setCreativeTab(TabODAdditions.tab);
			setMaxStackSize(3);
		}

		@Override
		public EnumAction getItemUseAction(ItemStack par1ItemStack) {
			return EnumAction.EAT;
		}
	}
}
