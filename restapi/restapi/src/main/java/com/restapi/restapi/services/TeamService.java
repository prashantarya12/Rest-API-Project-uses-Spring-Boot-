//Implementation  by PrashantArya
package com.restapi.restapi.services;

import java.util.List;


import com.restapi.restapi.entities.Team;


//This Interface class Declare All Team Service Methods  
public interface TeamService {

	
	//This Method return list of Team by <List>    
	public List<Team> getTeam();

	
	//This Method return the  Team which teamId matching by user input TeamId 		
	public Team getTeam(long teamId);
	
	
	//This Method using for Add a Team Given by user  	
	public Team addTeam(Team team);

	
	//This Method use for update the Team which user input request requirement   
	public Team updateTeam(Team team);
	
	
	//This Method Use for Delete the Team which user request  
	public void deleteTeam(long parseLong);
	
}
