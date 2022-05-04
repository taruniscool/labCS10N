package Exercises;
/*
Program: ${numberStuff}.java          Date: ${4/14/2022}
Author: Lobsang Nyima 
School: CHHS
Course: Computer Science 10
 
*/

import java.util.Scanner;


public class numberStuff {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
	       @SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);

	        
	        int hundreds = 0; 
	        int tens = 0; 
	        int ones = 0; 

	                   
	        System.out.print("Enter a 2 or a 3 digit number: ");
	        int number = input.nextInt();

	
	        if (number <= 999 && number > 99)  

	        {

	        
	        hundreds = number / 100;
	        System.out.println("Hundreds place digit: " + hundreds);
	        
	        tens = (number - (hundreds*100)) / 10;  
	        System.out.println("Tens place digit: " + tens);


	        ones = (number - (tens*10) - (hundreds*100));   
	        System.out.println("Ones place digit: " + ones);}
	                        

	        else                                                                    
	
	        {      
	
	        	if (number > 999)
	        System.out.println("Error! Number more then 3 digits.");
	       


	        	if (number <= 99 && number > 10);

	
	        	tens = (number/ 10);  

	        	System.out.println("Tens place digit: " + tens); 


	
	        	ones = (number - (tens*10));   
	
	        	System.out.println("Ones place digit: " + ones); 

	
	        }}}

