package io.github.dridenbukkitplugin.pvp_maze_bukkit.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import io.github.dridenbukkitplugin.pvp_maze_bukkit.PVP_Maze;

public class HelloCommand implements CommandExecutor {
	private final PVP_Maze plugin;
	public HelloCommand(PVP_Maze plugin){
		this.plugin=plugin;
	}
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("hello")){
			sender.sendMessage("Hello "+args[0]);
			return true;
		}
		return false;
	}

}
