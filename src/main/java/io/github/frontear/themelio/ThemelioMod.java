package io.github.frontear.themelio;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ThemelioMod implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("Themelio");

    @Override
    public void onInitialize() {
        LOGGER.info("Hello from Themelio!");
    }
}
