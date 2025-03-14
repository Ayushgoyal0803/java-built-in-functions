import java.util.Scanner;

class IsPrime{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = scn.nextInt();
		
		if(isPrime(n)){
			System.out.print(n + " is a prime number.");
		}
		else{
			System.out.print(n + " is not a prime number.");
		}
		
	}
	
	public static boolean isPrime(int n){
		if(n<2){
			return false;
		}
		
		for(int i=2;i<n;i++){
			if(n%i==0){
				return false;
			}
		}
		
		return true;
	}
}