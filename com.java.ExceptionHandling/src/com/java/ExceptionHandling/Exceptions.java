package com.java.ExceptionHandling;

import java.util.Scanner;
/*If your application is running and abnormalily or abrouptly termination is known as exception
 *This kind of situation must need to be handled*/

public class Exceptions {

	public static void main(String[] args)
	{
		System.out.println("Connection is established");
		
		try 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter numeninator for division:");
			int n=sc.nextInt();
			/*At JVM label exception is handled we have default exception handler*/
			System.out.println("Kindly enter number for Denominator for Division:");
			int d=sc.nextInt();
			int res=n/d;
			/*If any line exception happen compiler directly will go to catch block statement after exception will not execute */
			/*In Where ever method exception happens that stack frame create exception object it will go to JVM RunTimeStack check if handled if any check ecception present all checked*/
			System.out.println("The result is :"+ res);
		}
		catch(Exception e)
		{
			System.out.println("Please enter non zero number");
		}
		System.out.println("Connection is closed.");	
	}

}
