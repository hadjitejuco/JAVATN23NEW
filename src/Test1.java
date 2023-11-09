import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            System.out.println("You entered: " + number);
        } catch (Exception e) {
            System.err.println("Error: Invalid input. Please enter a valid number."+e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
