package com.capgemini.dao;

import java.util.Map;

import com.capgemini.util.BookingCollection;
import com.capgemini.util.TicketCollection;

public class TicketDAO {
	public static Map<String,Long> getTicketmap() {
		return TicketCollection.tickets;
	}
	
}
