package com.capgemini.dto;

public class Movie {
	private int movieId;
	private String movieName;
	private String language;
	private String director;
	private String genre;
	
	
	
	public Movie(int movie_id, String movie_name, String language, String director, String genre )
	{
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.language = language;
		this.director = director;
		this.genre = genre;
		}
	
	
	
	public int getMovie_id() {
		return movieId;
	}
	public void setMovie_id(int movie_id) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovie_name(String movie_name) {
		this.movieName = movieName;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public Movie() {
		
	}
	
	
}

