package qn.projectredstone.api.functions;

import org.spongepowered.api.entity.living.player.Player;
import org.spongepowered.api.entity.living.player.gamemode.GameMode;
import org.spongepowered.api.text.Text;

public class PlayerFunctions {

	public static void sendMessage(Player player, String message) {
		player.sendMessage(Text.of(message));
	}

	public static GameMode getGameMode(Player player) {
		return player.gameMode().get();
	}

	public static void setGameMode(Player player, GameMode gameMode) {
		player.gameMode().set(gameMode);
	}

}
