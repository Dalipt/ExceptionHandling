package com.java.ExceptionHandling;

import java.util.Scanner;
class Alpha2
{
	public void alpha1() throws ArithmeticException 
	{
		try 
		{
		System.out.println("Connection is established in alpha");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter numeninator for division:");
		int n=sc.nextInt();
		System.out.println("Kindly enter number for Denominator for Division:");
		int d=sc.nextInt();
		int res=n/d;
		System.out.println("The result is :"+ res);
		System.out.println("Please enter non zero number");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Alpha exception");
			throw e;
			/*Throw will not allow anything to execute after him*/
		}
		/*So if you want a piece of code to must execute use finally block */
		finally
		{
		System.out.println("I will take care of resources");	
		}
		System.out.println("After alpha");
}}
public class ExceptionRethtow 
{
		public static void main(String[] args)
		{
			Alpha2 ap= new Alpha2();
			ap.alpha1();
		}

	}
