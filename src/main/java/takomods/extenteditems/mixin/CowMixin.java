package takomods.extenteditems.mixin;

import net.minecraft.core.entity.animal.EntityAnimal;
import net.minecraft.core.entity.animal.EntityCow;
import net.minecraft.core.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import takomods.extenteditems.Items.Items;

@Mixin(value = EntityCow.class, remap = false)

public class CowMixin extends EntityAnimal
{
	public CowMixin(World world)
	{
		super(world);
	}

	@Unique
	protected int getDroppedItemID()
	{
        return Items.foodBeefRaw.id;
	}
	@Inject(method = "dropFewItems", at = @At("HEAD"))
	protected void dropFewItems(CallbackInfo ci)
	{
		int i = getDroppedItemID();
		if (i> 0)
		{
			int j = this.random.nextInt(3) + 1;
			for(int k = 0; k < j; k++)
			{
				this.spawnAtLocation(i, 1);
			}
		}
	}
}
