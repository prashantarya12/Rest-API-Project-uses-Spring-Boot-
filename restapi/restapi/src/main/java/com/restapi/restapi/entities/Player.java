//Implementation  by PrashantArya
package com.restapi.restapi.entities;




public class Player {


	
 
	private long playerId;       //Player Id variable
	private String name;          //Player Name variable
	private int age;              //Player age variable
	private String created_at;     
	private String updated_at;
	private int team_id;          // Player team id Variable
	
	
	
	//Player Class Constructor and this Constructor initialize variable when Player class object are created   
	public Player(long playerId, String name, int age, String created_at, String updated_at, int team_id) {
		this.playerId = playerId;
		this.name = name;
		this.age = age;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.team_id = team_id;
	}

	
     //This are no parameterless constructor 
	public Player() {
	
	}



	//Player class  player id  getter
	public long getPlayerId() {
		return playerId;
	}

	

	//Player class PlayerID setter
	public void setPlayerId(long playerId) {
		this.playerId = playerId;
	}


	//Player class Player Name Getter 
	public String getName() {
		return name;
	}


	//Player class Player Name Setter
	public void setName(String name) {
		this.name = name;
	}


	//Player class Player Age Getter
	public int getAge() {
		return age;
	}

	//Player class Player Age Setter
	public void setAge(int age) {
		this.age = age;
	}

   //Player Class Player Created_At Getter
	public String getCreated_at() {
		return created_at;
	}

	//Player class Player Created_at Setter
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

    //Player class Player Updated_At Getter
	public String getUpdated_at() {
		return updated_at;
	}


	//Player class Player Updated_At Setter
	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}


	//Player class Player Player Getter
	public int getTeam_id() {
		return team_id;
	}


	//Player class Player Player Setter
	public void setTeam_id(int team_id) {
		this.team_id = team_id;
	}



//	//Player class Player hash code Method 
//	@Override
//	public int hashCode() {
//		return Objects.hash(age, created_at, name, playerId, team_id, updated_at);
//	}
//
//
//	//Player Class Equals Method 
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Player other = (Player) obj;
//		return Objects.equals(age, other.age) && Objects.equals(created_at, other.created_at)
//				&& Objects.equals(name, other.name) && playerId == other.playerId
//				&& Objects.equals(team_id, other.team_id) && Objects.equals(updated_at, other.updated_at);
//	}
//

	//Player class ToString Method
	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", name=" + name + ", age=" + age + ", created_at=" + created_at
				+ ", updated_at=" + updated_at + ", team_id=" + team_id + "]";
	}
	

	
	

	
}
