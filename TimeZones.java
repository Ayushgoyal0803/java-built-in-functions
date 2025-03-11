import java.time.*;

class TimeZones{
	public static void main(String[] args){
		ZonedDateTime currentGMT = ZonedDateTime.now(ZoneId.of("GMT"));
		ZonedDateTime currentIST = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
		ZonedDateTime currentPST = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
		
		System.out.println("GMT " + currentGMT);
		System.out.println("IST " + currentIST);
		System.out.println("PST " + currentPST);
	}
}

/*
GMT 2025-03-11T09:00:14.017203700Z[GMT]
IST 2025-03-11T14:30:14.032884300+05:30[Asia/Kolkata]
PST 2025-03-11T02:00:14.033391-07:00[America/Los_Angeles]
*/