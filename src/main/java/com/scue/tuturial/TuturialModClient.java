package com.scue.tuturial;

public class TuturialModClient implements net.fabricmc.api.ClientModInitializer {
    // This logger is used to write text to the console and the log file.
    // It is considered best practice to use your mod id as the logger's name.
    // That way, it's clear which mod wrote info, warnings, and errors.
    public static final org.slf4j.Logger LOGGER = org.slf4j.LoggerFactory.getLogger("data/tuturial-mod");

    @Override
    public void onInitializeClient() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        LOGGER.info("Hello Fabric world from the client!");
    }
}
