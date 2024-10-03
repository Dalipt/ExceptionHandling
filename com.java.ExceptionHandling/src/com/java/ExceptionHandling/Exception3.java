package com.java.ExceptionHandling;
/*Whenever exception happens \
 * 1. Duck the exception(propagate on method label)
 * 2. handle the exception (With use of try catch block)
 * 3. or rethrow */

import java.util.Scanner;

class Alpha
{
	public void alpha1()
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
		
		 }
		catch(ArithmeticException e)
		{
		System.out.println("Please enter non zero number"); 
		}
		 
}}
class beta 
{
	public void dis()
	{
	System.out.println("Conncetion establish in beta");
	Alpha al= new Alpha();
	al.alpha1();
	System.out.println("Connection close in beta");
	}
}
/*When no one handle then only its goto default handler it will check in heirrachy*/
public class Exception3 {

	public static void main(String[] args)
	{

		System.out.println("Main connection establish");
		Alpha all= new Alpha();
		all.alpha1();
		System.out.println("Main connection closed");
	}
}


