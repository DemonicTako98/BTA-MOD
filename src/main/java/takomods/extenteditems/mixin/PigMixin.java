package takomods.extenteditems.mixin;

import net.minecraft.core.entity.animal.EntityAnimal;
import net.minecraft.core.entity.animal.EntityPig;
import net.minecraft.core.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import takomods.extenteditems.Items.Items;

@Mixin(value = EntityPig.class, remap = false)

public class PigMixin extends EntityAnimal
{
	public PigMixin(World world)
	{
		super(world);
	}

	@Inject(method = "getDropItemId", at = @At("HEAD"), cancellable = true)
	protected void getDropItemId(CallbackInfoReturnable<Integer> cir)
	{
		if (this.remainingFireTicks > 0)
		{
			cir.setReturnValue(Items.foodPorkchopRaw.id);
		}
		cir.setReturnValue(Items.foodPorkchopRaw.id);
	}
}
