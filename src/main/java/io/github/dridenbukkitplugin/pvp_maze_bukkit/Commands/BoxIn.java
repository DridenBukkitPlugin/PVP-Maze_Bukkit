package io.github.dridenbukkitplugin.pvp_maze_bukkit.Commands;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
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
			Location playerLocation=((Player)sender).getLocation();
			if(playerLocation==null){
				sender.sendMessage("Sorry there but your location seams to not exist");
				return false;
			}
			int px=(int)playerLocation.getX()-1;
			int py=(int)playerLocation.getY();
			int pz=(int)playerLocation.getZ();
			World world=playerLocation.getWorld();
			sender.sendMessage(String.format("Constructing square around X=%d, Y=%d, Z=%d,", px,py,pz));
			for(int x =-2;x<=2;x++){
				for(int y =-2;y<=2;y++){
					if(Math.abs(y)<2 && Math.abs(x)<2)continue;
					Block current=world.getBlockAt(px+x, py+1, pz+y);
					current.setType(Material.STONE);
				}
			}
			return true;
		}
		return false;
	}

}
