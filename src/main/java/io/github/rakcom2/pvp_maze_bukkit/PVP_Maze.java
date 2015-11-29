package io.github.rakcom2.pvp_maze_bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class PVP_Maze extends JavaPlugin {
	@Override
	public void onEnable() {
		this.getCommand("hello").setExecutor(new PVP_Maze_CommandExecutor(this));
		getLogger().info("onEnable has been invoked!");
	}
 
	@Override
	public void onDisable() {
		getLogger().info("onDisable has been invoked!");
	}
}
