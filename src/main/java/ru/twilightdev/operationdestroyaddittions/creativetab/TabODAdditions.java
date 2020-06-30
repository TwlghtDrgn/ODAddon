
package ru.twilightdev.operationdestroyaddittions.creativetab;

import ru.twilightdev.operationdestroyaddittions.item.ItemIcon;
import ru.twilightdev.operationdestroyaddittions.ElementsOperationDestroyAddittions;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

@ElementsOperationDestroyAddittions.ModElement.Tag
public class TabODAdditions extends ElementsOperationDestroyAddittions.ModElement {
	public TabODAdditions(ElementsOperationDestroyAddittions instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabodadditions") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemIcon.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static CreativeTabs tab;
}
