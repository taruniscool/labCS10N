package Exercises;

import java.util.Scanner;

public class divisionStuff {{
	
	int a,b, div=0, mod=0, div2=0, mod2=0;
	
	@SuppressWarnings("resource")
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter an Integer: "); 
	
	a=sc.nextInt();
	
	System.out.print("Enter an Integer: ");

	b=sc.nextInt();

	div= a/b;
	
	mod= a%b;
	
	
	div2= b/a; 
	
	mod2= b%a;
	
	System.out.println(a+"/"+b+"="+div); 
	
	System.out.println(a+"%"+b+"="+mod); 
	
	System.out.print(" ");
	
	System.out.println(b+"/"+a+"="+div2);
	
	System.out.println(b+"%"+a+"="+mod2);
}}
