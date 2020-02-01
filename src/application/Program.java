package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entites.Reservation;

public class Program {
	
	//propagando a exce��o
	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Room number: ");
		int number = sc.nextInt();
		
		System.out.println("Check-in date (dd/MM/yyyy): ");
		Date checkIn = sdf.parse(sc.next());
		System.out.println("Check-out date (dd/MM/yyyy): ");
		Date checkOut = sdf.parse(sc.next());
		
		if(!checkOut.after(checkIn)) {
		
			System.out.println("Erro in reservation: check-out date  must be after check-in date");
		
		}else {
			
			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println("Reservation: " + reservation);		
			
			System.out.println();
			System.out.println("Enter date to update the reservation:");

			System.out.println("Check-in date (dd/MM/yyyy): ");
			checkIn = sdf.parse(sc.next());
			System.out.println("Check-out date (dd/MM/yyyy): ");
			checkOut = sdf.parse(sc.next());
			
			//mudan�a-01 do codigo nessa parte
			String error = reservation.updateDates(checkIn, checkOut);
			if(error != null) {
				System.out.println("erro in reservation: " + error);		
			}else {
				System.out.println("Reservation: " + reservation);
		
			}
		}
		
		sc.close();
	}

}
