package com.capgemini.client;

import java.util.Map;
import java.util.Random;
import java.util.Scanner;

import com.capgemini.dao.BookingDao;
import com.capgemini.dao.TicketDAO;
import com.capgemini.dto.Seat;
import com.capgemini.exception.BookingException;
import com.capgemini.exception.SeatsException;
import com.capgemini.service.BookingService;
import com.capgemini.util.BookingCollection;

public class Client {

	public static void main(String[] args) throws SeatsException, BookingException {
		// TODO Auto-generated method stub
		double pricefortoprows=200;
		double priceformiddlerows=150;
		double priceforbottomrows=100;
		double totalCost=0;
		for(Map.Entry m:BookingCollection.mapseat.entrySet()){  
			   System.out.println(m.getKey()+" "+m.getValue());  
		  }
		int option;
		int canceloption=0;
		BookingService bookingservice = new BookingService();
		Scanner input = new Scanner(System.in);
		while(true){
			
			System.out.println("Enter the option: ");
			System.out.println("1. Booking tickets: ");
			System.out.println("2. Exit: ");
			option=input.nextInt();
		switch(option){
		case 1:{
			System.out.println("Enter the no. of seats:");
			int noOfSeats=input.nextInt();
			if(noOfSeats>0) {
			char row1 = 0;
			char[] row = new char[noOfSeats];
			int[] seats=new int[noOfSeats];
			String[] stringarr = new String[row.length];
			int val1=0;
			for (char iter : row) {
	            stringarr[val1]=Character.toString(iter);
	            val1++;
	        }
			for(int i=0;i<noOfSeats;i++){
				System.out.println("Enter row: ");
				row1=input.next().charAt(0);
				row[i]=row1;
				System.out.println("Enter seat number: ");
				seats[i]=input.nextInt();
			}
			bookingservice.chooseSeats(noOfSeats,seats,stringarr);
			
			//bookingservice.chooseSeats(noOfSeats,seats,stringarr);
			System.out.println("Total Cost: "+bookingservice.calculateTotalCost(noOfSeats, row,pricefortoprows,priceformiddlerows,priceforbottomrows,totalCost));
			//System.out.println(row);
			//choose payment method
			int paymentoption;
			String confirm="";
			while(true) {
			System.out.println("Enter your payment option: ");
			System.out.println("1. Debit card ");
			System.out.println("2.Credit card ");
			System.out.println("3. Net banking ");
			System.out.println("4. Paytm ");
			paymentoption = input.nextInt();
			String numbers = "0123456789";
			Random ran = new Random(); 
	        char[] transId = new char[6]; 
	        int transactionId=0;
			while(true){
				switch(paymentoption){
				case 1:{
					System.out.println("Do you want to confirm the payment via Debit card(yes/no): ");
					confirm=input.next();
					if(confirm.equals("yes")){
						System.out.println("Confirmed payment via Debit card: ");
						//making payment
						bookingservice.choosePaymentMethod(confirm);
						System.out.println("transactionId: " +bookingservice.makePayment(ran,numbers,transId,transactionId));
						//ticket details
						bookingservice.showTicket();
						break;
					}
					else
						break;
				}
				case 2:{
					System.out.println("Do you want to confirm the payment via Credit card(yes/no): ");
					confirm=input.next();
					if(confirm.equals("yes")){
						System.out.println("Confirmed payment via Credit card: ");
						//making payment
						System.out.println("transactionId: " +bookingservice.makePayment(ran,numbers,transId,transactionId));
						//ticket details
						bookingservice.showTicket();
						break;
					}
					else
						break;
				}
				case 3:{
					System.out.println("Do you want to confirm the payment via NetBanking(yes/no): ");
					confirm=input.next();
					if(confirm.equals("yes")){
						System.out.println("Confirmed payment via NetBanking: ");
						//making payment
						System.out.println("transactionId: " +bookingservice.makePayment(ran,numbers,transId,transactionId));
						
						//ticket details
						bookingservice.showTicket();
						break;
					}
					else
						break;
				}
				case 4:{
					System.out.println("Do you want to confirm the payment via paytm(yes/no): ");
					confirm=input.next();
					if(confirm.equals("yes")){
						System.out.println("Confirmed payment via paytm: ");
						//making payment
						System.out.println("transactionId: " +bookingservice.makePayment(ran,numbers,transId,transactionId));
						
						//ticket details
						bookingservice.showTicket();
						break;
					}
					else
						break;
				}
				}
				if(confirm.equals("yes"))
					break;
			}
			break;
			}
			System.out.println("******************************************");
			System.out.println("Enter 1 for Cancel booking: ");
			System.out.println("Enter 2 for Exit");
			canceloption=input.nextInt();
			String[] stringarr1 = new String[row.length];
			int val2=0;
			for (char convert : row) {
	            stringarr1[val2]=Character.toString(convert);
	            val2++;
	        }
			switch(canceloption){
			case 1:{
				System.out.println("******** Tickets cancelled successfully ***********" + bookingservice.cancelBookings(noOfSeats,seats,stringarr1));
				break;
			}
			case 2:{
				break;
			}
			}
			if(canceloption==2||canceloption==1)
				break;
			
		}
		else {throw new SeatsException("Seats cannot be negative");}
		
		}
		case 2:
		{
			break;
		}
		}
		
	}	
}}

