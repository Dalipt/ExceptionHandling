package com.java.ExceptionHandling;

/*Its a moral responsibility to manage risky code
 if not handling exception atleast Duck it by using Throws*/

import java.util.Scanner;
/*If exception is not handled it will go to caller of method*/
class Alpha1
{
	public void alpha1() throws ArithmeticException 
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
}}
public class ExceptionDucking {

	public static void main(String[] args)
	{
		Alpha1 ap= new Alpha1();
		ap.alpha1();
	}

}
