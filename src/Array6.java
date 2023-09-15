
import java.util.Scanner;
public class Array6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Please enter the size of the array: ");
        int size = scanner.nextInt();
        
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter element "+ (i+1) + " :");
            numbers[i] = scanner.nextInt();
        }
        
        System.out.println("Enter the number to check ");
        int check = scanner.nextInt();
        boolean isPresent = false;
        for (int num : numbers) {
            if (num == check) {
                isPresent = true;
                break;
            }
        }
        System.out.println("Is " + check + " present in the array " + isPresent );
    }
}
