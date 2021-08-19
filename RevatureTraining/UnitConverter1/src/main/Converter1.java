package main;

import java.util.Scanner;

public class Converter1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int menuSelection = 0;
		int quantity= 0;
		
		
		while (menuSelection !=4) {
			
			System.out.println("Please select an option"
					+ "\n1 Cups to Teaspoons"
					+ "\n2 Miles to Kilometers"
					+ "\n3 US gallons to Imperial gallons"
					+ "\n4 Quit");
			menuSelection = scan.nextInt(); 
			
			switch (menuSelection) {
			case 1: 
				System.out.println("How many Cups");
				quantity= scan.nextInt(); 
				System.out.println("Number of cups "+ quantity + " is equal to " + quantity*48+ " teaspoons"); 
				break; 
				
			case 2: 
				System.out.println("How many Miles"); 
				quantity= scan.nextInt(); System.out.println("Number of miles "+ quantity + " is equal to " + quantity*1.60934+ " kilometers");
				break;
			
			
			case 3: 
				System.out.println("How many US Gallons");
				quantity= scan.nextInt(); 
				System.out.println("Number of US Gallons "+ quantity + " is equal to " + quantity*0.832674+ " Imperial Gallons");
				break; 
				
			case 4: 
				System.out.println("Quit"); 
				break; 
			
			
			}
			
			
			
			
		}

	}

}
