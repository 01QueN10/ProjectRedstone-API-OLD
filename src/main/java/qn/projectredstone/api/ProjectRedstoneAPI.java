package qn.projectredstone.api;

import com.google.inject.Inject;
import org.slf4j.Logger;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.game.state.GameStartedServerEvent;
import org.spongepowered.api.plugin.Plugin;

@Plugin(id = "projectredstone-api", name = "ProjectRedstone-API", description = "The scripting API for Sponge servers", url = "https://01quen01.blogspot.com", authors = {"QN"})
public class ProjectRedstoneAPI {

	@Inject
	private Logger logger;

	@Listener
	public void onServerStart(GameStartedServerEvent event) {
	}

}
