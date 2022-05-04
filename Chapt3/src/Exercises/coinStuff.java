package Exercises;

import java.util.Scanner;

/*
Program: ${CoinStuff}.java          Date: ${5/3/2022}
Author: Lobsang Nyima 
School: CHHS
Course: Computer Science 10
*/
public class coinStuff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amount, originalAmount,
        dimes, quarters, nickels;

System.out.println("Enter a whole number."); //asks the person for a whole number.
System.out.println("I will try to find the exact combination of coins");
System.out.println("that equals that amount of change.");

    @SuppressWarnings("resource")
	Scanner keyboard = new Scanner(System.in); 
    
  amount = keyboard.nextInt();
  
    originalAmount = amount;
    
    quarters = amount / 25;
    
    amount  = amount % 25;
    
    dimes = amount / 10;
    
    amount = amount % 10; 
    
    nickels = amount / 5;
    
    amount = amount % 5;
   

   System.out.println(originalAmount +
		   
                       " cents in coins can be given as:");
   
    System.out.println(quarters + " quarters");
    
    System.out.println(dimes + " dimes and ");
    
System.out.println(nickels + " nickels.");

	}

}
