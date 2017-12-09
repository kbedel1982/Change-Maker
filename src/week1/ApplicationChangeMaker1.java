package week1;

import java.util.Scanner;

public class ApplicationChangeMaker1 {
	
public static void main(String[] args) {
		
		System.out.println("Your Total today is 31¢.");
		System.out.print("Please Enter a number to represent your payment in cents : ");
		Scanner input = new Scanner(System.in);
		//double expectPay = input.nextDouble(); //assume is 15.65
		//double moneyIn = input.nextDouble(); //assume is 16.00
		int change = input.nextInt() - 31;
		
		
		double dollar = Math.round((int)change/100);
	    change=change%100;
	    double quarter = Math.round((int)change/25);
	    change=change%25;
	    double dime = Math.round((int)change/10);
	    change=change%10;
	    double nickel = Math.round((int)change/5);
	    change=change%5;
	    double penny = Math.round((int)change/1);
				
		//System.out.println("Your total was " +expectPay) ;
		//System.out.println("You gave me" +moneyIn+ " and your change from that is " +change);
		System.out.println("Dollars: " + dollar);
	    System.out.println("Quarters: " + quarter);
	    System.out.println("Dimes: " + dime);
	    System.out.println("Nickels: " + nickel);
	    System.out.println("Pennies: " + penny);


	}
	
	
}
