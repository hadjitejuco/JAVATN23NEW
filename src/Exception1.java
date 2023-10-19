
//JVM handles the errors 
public class Exception1 {
    public static void main(String[] args) {
        int d = 0;
        int a = 10/d;
        //JVM handles the exception
        System.out.println(a);
    }
}
//java.lang.ArithmeticException: / by zero