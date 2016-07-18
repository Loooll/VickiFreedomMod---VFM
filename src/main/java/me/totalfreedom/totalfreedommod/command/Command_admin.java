

package me.totalfreedom.totalfreedommod.command;


import me.totalfreedom.totalfreedommod.rank.Rank;
import me.totalfreedom.totalfreedommod.util.FUtil;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;



@CommandPermissions(level = Rank.OP, source = SourceType.ONLY_IN_GAME)
@CommandParameters(description = "For noob ops who think /admin is the key!", usage = "/<command>")
public class Command_admin extends FreedomCommand
{

    @Override
       public boolean run(final CommandSender sender, Player playerSender, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
 {
        FUtil.bcastMsg(ChatColor.translateAlternateColorCodes('&', "&cCONSOLE - adding " + sender.getName() + " to the admin list"));
         try {
    Thread.sleep(5000);                 //1000 milliseconds is one second.
} catch(InterruptedException ex) {
    Thread.currentThread().interrupt();
}
        FUtil.bcastMsg(ChatColor.translateAlternateColorCodes('&', "&cCONSOLE - setting " + sender.getName() + " to the supernoob list!"));
                 try {
    Thread.sleep(1000);                 //1000 milliseconds is one second.
} catch(InterruptedException ex) {
    Thread.currentThread().interrupt();
}
        FUtil.bcastMsg(ChatColor.translateAlternateColorCodes('&', "&5Wow. You actually thought that would work " + sender.getName() + "?"));
         try {
    Thread.sleep(3000);                 //1000 milliseconds is one second.
} catch(InterruptedException ex) {
    Thread.currentThread().interrupt();
}
        FUtil.bcastMsg(ChatColor.translateAlternateColorCodes('&', "&cCONSOLE - removing " + sender.getName() + " from the admin list"));
        
        playerSender.sendMessage(ChatColor.DARK_RED + "Well, now I might as well give you some tips");
        playerSender.sendMessage(ChatColor.RED + "First of all, register at http://vickifreedom.boards.net ");
        playerSender.sendMessage(ChatColor.GOLD + "By the way, please don't be a kiss-up. If theres no admin, always help even if no admin sees it");
        playerSender.sendMessage(ChatColor.YELLOW + "If admins see you being helpful, they may give you a recommendation which you will need to apply");
        playerSender.sendMessage(ChatColor.DARK_GREEN + "Before that, introduce yourself so more people know you");
        playerSender.sendMessage(ChatColor.GREEN + "Once you've met the requirements, go to the forum and make an application at the admin application catergory");
        playerSender.sendMessage(ChatColor.DARK_BLUE + "When creating the application, make sure to use the correct template" );
        playerSender.sendMessage(ChatColor.AQUA + "If you've done everything correctly, there should be a chance that you may be accepted. Please wait for you application to process!");
        playerSender.sendMessage(ChatColor.DARK_AQUA + "If you ever need this tips again, feel free to do /ai or be a dare-devil and do this command again <3 <3 :) :)");
        return true;
    
    
    }
    }
}
