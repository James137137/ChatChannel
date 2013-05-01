/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.james137137.ChatChannel;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author James
 */
public class ChatChannel extends JavaPlugin{

    private static Logger log;
    
    @Override
    public void onEnable ()
    {
        log = getServer().getLogger();
        log.log(Level.INFO, "{0}: Version: {1} Enabled.",
                new Object[]{this.getName(), getServer().getPluginManager().getPlugin(this.getName()).getDescription().getVersion()});
        reload();
    }
    
    @Override
    public void onDisable() {
        log.log(Level.INFO, "{0}: Version: {1} Disabled..",
                new Object[]{this.getName(), getServer().getPluginManager().getPlugin(this.getName()).getDescription().getVersion()});
    }
    
    @Override
     public boolean onCommand(CommandSender sender, Command command, String commandLabel, String[] args) {
        String commandName = command.getName().toLowerCase();
        if (commandName.equalsIgnoreCase("ChatChannel") || commandName.equals("cc"))
        {
            CommandChatChannel(sender,args);
            return true;
        }
        return false;
    }
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }

    private void CommandChatChannel(CommandSender sender, String[] args) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void reload() {
        Player[] onlinePlayers = getServer().getOnlinePlayers();
        for (Player player : onlinePlayers) {
            
        }
    }
}
