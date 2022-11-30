package io.github.frontear.themelio.mixins;

import io.github.frontear.themelio.ThemelioMod;
import net.minecraft.client.main.Main;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Main.class)
public class MainMixin {
    @Inject(at = @At("HEAD"), method = "main([Ljava/lang/String;)V")
    private static void main(String[] args, CallbackInfo info) {
        ThemelioMod.LOGGER.info("Mixin in the main class");
    }
}
