package io.github.rakcom2.pvp_maze_bukkit;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class PVP_Maze_CommandExecutor implements CommandExecutor {
	private final PVP_Maze plugin;
	public PVP_Maze_CommandExecutor(PVP_Maze plugin){
		this.plugin=plugin;
	}
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String arg2, String[] args) {
		if(cmd.getName().equalsIgnoreCase("hello")){
			sender.sendMessage("Hello "+args[0]);
			return true;
		}
		return false;
	}

}
