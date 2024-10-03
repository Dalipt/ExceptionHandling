package com.java.ExceptionHandling;
/*Rules of exception in Parent child heirarchy*/
/*1.IF Parent not declaring exception child can declare an exception but only unchecked.
 * 2.IF Parent is throwing uncheched exception child cannot declare checked exception.
 * 3.If parent is throwing unchecked exception if child not throwing it fine cannot thorw checked exception
 * 4.if parent is throwing checked child can throw checked or non checked but not partially checked exception.
 * 
 * 
 * 
 * */

class Parent
{
	public void work()
	{
		System.out.println("Parent work hard");
	}
}
class Child1 extends Parent
{
	public void work() throws ArithmeticException
	{
		System.out.println("Child1 also work hard");
	}

}
class Child2 extends Parent
{
	public void work()
	{
		System.out.println("Child2 also work hard");
	}

}
public class ExceptionParentChild {

	public static void main(String[] args)
	{



	}

}
