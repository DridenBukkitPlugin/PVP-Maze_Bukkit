package io.github.dridenbukkitplugin.pvp_maze_bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import io.github.dridenbukkitplugin.pvp_maze_bukkit.Commands.*;


public class PVP_Maze extends JavaPlugin {
	@Override
	public void onEnable() {
		this.getCommand("hello").setExecutor(new HelloCommand(this));
		this.getCommand("boxin").setExecutor(new BoxIn(this));
		getLogger().info("onEnable has been invoked!");
	}
 
	@Override
	public void onDisable() {
		getLogger().info("onDisable has been invoked!");
	}
}
