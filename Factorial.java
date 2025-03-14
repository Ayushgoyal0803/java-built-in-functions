import java.util.*;

class Factorial{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		
		long n = scn.nextInt();
		if(n<0){
			System.out.print("enter a positive integer.");
			System.exit(1);
		}
		
		output(n);
		
	}
	
	public static long fact(long n){
		if(n<2){
			return 1; 
		}
		
		return n * fact(n-1);
		
	}
	
	public static void output(long n){
		System.out.println("Factorial of " + n + " is: " + fact(n));
	}
}