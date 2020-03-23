package com.capgemini.service;
import java.util.List;

import java.util.Map;
import java.util.Random;
import java.util.Scanner;

import com.capgemini.dao.BookingDao;
import com.capgemini.dao.TicketDAO;
import com.capgemini.dto.Seat;
import com.capgemini.exception.BookingException;
import com.capgemini.exception.SeatsException;
import com.capgemini.util.BookingCollection;
import com.capgemini.util.Repository;
import com.capgemini.util.TicketCollection;

public class BookingService{
	/**************************************************************************************************************
	 * @author Manish
	 * 			Description : The method below blocks seats from the map seat
	 * @param noOfSeats : it will be fetch number of seats from user
	 * @param row : it will fetch row from user
	 * @param seats : it will fetch the seats entered from user
	 * @param stringarr : it will fetch rows and convert it to string for further processing
	 * @param val1 : it is used to iterate
	 * @return Boolean
	 * @throws SeatsException : if the number of seats entered is negative then it will raise
	 * **************************************************************************************************************
	 */
	public boolean chooseSeats(int noOfSeats,int seats[],String stringarr[]){
			for(int val2=0;val2<noOfSeats;val2++){
				if(BookingCollection.mapseat.containsKey(stringarr[val2])){
					for(int val=0;val<9;val++){
						for(int seatno=0;seatno<noOfSeats;seatno++){
							if(BookingCollection.list.get(val)==seats[seatno])
								BookingCollection.mapseat.remove(seats[seatno]);
						}
					}
				}
			}
			return true;
		
		
	}
	/*****************************************************************************************************************
	 * @author Manish
	 * 		Description : The method below returns total cost for the seats given by user
	 * @param noOfSeats : it will fetch the number of seats from user
	 * @param row : it will fetch row from user
	 * @param pricefortoprows : it will fetch price for top rows
	 * @param priceformiddlerows : it will fetch price for middle rows
	 * @param priceforbottomrows : it will fetch price for bottom rows
	 * @param totalCost : it will calculate total cost
	 * @return Integer
	 * @throws BookingException : if the entered row is not valid then it will raise 
	 * ***************************************************************************************************************
	 */
	public Double calculateTotalCost(int noOfSeats, char row[],double pricefortoprows,double priceformiddlerows,double priceforbottomrows,double totalCost) throws BookingException {
		
		for(int iter=0;iter<noOfSeats;iter++){
			if(row[iter]=='A'||row[iter]=='B'||row[iter]=='C')
				totalCost=totalCost+pricefortoprows;
			else if(row[iter]=='D'||row[iter]=='E'||row[iter]=='F')
				totalCost=totalCost+priceformiddlerows;
			else if(row[iter]=='G'||row[iter]=='H'|row[iter]=='I')
				totalCost=totalCost+priceforbottomrows;
			else
			{
				throw new BookingException("enter valid row");
			}
		}
		return totalCost;
	}
	/*********************************************************************************************
	 * @author Manish
	 * 		Description : The method below returns if the user chose any payment method or not
	 * @param confirm : it fetches whether the user has confirmed the payment or not
	 * @return Boolean
	 */
	public boolean choosePaymentMethod(String confirm) {
		if(confirm.equals("yes")) {
		return true;}
		else
			return false;
	}
	/********************************************************************************************
	 * @author Manish
	 * 		Description : The method below returns transactionId after the payment
	 * @param ran : it is the object of Random class
	 * @param numbers : it fetches the string of zero to nine numbers
	 * @param transId : it stores the randomly generated numbers in a character array
	 * @param transactionId : it calculates the transactionId after payment
	 * @return Integer
	 * ******************************************************************************************
	 */
	public int makePayment(Random ran,String numbers,char[]transId,int transactionId) {
        for (int iter = 0; iter < 6; iter++) { 
            transId[iter] = numbers.charAt(ran.nextInt(numbers.length())); 
        }
        transactionId = Integer.parseInt(new String(transId));
		return transactionId;
	}
	/***********************************************************************************************************
	 * @author Manish
	 * 		Description : the method returns the ticket details after the payment is successfully completed
	 * @return Map
	 * *********************************************************************************************************
	 */
	public Map showTicket() {
		return TicketDAO.getTicketmap();
	}
	/*********************************************************************
	 * @author Manish
	 * 		Description : The method below adds the seats to the mapseat
	 * @param noOfSeats : it will be fetch number of seats from user
	 * @param row : it will fetch row from user
	 * @param seat : it will fetch the seats entered from user
	 * @param stringarr : it will fetch rows and convert it to string for further processing
	 * @param val1 : it is used to iterate
	 * @return Boolean
	 * ********************************************************************
	 */
	public boolean cancelBookings(int noOfSeats,int seat[],String stringarr[]) {
		for(int val2=0;val2<noOfSeats;val2++){		
			if(BookingCollection.mapseat.containsKey(stringarr[val2])){		
				for(int val=0;val<9;val++){		
					for(int seatno=0;seatno<noOfSeats;seatno++){
						if(BookingCollection.list.get(val)==seat[val2])
							BookingCollection.list.add(seat[val2]);
					}
				}
			}
		}
		return true;
	}
}
