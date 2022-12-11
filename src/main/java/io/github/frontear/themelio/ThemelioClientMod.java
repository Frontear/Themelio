package io.github.frontear.themelio;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ThemelioClientMod implements ClientModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("ThemelioClient");

    @Override
    public void onInitializeClient() {
        LOGGER.info("Hello from Themelio Client!");
    }
}
