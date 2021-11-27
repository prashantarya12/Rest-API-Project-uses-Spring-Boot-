
//Implementation  by PrashantArya
package com.restapi.restapi.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.restapi.entities.Player;
import com.restapi.restapi.entities.Team;
import com.restapi.restapi.services.PlayerService;
import com.restapi.restapi.services.TeamService;



@RestController
public class MyController {

	//This are variable for making object for loose coupling

	@Autowired
	private TeamService teamService;
    
	@Autowired
	private PlayerService playerService;

	

	
//	//This method for home page 
//	@GetMapping("/homePageDemo")
//	public String home() {
//		return "this is home page";
//	}
	
	
	

	//Team Controller Part
	
	
	//This Controller Method use  for Get  All Teams list  	

	@GetMapping("/teams")
	public List<Team> getTeam()
	{

		return this.teamService.getTeam();
	}



	//This Controller Method  use for Get Team  by Team ID  

	@GetMapping("/team/{courseId}")
	public Team getTeam(@PathVariable long teamId) 
	{
		return this.teamService.getTeam(teamId);
	
	}
	

	
	
	//This  Controller Method using  for Adding  new Team 
	@PostMapping("/team")
	public Team addTeam(@RequestBody Team team) 
	{
		return this.teamService.addTeam(team);
	}

	

	
	//This  Controller method using  for update Any Team using PUT request
	@PutMapping("/team")
	public Team updateTeam(@RequestBody Team team)
	{
		return this.teamService.updateTeam(team);
	}


	
    /*This  Controller Method using for Delete the Team, if team are delete then its return a message HttpStatus Ok 
     * if not delete team then its return a message  INTERNAL_SERVER_ERROR 
     */    
    @DeleteMapping("/team/{teamId}")
	public ResponseEntity<HttpStatus> deletePlayer(@PathVariable String teamId){
	
		try {
			this.teamService.deleteTeam(Long.parseLong(teamId));
			return new ResponseEntity<>(HttpStatus.OK);		
		}
		catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	


    

/////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	//Players Controllers  part
	
    
    
    
	//This  Controller Method use  for Get  All Teams list  		
	@GetMapping("/players")
    public List<Player> getPlayer()
	{
	   return this.playerService.getPlayer();
    }

	

	//This  Controller Method Using  Find a Player by Id 
	@GetMapping("/player/{playerId}")
	public Player getPlayer(@PathVariable int playerId) {
		return this.playerService.getPlayer(playerId);
	}

	
	

	//This  Controller  Method Using for Adding New Player 
	@PostMapping("/player")
   public Player addPlayer(@RequestBody Player player) {
	   return this.playerService.addPlayer(player);
   }
	
	

	//This  Controller  Method Using for Update player using PUT request
	@PutMapping("/player")
	public Player updatePlayer(@RequestBody Player player) {
		return this.playerService.updatePlayer(player);
	}
	
	
	
	
	//Delete the player 
   @DeleteMapping("/player/{playerId}")
	public ResponseEntity<HttpStatus> deletePlayer(@PathVariable long playerId){
	
		try {
			this.playerService.deletePlayer(playerId);
			return new ResponseEntity<>(HttpStatus.OK);		
		}
		catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	
	
	
	
}



