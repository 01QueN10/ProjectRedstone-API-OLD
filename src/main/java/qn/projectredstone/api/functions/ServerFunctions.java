package qn.projectredstone.api.functions;

import org.spongepowered.api.Sponge;
import org.spongepowered.api.text.Text;

public class ServerFunctions {

	public static void broadcast(String msg) {
		Sponge.getServer().getBroadcastChannel().send(Text.of(msg));
	}
}
