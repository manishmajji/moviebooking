package com.capgemini.dao;

import java.util.Map;

import com.capgemini.util.Repository;

public class MovieDao implements IMovieDao {
	public Map getMoviemap()
	{
		return Repository.movieMap;
	}

}
