package com.capgemini.dao;

import java.util.Map;

import com.capgemini.util.Repository;

public class TheaterDao implements ITheaterDao {
	public Map gettheatermap()
	{
		return Repository.theatreMap;
	}

}
