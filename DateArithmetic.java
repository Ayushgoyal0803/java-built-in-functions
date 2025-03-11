import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

class DateArithmetic {
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter a date in DD-MM-YYY format: ");
		String date = scn.nextLine();
		DateTimeFormatter input = DateTimeFormatter.ofPattern("dd-MM-yyyy"); 
		LocalDate local = LocalDate.parse(date,input);
		LocalDate modified = local.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);
		System.out.print("Initial date: " + local.format(input));
		System.out.print("Modified date: " + modified.format(input));
		
	}
}	
/*
Enter a date in DD-MM-YYY format: 12-12-2025
Initial date: 12-12-2025Modified date: 29-12-2027
*/