package Exercises;

/*
Program: ${Stuff}.java          Date: ${5/1/2022}
Author: Lobsang Nyima 
School: CHHS
Course: Computer Science 10
*/
import java.util.Scanner;

public class stuff
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		
@SuppressWarnings("unused")
String line;
String loop;
String Tarun;
String Turan;
String tuanry;
Scanner in = new Scanner (System.in)
; 
System.out.println("What is your name?");
line= in.nextLine();
System.out.println("What is your last name?");
loop = in.nextLine();
System.out.println("what grade are you in?");
Tarun = in.nextLine();
System.out.println("What school do you attend?");
Turan = in.nextLine(); 
System.out.println("What is your favorite hobby?");
tuanry = in.nextLine();
System.out.print("Hi, your name is: "+ line +" "+ loop +" , you are in grade " + Tarun + " at " + Turan + ". Your favourite hobby is " + tuanry + "." );
	}

}

