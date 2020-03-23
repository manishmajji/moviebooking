package com.capgemini.util;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.Map;

import com.capgemini.dto.Booking;

public class BookingCollection {
	public static   HashMap<String, ArrayList> mapseat = new HashMap<String,ArrayList>();
	
	public static ArrayList<Integer> list=new ArrayList<Integer>();
	static
	{
	 
		for(int i=0;i<10;i++)
		{
			list.add(i+1);
		}
		
		String value = "A";
		String next;
		for(int i=0;i<9;i++)
		{
			int charValue = value.charAt(0);
			next = String.valueOf( (char) (charValue + i));
			mapseat.put(next,list);
		}
		
	}

}