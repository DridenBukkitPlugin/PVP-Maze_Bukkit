package io.github.rakcom2.pvp_maze_bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.*;
public class PVP_Maze extends JavaPlugin {
	@Override
	public void onEnable() {
		getLogger().info("onEnable has been invoked!");
	}
 
	@Override
	public void onDisable() {
		getLogger().info("onDisable has been invoked!");
	}
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		return false;
	}
}
