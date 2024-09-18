package studio3;

import java.util.Scanner;

public class Sieve {
		
		
	public static void main(String[] args) {
		
		 Scanner in = new Scanner(System.in);
	
		System.out.println("what is the starting N Value? ");
		
		int Nvalue = in.nextInt();
				
		int[] numbers = new int[Nvalue + 1];
	
		
		
	for ( int i = 2; i < numbers.length; i++) {
	
				for ( int j = i*2; j < numbers.length; i+=i) {
					numbers[j] = 1;
					
		}
	}
}
}
	


	
