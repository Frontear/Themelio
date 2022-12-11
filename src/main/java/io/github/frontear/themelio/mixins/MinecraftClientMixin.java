package io.github.frontear.themelio.mixins;

import io.github.frontear.themelio.ThemelioClientMod;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.RunArgs;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MinecraftClient.class)
abstract class MinecraftClientMixin {
    @Inject(at = @At("TAIL"), method = "<init>")
    private void init(RunArgs args, CallbackInfo info) {
        ThemelioClientMod.LOGGER.info("Mixin in the Client class");
    }
}
