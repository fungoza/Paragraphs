package furnygo.paragraphs.mixin;

import net.minecraft.util.StringHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(StringHelper.class)
public class MixinStringHelper {

	/**
	 * @author Morgz
	 * Makes you able to "chat" section sign and other normally "illegal" characters
	 */
	@Inject(method = "isValidChar", at = @At(value = "HEAD"), cancellable = true)
	private static void isValidChar(int c, CallbackInfoReturnable<Boolean> info) {
		info.setReturnValue(true);
	}
}
