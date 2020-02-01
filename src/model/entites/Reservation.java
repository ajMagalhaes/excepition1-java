package model.entites;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
	
	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	//est�tico para que ele n�o seja criado a cada objeto gerado 
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Reservation() {
		// TODO Auto-generated constructor stub
	}

	public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}
	
	public long duration() {
		long diff = checkOut.getTime() - checkIn.getTime();  //qtde de milissegundos da data
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS); //convertendo o valor em milissegundos para dias
	}
	
	//Mudan�a01 do c�digo nessa parte 
	public String updateDates(Date checkIn, Date checkOut) {
		
		Date now = new Date();
		//verifando se a novas datas s�o v�lidas
		if(checkIn.before(now) || checkOut.before(now)) {
			return "Reservation dates for update must be future date";
		}
	    
		if(!checkOut.after(checkIn)) {
			return  "check-out date  must be after check-in date";
		}
		
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		
		//verica��o de sucesso
		return null;
	
	}
	
	@Override
	public String toString() {
		return "Room " + roomNumber + ", check-in: " + sdf.format(checkIn) + ", check-out: "
				+ sdf.format(checkOut) + ", " + duration() + " nights";
	}
}
