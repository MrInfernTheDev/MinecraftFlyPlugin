package fly.main;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class fly implements CommandExecutor {
    public fly(Main xd)
    {
        xd.getCommand("fly").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p = (Player) sender;
        if (p.hasPermission("main.fly") == true)
        {
            p.setAllowFlight(true);
            if (p.isFlying() == true)
            {
                p.setFlying(false);
                p.setAllowFlight(false);
                p.sendMessage("Fly disabled");
            }
            else
            {
                p.setAllowFlight(true);
                p.setFlying(true);
                p.sendMessage("Fly enabled");
            }
        }
        else
        {
            p.sendMessage("You don't have permission to use this command");
        }
        return false;
    }
}
