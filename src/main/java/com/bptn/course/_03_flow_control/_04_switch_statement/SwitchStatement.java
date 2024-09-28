package com.bptn.course._03_flow_control._04_switch_statement;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		int[] priceList = {10, 20, 50, 70};
		
		System.out.println("Welcome select a plan");
		System.out.println("please select a plan");
		System.out.println("1. 1GB - $10");
		System.out.println("2. 5GB - $30");
		System.out.println("3. 10GB - $50");
		System.out.println("4. unlimited - $70");
		System.out.println("5. Exit");
		
		
	
		int choiceInput;
		double userChange;
		boolean isRestart = false;

		
	do {	
		System.out.println("Enter the number of your choice");
		choiceInput = scanner.nextInt();
		System.out.println("How much you want to pay");

		 userChange = scanner.nextDouble(); 
		isRestart = false;
		switch(choiceInput) {
	case 1: 
		if(userChange >= 10) {
			if(userChange > 10) {
				System.out.println("Your change is" + (userChange-10));
			}
			System.out.println("Thanks for buying 1GB plan !");
		} else {
			
			System.out.println("dO YOU WANT TO RESTART?");
			isRestart = scanner.nextBoolean();


		}
	break;
	case 2: 
		if(userChange >= 30) {
			if(userChange > 30) {
				System.out.println("Your change is " + (userChange-30));
			}
			System.out.println("Thanks for buying 5GB plan !");
		} else {
			System.out.println("dO YOU WANT TO RESTART?");
			isRestart = scanner.nextBoolean();
		}
	break;
	case 3: 
		
		if(userChange >= 50) {
			if(userChange > 50) {
				System.out.println("Your change is " + (userChange-50));
			}
			System.out.println("Thanks for buying 30GB plan !");
		} else {
			System.out.println("dO YOU WANT TO RESTART?");
			isRestart = scanner.nextBoolean();
		}	
		break;
	default:System.out.println("Invalid Choice!");
	}
	}while(isRestart);
	
	
		

		/*switch(choiceInput) {
		case 1: System.out.println("You have selected the 1GB plan");
		System.out.println("The total cost of your selected plan is: $10");
		break;
		case 2: System.out.println("You have selected the 5GB plan");
		System.out.println("The total cost of your selected plan is: $30");
		break;
		case 3: System.out.println("You have selected the 10GB plan");
		System.out.println("The total cost of your selected plan is: $50");
		break;
		case 4: System.out.println("You have selected the Unlimited plan");
		System.out.println("The total cost of your selected plan is: $70");
		break;
		case 5: System.out.println("thank you for your visit ");
		break;
		default: System.out.println("invalid number");
		} */
		
		// Switch Case
		// Fall through
		
	/*	System.out.println("Enter a number (1-7");
		int day = scanner.nextInt();
		
		switch(day) {
		case 1: System.out.println("Today is Sunday");
				break;
		case 2: System.out.println("Today is monday") ;
				break;
		case 3: System.out.println("Today is Tuesday");
				break;
		case 4: System.out.println("Today is Wednesday");
				break;
		case 5: System.out.println("Today is Thursday");
				break;
		case 6: System.out.println("Today is Friday");
				break;
		case 7: System.out.println("Today is Saturday");
				break;
		default: System.out.println("Invalid number") ;
		
		}*/
		
		// allow multiple selection
		//calculate total price 
		//while existing show total price 
		
	
		int choice = 0;
		double total = 0;
		do {
			System.out.println("Please choose an item from the list: ");
			System.out.println("Welcome to the menu!");
			System.out.println("1. Pizza - $12.99");
			System.out.println("2. Burger - $8.99");
			System.out.println("3. Pasta - $9.99");
			System.out.println("4. Salad - $6.99");
			System.out.println("5. Exit");
			choice = scanner.nextInt();
			switch(choice) {
			case 1: 
				total+=12.99;
				System.out.println("You ordered Pizza!");
				
			break;
			case 2: 
				total+=8.99;
				System.out.println("You ordered Burger!");
			break;
			case 3: 
				total+=9.99;
				System.out.println("You ordered Pasta!");
			break;
			case 4: 
				total+=6.99;
				System.out.println("You ordered Salad!");
			break;
			case 5: 
				System.out.println("Thank you for stopping by!");
				if(total>0) {
					System.out.println("You total order is " + total);					
				}
			break;
			default:System.out.println("Invalid Choice!");
			}
			
		}while (choice < 5);
		
		
		
		
		
		
		
		scanner.close();
		

	}
}
