//array 1 - static array declaration
//initialized and print array
public class Array1 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        for (int i = 0; i < 5; i++) {
            System.out.println("value of array " +numbers[i]);
        }
        System.out.println("=====================");
        for (int number : numbers) {
            System.out.println("value of array " +number);
        }
    }
}
