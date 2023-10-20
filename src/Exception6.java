
public class Exception6 {
     public static void main(String[] args) {
        try {
            int num = 30 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Division by zero!");
        } finally {
            System.out.println("This will always be executed.");
        }
    }
}
