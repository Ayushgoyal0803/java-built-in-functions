import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.time.format.DateTimeParseException;

class CompareDates {
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		DateTimeFormatter input = DateTimeFormatter.ofPattern("dd-MM-yyyy"); 
		
		LocalDate local1 = null;
		
		LocalDate local2 = null;
		
		while(true){
			try{
				System.out.print("Enter first date in DD-MM-YYYY format: ");
				String date1 = scn.nextLine();
				local1 = LocalDate.parse(date1,input);
				break;
			}
			catch(DateTimeParseException ignored){
				System.out.println("Enter first date in correct format i.e. dd-MM-yyyy.");
			}
		}
		
		while(true){
			try{
				System.out.print("Enter second date in DD-MM-YYYY format: ");
				String date2 = scn.nextLine();
				local2 = LocalDate.parse(date2,input);
				break;
			}
			catch(DateTimeParseException ignored){
				System.out.println("Enter second date in correct format i.e. dd-MM-yyyy.");
			}
		}		
		
		
		if(local1.isEqual(local2)){
			System.out.print("Both dates are equal.");
		}
		else if(local1.isBefore(local2)){
			System.out.print(local1.format(input) + " is before the date " + local2.format(input) );
		}
		else{
			System.out.print(local1.format(input) + " is after the date " + local2.format(input) );
		}
		
		
		
	}
}	