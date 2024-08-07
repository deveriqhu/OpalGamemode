package hu.deveriqhu.opalgamemode.commands;

import hu.deveriqhu.opalgamemode.settings.Settings;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.mineacademy.fo.annotation.AutoRegister;
import org.mineacademy.fo.command.SimpleCommand;

import java.util.List;

@AutoRegister
public final class GamemodeSwitcher extends SimpleCommand {

	public GamemodeSwitcher() {
		super("gamemode");
		this.setMinArguments(1);
	}

	@Override
	protected void onCommand() {
		this.checkConsole();
		final String param = this.args[0];
		final Player player = (Player)this.sender;
		if ("survival".equalsIgnoreCase(param)) {
			player.setGameMode(GameMode.SURVIVAL);
			this.setTellPrefix(Settings.PLUGIN_PREFIX);
			this.tell(Settings.GAMEMODE_SURVIVAL);
		}
		else if ("creative".equalsIgnoreCase(param)) {
			player.setGameMode(GameMode.CREATIVE);
			this.setTellPrefix(Settings.PLUGIN_PREFIX);
			this.tell(Settings.GAMEMODE_CREATIVE);
		}
		else if ("adventure".equalsIgnoreCase(param)) {
			player.setGameMode(GameMode.ADVENTURE);
			this.setTellPrefix(Settings.PLUGIN_PREFIX);
			this.tell(Settings.GAMEMODE_ADVENTURE);
		}
		else if ("spectator".equalsIgnoreCase(param)) {
			player.setGameMode(GameMode.SPECTATOR);
			this.setTellPrefix(Settings.PLUGIN_PREFIX);
			this.tell(Settings.GAMEMODE_SPECTATOR);
		}
	}

	@Override
	protected List<String> tabComplete() {
		if (this.args.length == 1) {
			return this.completeLastWord("survival", "creative", "adventure", "spectator");
		}
		return GamemodeSwitcher.NO_COMPLETE;
	}
}
