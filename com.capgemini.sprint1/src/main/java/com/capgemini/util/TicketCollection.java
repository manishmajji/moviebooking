package com.capgemini.util;

import java.util.HashMap;

public class TicketCollection {
	public static HashMap<String,Long> tickets = new HashMap<String,Long>();
	static{
		tickets.put("customerId",334356L);
		tickets.put("theaterId",2355L);
		tickets.put("movieId",3566L);
		tickets.put("screenId",12355L);
		tickets.put("showId",44333533L);
		String bookId="";
		Long customerId = tickets.get("customerId");
		String cusId=Long.toString(customerId);
		Long theaterId=tickets.get("theaterId");
		String theatId=Long.toString(theaterId);
		Long showId=tickets.get("showId");
		String shId=Long.toString(showId);
		bookId = cusId.substring(0,3) + theatId.substring(0,3) + shId.substring(0,4);
		long bookingId=Long.parseLong(bookId);
		tickets.put("bookingId",bookingId);
	}

}
