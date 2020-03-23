package com.capgemini.sprint1;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import com.capgemini.exception.SeatsException;

import com.capgemini.service.BookingService;

public class Testing {
	
	BookingService b = new BookingService();
	static String[] rows=new String[] {"A","B"};
	static int[] seats=new int[] {5,7};
	
	
	@Test
	@DisplayName("PaymentMethod")
	public void choosePayment()
	{
		assertEquals(true,b.choosePaymentMethod("yes"));
	}
	@Test
	@DisplayName("Cancel")
	public void cancel()
	{
		String[] rows=new String[] {"A","B"};
		int[] seats=new int[] {5,7};
		assertEquals(true,b.cancelBookings(2, seats, rows));
	}
	@Test
	@DisplayName("ChooseSeats")
	public void choose() throws SeatsException
	{
		String[] rows=new String[] {"A","B"};
		int[] seats=new int[] {5,7};
		assertEquals(true,b.chooseSeats(2, seats, rows));
		
	}
	
	@Test
	@DisplayName("Exception")
	public void test() {
		int seat[]= new int[] {12,2};
		assertThrows(SeatsException.class,()->b.chooseSeats(2, seat, rows));
	}
	
}
