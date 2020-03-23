package com.capgemini.dao;

import java.util.Map;

import com.capgemini.dto.Booking;
import com.capgemini.util.BookingCollection;

public class BookingDao {
	
		public Map getMap() {
			return BookingCollection.mapseat;
	}

}
