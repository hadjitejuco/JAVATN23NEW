//input array
import java.util.Scanner;
public class Array4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter element "+ (i+1) + ":");
                numbers[i] = scanner.nextInt();
        }
        System.out.println("Entered Array ");
        for (int num : numbers){
            System.out.println(num);
        }
        scanner.close(); // avoid resource leaks
    }
}
