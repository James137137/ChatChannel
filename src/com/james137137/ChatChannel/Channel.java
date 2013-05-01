/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.james137137.ChatChannel;

import java.util.ArrayList;
import java.util.List;
import org.bukkit.entity.Player;

/**
 *
 * @author James
 */
public class Channel {
    
    private String channelName;
    private List<String> memberList = new ArrayList<>();
    private List<Player> onlineMembers = new ArrayList<>();
    private List<String> invitedPlayers = new ArrayList<>();
    private List<String> joinedMembers = new ArrayList<>();
    private List<String> bannedPlayers = new ArrayList<>();
    private List<String> mutedMembers = new ArrayList<>();
    private List<Player> guestMembers = new ArrayList<>();
    private List<Player> FullMembers = new ArrayList<>();
    private List<Player> ModeratorMembers = new ArrayList<>();
    private List<Player> AdminMembers = new ArrayList<>();
    private List<Player> CoOwnerMembers = new ArrayList<>();
    private String Creator;
    
    public Channel(Player player,String channelName)
    {
            this.channelName = channelName;
            String playerName = player.getName();
            Creator = playerName;
            memberList.add(Creator);
        
    }
    
    public Channel(String channelName)
    {
        
    }
    
    
    public static Channel getChannel(String channelName)
    {
        return new Channel(channelName);
    }
    
    public void reloadChannel()
    {
        System.out.println("test");
    }
    
    public void changePlayerGroup
            ()
    
}
