package io.github.dridenbukkitplugin.pvp_maze_bukkit.Commands;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import io.github.dridenbukkitplugin.pvp_maze_bukkit.PVP_Maze;

public class BoxIn implements CommandExecutor {
	private final PVP_Maze plugin;
	public BoxIn(PVP_Maze plugin){
		this.plugin=plugin;
	}
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("BoxIn") && sender instanceof Player){
			World world=plugin.getServer().getWorld("Overworld");
			Location playerLocation=((Player)sender).getLocation();
			for(int x =-1;x<=1;x++){
				for(int y =-1;y<=1;y++){
					if(y==0 && x==0)break;
					world.getBlockAt(playerLocation.add(x*2, 1, y*2)).setType(Material.STONE);
				}
			}
		}
		return false;
	}

}
