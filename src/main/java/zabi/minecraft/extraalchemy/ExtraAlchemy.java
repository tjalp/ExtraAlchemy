package zabi.minecraft.extraalchemy;

import net.fabricmc.api.ModInitializer;
import zabi.minecraft.extraalchemy.config.ModConfig;
import zabi.minecraft.extraalchemy.statuseffect.ModEffectRegistry;

public class ExtraAlchemy implements ModInitializer {

	@Override
	public void onInitialize() {
		ModConfig.init();
		ModEffectRegistry.init();
	}

}
