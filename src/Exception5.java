
public class Exception5 {
    public static void main(String args[ ]) 
	{
		try 
		{
                    int a = 0;
                    int b = 10 / a;
                    
                    int c[] = { 1 };
                    c[10] = 100;
		} 
		catch(Exception e) 
		{
		     System.out.println("Generic Exception catch." + e);
		}
//		catch(ArithmeticException e) 
//		{ 	//   ERROR – unreachable code
//			System.out.println("This is never reached.");
//		}
	}

}
