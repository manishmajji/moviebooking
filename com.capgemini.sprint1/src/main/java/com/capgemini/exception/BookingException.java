package com.capgemini.exception;

public class BookingException extends Exception {

	public BookingException() {
		
	}
	public BookingException(String string){
		System.err.println(string);
	}
}
