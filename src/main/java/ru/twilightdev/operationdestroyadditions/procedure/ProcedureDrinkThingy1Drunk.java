package ru.twilightdev.operationdestroyadditions.procedure;

import ru.twilightdev.operationdestroyadditions.ElementsOperationDestroyAdditions;

import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

@ElementsOperationDestroyAdditions.ModElement.Tag
public class ProcedureDrinkThingy1Drunk extends ElementsOperationDestroyAdditions.ModElement {
	public ProcedureDrinkThingy1Drunk(ElementsOperationDestroyAdditions instance) {
		super(instance, 4);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure DrinkThingy1Drunk!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, (int) 60, (int) 2, (false), (false)));
	}
}
