package com.capgemini.dto;

import java.time.LocalDate;

public class Booking {
	private int bookingId;
	
	private Show show;
	private LocalDate bookingDate;
	private int noOfTkts;
	private double totalCost;
	
	
	

	public Booking(int bookingId, Show show, LocalDate bookingDate, int noOfTickets) {
		super();
		this.bookingId = bookingId;
		this.show = show;
		this.bookingDate = bookingDate;
		this.noOfTkts = noOfTickets;
	}


	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}


	public Show getShow() {
		return show;
	}

	public void setShow(Show show) {
		this.show = show;
	}

	public LocalDate getBookingDate() {
		return bookingDate;
	}


	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}

	public int getNoOfTkts() {
		return noOfTkts;
	}


	public void setNoOfTkts(int noOfTkts) {
		this.noOfTkts = noOfTkts;
	}

	public double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}



	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", show=" + show + ", bookingDate=" + bookingDate + ", noOfTkts="
				+ noOfTkts + ", totalCost=" + totalCost + "]";
	}



	
	
	
	
	}

