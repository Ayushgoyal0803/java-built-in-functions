import java.util.*;

class IsPalindrome{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		
		String st = scn.nextLine();
		
		if(palindrome(st)){
			System.out.print(st + " is a palindrome.");
		}
		else{
			System.out.print(st + " is not a palindrome.");
		}
		
	}
	
	public static boolean palindrome(String st){
		if(st.length() <2){
			return true; 
		}
		
		int start = 0;
		
		int end = st.length() -1;
		
		while(start < end){
			if(st.charAt(start) != st.charAt(end)){
				return false;
			}
			
			start++;
			end--;
		}
		
		return true;
	}
}

/*
(())
(()) is not a palindrome.
*/

/*
racecar
racecar is a palindrome.
*/