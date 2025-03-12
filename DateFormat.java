import java.time.format.DateTimeFormatter;
import java.time.*;

class DateFormat{
	public static void main(String[] args){
		
		LocalDate current = LocalDate.now();
		
		DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE , MMM dd, yyyy");
		
		System.out.println("Date in format dd/MM/yyyy: " + current.format(format1));
		System.out.println("Date in format yyyy-MM-dd: " + current.format(format2));
		System.out.println("Date in format EEE , MMM dd, yyyy: " + current.format(format3));
	}
}
/*
Date in format dd/MM/yyyy: 12/03/2025
Date in format yyyy-MM-dd: 2025-03-12
Date in format EEE , MMM dd, yyyy: Wed , Mar 12, 2025
*/