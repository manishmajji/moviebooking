package com.capgemini.dao;

import java.util.Map;

import com.capgemini.util.Repository;

public class ShowDao implements IShowDao {
	public Map getShowmap()
	{
		return Repository.showMap;
	}

}
