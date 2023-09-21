package studio3;

import java.util.Scanner;

public class sieve {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		
		int arraySize = in.nextInt();
		
		boolean[] prime = new boolean[arraySize];
		
		for (int i = 2; i < arraySize; i++) {
			
			for (int j = i + i; j < arraySize; j += i) {
				
				prime[j - 1] = true;
				
			}
			
		}
		
		/* int[] primeNumbers = new int[arraySize];
		
		
		for (int i = 0; i < arraySize; i++) {
			
			
			if (prime[i]) {
				
				primeNumbers[i] = i + 1;
				
			}
			
		} */
		
		
		System.out.print("Primes: ");
		
		for (int i = 1; i < arraySize - 1; i++) {
			
			
			if (!prime[i]) {
				
				System.out.print((i + 1) + " ");
			
			}
		
		}
		
		
		
		

	}

}
