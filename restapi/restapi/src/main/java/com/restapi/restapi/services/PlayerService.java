//Implementation  by PrashantArya

package com.restapi.restapi.services;

import java.util.List;

import com.restapi.restapi.entities.Player;

//This Interface class Declare All Players Service Methods  
public interface PlayerService {


	
	
	//This Method return list of Player by <List>
    public List<Player> getPlayer();
	
    
    
    //This Method return the  player which playerId matching by user input PlayerId 
	public Player getPlayer(long playerId);
	
	
	//This Method using for Add a player Given by user  
	public Player addPlayer(Player player);

	
	//This Method use for update the Player which user input request requirement   
	public Player updatePlayer(Player player);
	
	
	//This Method Use for Delete the player which user request  
	public void deletePlayer(long parseLong);
	
	
	


}
