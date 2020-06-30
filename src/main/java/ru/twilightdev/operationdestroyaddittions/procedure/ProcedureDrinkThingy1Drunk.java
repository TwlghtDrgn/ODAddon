package ru.twilightdev.operationdestroyaddittions.procedure;

import ru.twilightdev.operationdestroyaddittions.ElementsOperationDestroyAddittions;

import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

@ElementsOperationDestroyAddittions.ModElement.Tag
public class ProcedureDrinkThingy1Drunk extends ElementsOperationDestroyAddittions.ModElement {
	public ProcedureDrinkThingy1Drunk(ElementsOperationDestroyAddittions instance) {
		super(instance, 4);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure DrinkThingy1Drunk!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.SPEED, (int) 15, (int) 2, (false), (false)));
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, (int) 15, (int) 2, (false), (false)));
	}
}
