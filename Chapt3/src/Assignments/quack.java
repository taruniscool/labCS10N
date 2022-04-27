package Assignments;
/*
Program: ${BingoCard}.java          Date: ${4/14/2022}
Author: Lobsang Nyima 
School: CHHS
Course: Computer Science 10
*/
import java.util.Scanner;

public class quack{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
	 // Declare variables
		
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        
        double size = 0.0;
        
        double cost = 0.0;
           
 
        // Display instructions
        System.out.println("\nEnter the size of the pizza(diameter): ");
        size = sc.nextDouble();
        
        // Calculate total cost
        cost = ((.05 * size * size) + 1 + .75);
        
        // Output the total
        System.out.println("Total cost: $" + cost);	

	}

}
/* Screen Dump
*/