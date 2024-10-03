package com.java.ExceptionHandling;

import java.util.Scanner;

class UnderAgeException extends Exception
{
	public UnderAgeException(String msg)
	{
		super(msg);
	}
}
class OverAgeException extends Exception
{
	public OverAgeException(String msg)
	{
		super(msg);
	}
}

class Licence
{
	int age;
	public void licenceTest()
	{
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter age for Licenece apply:");
		age=sc.nextInt();
	}
	public void verify() throws UnderAgeException ,OverAgeException
	{
		if(age>=18 && age<=60)
		{
			System.out.println("Please procedd with application");
		}
		else if(age<=18)
		{	
			UnderAgeException sge= new UnderAgeException("Before 18 not allowed!");
			System.out.println(sge.getMessage());
			throw sge;
		}
		else 
		{
			OverAgeException sge1= new OverAgeException("After 60 not allowed!");
			System.out.println(sge1.getMessage());
			throw sge1;
		}
	}
}
class RTO
{
	public void verifyApp()
	{
	Licence cl= new Licence();
	try 
	{	
	cl.licenceTest();
	cl.verify();
	} 
	catch (UnderAgeException | OverAgeException ex )
	{
			System.out.println("Try Again");
			try 
			{	
			cl.licenceTest();
			cl.verify();
			} 
			catch (UnderAgeException | OverAgeException ex1 )
			{
				try 
				{	
				cl.licenceTest();
				cl.verify();
				} 
				catch (UnderAgeException | OverAgeException ex2 )
				{
					System.out.println("You are not allowed for application due to age restriction!");
				} 
			} 
	} 
	}
	} 	
public class CustomeExceptionRTOApp {

	public static void main(String[] args) 
	{
		System.out.println("Licence application");
		RTO ne= new RTO();
		ne.verifyApp();
	}
	
}
