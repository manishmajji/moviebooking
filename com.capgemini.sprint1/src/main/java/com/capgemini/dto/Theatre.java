package com.capgemini.dto;

public class Theatre {
	private int theatre_id;
	private String theatre_name;
	private String city;
	private String managerName;
	private String managerContact;
	
	public int getTheatre_id() {
		return theatre_id;
	}

	public void setTheatre_id(int theatre_id) {
		this.theatre_id = theatre_id;
	}

	public String getTheatre_name() {
		return theatre_name;
	}

	public void setTheatre_name(String theatre_name) {
		this.theatre_name = theatre_name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String getManagerContact() {
		return managerContact;
	}

	public void setManagerContact(String managerContact) {
		this.managerContact = managerContact;
	}
	
public Theatre() {
		
	}

	public Theatre(int theatre_id, String theatre_name, String city, String managerName, String managerContact) {
		super();
		this.theatre_id = theatre_id;
		this.theatre_name = theatre_name;
		this.city = city;
		this.managerName = managerName;
		this.managerContact = managerContact;
	}
	
}
