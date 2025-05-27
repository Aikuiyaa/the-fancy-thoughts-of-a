package com.scue.tuturial;

import com.scue.tuturial.item.ModItemGroups;
import com.scue.tuturial.item.Moditems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.scue.tuturial.block.ModBlocks.ModBlockRegister;

public class TuturialMod implements ModInitializer {
	public static final String MOD_ID = "tuturial-mod";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		Moditems.registerModItems();//调用后会让 Moditems 中的注册方法执行,JAVA的静态代码块在类加载时就会执行
		ModItemGroups.ModRegister();
		ModBlockRegister();
		LOGGER.info("Hello Fabric world!");
	}
}