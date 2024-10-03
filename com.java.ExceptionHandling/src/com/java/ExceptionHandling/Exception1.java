package com.java.ExceptionHandling;
/*Whenever exception happens Duck the exception handle the exception or rethrow */
import java.util.Scanner;
/*Whenever multiple exception given in catch block its recommended always write generic exception in last*/
public class Exception1 {

	public static void main(String[] args) 
	{
			System.out.println("Connection is established");
			/*AN single Try block can catch multiple exception*/
			try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter numeninator for division:");
			int n=sc.nextInt();
			System.out.println("Kindly enter number for Denominator for Division:");
			int d=sc.nextInt();
			int res=n/d;
			System.out.println("The result is :"+ res);
			
			System.out.println("Kindly enter size of an array");
			int size=sc.nextInt();
			int arr[]= new int[size];
			System.out.println("Kindly enter element inserted in array");
			int elem=sc.nextInt();
			System.out.println("Kindly enter position of to be inserted");
			int index=sc.nextInt();
			arr[index]=elem;
			System.out.println("Data to be inserted is"+ elem);
			}
			catch(ArithmeticException e)
			{
				System.out.println("Please enter non zero");
			}
			catch(NegativeArraySizeException e)
			{
				System.out.println("Please enter only postive");
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Please put value in limit");
			}
			catch(Exception e)
			{
				System.out.println("Im generic exception");
			}	
		System.out.println("Connection is closed.");	


	}

}
