//Implementation  by PrashantArya
package com.restapi.restapi.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.restapi.restapi.entities.Team;


/*There are TeamServiceImpl  class and there implments  Team Service Interface method  and this are
 *  defined the service rules for Team  methods 
 */

@Service
public class TeamServiceImpl implements TeamService{


	//This Collection List using for Store Team Data 
	List<Team> list;
	
	
	public TeamServiceImpl() {
	
		
	    //List object  using ArrayList	
		list= new ArrayList<>();
	
	
		//This list object  use for team data store and demo practices 
		list.add(new Team(3,"RCB","Banglore","Virat","Banglore","null"));
		list.add(new Team(5,"MI","Mumbai","Rohit","Mumbai","null"));
		list.add(new Team(15,"DD","Delhi","Rishabh Pant","Delhi","null"));
		list.add(new Team(10,"CSK","Chennai","MS Dhoni","Chennai","null"));
				
	}
	

	//This Override Method Setting the Implementation for GetTeam  
	@Override
	public List<Team> getTeam() {
		return list;
	}


	//This Override Method Setting the Implementation for GetTeam and this method return team by teamId
	@Override
	public Team getTeam(long teamId) {
	     Team t=null;
	     for(Team team:list) {
	    	 if(team.getId()==teamId)
	    	 {
	    		 t=team;
	    		 break;
	    	 }
	     }
		return t;
	}

	


	//This Override Method Setting the Implementation for addTeam and this Method use for Add new team 
	@Override
	public Team addTeam(Team team) {
         list.add(team);
		return team;
	}




	//This Override Method Setting the Implementation for updateTeam  and this method updatePlayer  
	@Override
	public Team updateTeam(Team team) {

		list.forEach(e ->{
			if(e.getId() == team.getId()) {
				e.setTeamName(team.getTeamName());
				e.setCaptain(team.getCaptain());
				e.setCaptain(team.getCaptain());
			}
		});
		return team;
		
	}


	


	//This Override Method Setting the Implementation for deleteTeam and this method use for deleteTeam 
	@Override
	public void deleteTeam(long parseLong) {
		
		 list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());		

		
	}

	
	
	
	
}
