package hu.deveriqhu.opalgamemode.settings;

import org.mineacademy.fo.settings.SimpleSettings;
import org.mineacademy.fo.settings.YamlStaticConfig;

public class Settings extends SimpleSettings {
	public static String PLUGIN_PREFIX;
	public static String GAMEMODE_SURVIVAL;
	public static String GAMEMODE_CREATIVE;
	public static String GAMEMODE_ADVENTURE;
	public static String GAMEMODE_SPECTATOR;

	@Override
	protected boolean saveComments() {
		return false;
	}

	private static void init() {
		YamlStaticConfig.setPathPrefix("Gamemode");
		Settings.PLUGIN_PREFIX = YamlStaticConfig.getString("Plugin_Prefix");
		Settings.GAMEMODE_SURVIVAL = YamlStaticConfig.getString("Gamemode_Survival");
		Settings.GAMEMODE_CREATIVE = YamlStaticConfig.getString("Gamemode_Creative");
		Settings.GAMEMODE_ADVENTURE = YamlStaticConfig.getString("Gamemode_Adventure");
		Settings.GAMEMODE_SPECTATOR = YamlStaticConfig.getString("Gamemode_Spectator");
	}
}
