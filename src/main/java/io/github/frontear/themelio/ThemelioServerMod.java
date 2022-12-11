package io.github.frontear.themelio;

import net.fabricmc.api.DedicatedServerModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ThemelioServerMod implements DedicatedServerModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("ThemelioServer");

    @Override
    public void onInitializeServer() {
        LOGGER.info("Hello from Themelio Server!");
    }
}
