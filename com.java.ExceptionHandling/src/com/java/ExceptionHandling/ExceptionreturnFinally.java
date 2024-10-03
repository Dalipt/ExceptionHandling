package com.java.ExceptionHandling;
/*If return also available if finally is there return will not execute*/
class Gamma
{
		public int disp()
		{
			try 
			{
			System.out.println("Testing");
			return 10;
			}
			finally 
			{
				System.out.println("Uhsbf");
				//return 20;
			}
		}
}
public class ExceptionreturnFinally {

	public static void main(String[] args)
	{
		Gamma gm= new Gamma();
		gm.disp();

	}

}
