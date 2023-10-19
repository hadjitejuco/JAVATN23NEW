/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hadjitejuco
 */
public class Exception3 {
    public static void main(String args[ ]) 
	{
		try 
		{
                    int a = args.length;
                    System.out.println("a = " + a);
                    int b = 10 / a;
                    int c[ ] = { 1 };
                    c[10] = 100;
		} 
		catch(ArithmeticException e) 
		{
                    System.out.println("Divide by 0: " + e);
		} 
		catch(ArrayIndexOutOfBoundsException e) 
		{
                    System.out.println("Array index oob: " + e);
		}
		System.out.println("After try/catch blocks.");
	}

}
