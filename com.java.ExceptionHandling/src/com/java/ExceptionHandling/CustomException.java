package com.java.ExceptionHandling;

import java.util.Scanner;

class InvalidCustomerException extends RuntimeException
{
	public InvalidCustomerException(String msg)
	{
		super(msg);
	}
}
class ATM
{
	private int acc=4545;
	private int pw=1234;
	
	int accountno;
	int password;
	
	public void input()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter accountNu: ");
		accountno=sc.nextInt();
		System.out.println("Please enter password: ");
		password=sc.nextInt();
	}
	public void verify() throws InvalidCustomerException
	{
		if(acc==accountno && pw==password)
		{
			System.out.println("Allowed");
		}
		else
		{
			//System.out.println("Not allowed");
			InvalidCustomerException id= new InvalidCustomerException("Invalid Credential");
			id.getMessage();
			throw id;
			
			
		}
		
	}
}
class Bank
{
	public void verify()
	{
		ATM at= new ATM();
		try 
		{	
		at.input();
		at.verify();
		}
		catch(InvalidCustomerException ex)
		{ 
			System.out.println("Try Again ");
			try {
				at.input();
				at.verify();
				}
				catch(InvalidCustomerException ex1)
				{ 
					System.out.println("Try Again");
					try {
						at.input();
						at.verify();
						}
						catch(InvalidCustomerException ex2)
						{ 
							System.out.println("Not Allowed now");
						}
				}
		}
	}
}

public class CustomException {

	public static void main(String[] args)
	{
		Bank bt =new Bank();
		bt.verify();

	}

}
