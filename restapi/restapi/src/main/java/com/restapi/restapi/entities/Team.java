//Implementation  by PrashantArya

package com.restapi.restapi.entities;


import java.util.Objects;




public class Team {

	private long id;                       //Team Id Variable 
	private String teamName;               //Team Name Variable 
	private String captain;                //Team Captain Variable 
	private String location;               //Team Location Variable 
	private String created_at;             //Team Created_At Variable 
	private String updated_at;             //Team Updated_At Variable 
	


	//This Constructor are no parameterless constructor
	public Team() {
		}


	
	//Team Class Constructor and this Constructor initialize variable when Team class object are created   
	public Team(long id, String teamName, String captain, String location, String created_at, String updated_at) {
		this.id = id;
		this.teamName = teamName;
		this.captain = captain;
		this.location = location;
		this.created_at = created_at;
		this.updated_at = updated_at;
	}


	//Team Class Team Id Getter 
	public long getId() {
		return id;
	}



	//Team Class Team Id Setter
	public void setId(long id) {
		this.id = id;
	}



	//Team Class Team Name Getter
	public String getTeamName() {
		return teamName;
	}


	//Team Class Team Name Setter
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}



	//Team Class Team Captain Getter
	public String getCaptain() {
		return captain;
	}



	//Team Class Team Captain Setter
	public void setCaptain(String captain) {
		this.captain = captain;
	}



	//Team Class Team Location Getter
	public String getLocation() {
		return location;
	}



	//Team Class Team Location Setter
	public void setLocation(String location) {
		this.location = location;
	}

	


	//Team Class Team Created_At Getter
	public String getCreated_at() {
		return created_at;
	}



	//Team Class Team Created_At Setter
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}



	//Team Class Team Updated_At Getter
	public String getUpdated_at() {
		return updated_at;
	}



	//Team Class Team Updated_At Setter
	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}


	//Team Class HasCode Method
	@Override
	public int hashCode() {
		return Objects.hash(captain, created_at, id, location, teamName, updated_at);
	}


	//Team Class Equals Method  
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Team other = (Team) obj;
		return Objects.equals(captain, other.captain) && Objects.equals(created_at, other.created_at) && id == other.id
				&& Objects.equals(location, other.location) && Objects.equals(teamName, other.teamName)
				&& Objects.equals(updated_at, other.updated_at);
	}


	//Team Class ToString Method
	@Override
	public String toString() {
		return "Team [id=" + id + ", teamName=" + teamName + ", captain=" + captain + ", location=" + location
				+ ", created_at=" + created_at + ", updated_at=" + updated_at + "]";
	}
	
	
	
	
	

}
