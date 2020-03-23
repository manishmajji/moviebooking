package com.capgemini.dto;

public class Show {
	private int showid;
	private int slot;
	private int seats;
	private Screen screen;
	private Movie movie;
	
	public Show(int showid, int slot, int seats, Screen screen) {
		super();
		this.showid = showid;
		this.slot=slot;
		this.seats = seats;
		this.screen = screen;
		
	}
	
	
	public Show(int showid, int slot, int seats, Movie movie) {
		super();
		this.showid = showid;
		this.slot = slot;
		this.seats = seats;
		this.movie = movie;
	}


	public Show() {
		
	}
	public int getSlot() {
		return slot;
	}

	public void setSlot(int slot) {
		this.slot = slot;
	}

	public Screen getScreen() {
		return screen;
	}

	public void setScreen(Screen screen) {
		this.screen = screen;
	}

	public int getShowid() {
		return showid;
	}
	public void setShowid(int showid) {
		this.showid = showid;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	
	

}
