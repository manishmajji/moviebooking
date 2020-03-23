package com.capgemini.dto;

import java.time.LocalDate;

public class Screen {
	private int screen_id;
	private int theatre_id;
	private String Screen_Name;
	private int row;
	private int column;
	private LocalDate movieEndDate;
	private Theatre theatre;
	

	public Theatre getTheatre() {
		return theatre;
	}

	public void setTheatre(Theatre theatre) {
		this.theatre = theatre;
	}

	public int getScreen_id() {
		return screen_id;
	}

	public void setScreen_id(int screen_id) {
		this.screen_id = screen_id;
	}

	public int getTheatre_id() {
		return theatre_id;
	}

	public void setTheatre_id(int theatre_id) {
		this.theatre_id = theatre_id;
	}

	public String getScreen_Name() {
		return Screen_Name;
	}

	public void setScreen_Name(String screen_Name) {
		Screen_Name = screen_Name;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	public LocalDate getMovieEndDate() {
		return movieEndDate;
	}

	public void setMovieEndDate(LocalDate movieEndDate) {
		this.movieEndDate = movieEndDate;
	}

	public Screen() {
		
	}
	public Screen(int screen_id, int theatre_id, String screen_Name, int row, int column, LocalDate movieEndDate, Theatre theatre) {
		super();
		this.screen_id = screen_id;
		this.theatre_id = theatre_id;
		this.Screen_Name = screen_Name;
		this.row = row;
		this.column = column;
		this.movieEndDate = movieEndDate;
		this.theatre = theatre;
	}

}
