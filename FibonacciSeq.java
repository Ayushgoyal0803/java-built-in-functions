import java.util.*;

class FibonacciSeq{
	public static void main(String[] args){
		Scanner scn= new Scanner(System.in);
		
		int n = scn.nextInt();
		fibonacciSeq(n);
		
	}
	
	public static void fibonacciSeq(int n){
		int a =0;
		int b = 1;
		int c;
		for(int i=0;i<n;i++){
			System.out.print(a + " ");
			c = a+b;
			a=b;
			b=c;
		}
	} 
}