//Implementation  by PrashantArya

package com.restapi.restapi.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.restapi.restapi.entities.Player;
import com.restapi.restapi.entities.Team;




/*There are PlayerServiceImpl  class and there implments  Player Service Interface method  and this are
 *  defined the service rules for Player methods 
 */




@Service
public class PlayerServiceImpl implements PlayerService{

	
	List<Player> list2;
	
	
	
	public PlayerServiceImpl() {
	
		
	    //List object  using ArrayList	
		list2= new ArrayList<>();
	
	
		//This list data use for team data store and demo practices 


		//Format
		//(TeamID/PlayerName/PlayerAge/PlayerTeam/null/)
		list2.add(new Player(18,"Virat Kohli",33,"null","Null",3));
		list2.add(new Player(45,"Rohit Sharma",34,"null","Null",6));
		list2.add(new Player(17,"Rishabh Pant",24,"null","Null",8));
		list2.add(new Player(7,"Mahendra Singh Dhoni",40,"null","Null",10));
					
	}
	


	
	//This  Method Setting the Implementation for GetPlayer  
	@Override
	public List<Player> getPlayer() {
		
		return list2;
	}


	//This  Method declare Get Method Implementation Rules and  This Method return Player by Player Id
	@Override
	public Player getPlayer(long playerId) {

		 Player p = null;
		 for(Player player:list2) {
			 if(player.getPlayerId()==playerId)
			 {
				 p=player;
				 break;
			 }
		 }
		
		return p;
	}

	

	//This Method setting the addPlayer Implementation and this method use for store new Player  
	@Override
	public Player addPlayer(Player player) {
		     list2.add(player);
			return player;
		
	}

	


	//This Method Setting the implementation for updatePlayer Method and this method use for update the player 
	@Override
	public Player updatePlayer(Player player) {
       
		list2.forEach(e ->{
			if(e.getPlayerId() == player.getPlayerId()) {
				e.setName(player.getName());
				e.setAge(player.getAge());
				
			}
		});
		return player;
	}



	//This Method Setting the implementation for deletePlayer Method and this method use for delete the player
	@Override
	public void deletePlayer(long parseLong) {
      list2=this.list2.stream().filter(e->e.getPlayerId()!=parseLong).collect(Collectors.toList());		
	}
	
		
}
