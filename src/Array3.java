//Compute Sum and Average 
public class Array3 {
    public static void main(String[] args) {
        double[] numbers = {10.5, 11.5, 12.5,13.5,14.5};
        double sum = 0;
        for (double number  : numbers){
            sum += number;
        }
        double average = sum / numbers.length;
        System.out.println("Sum is "+sum);
        System.out.println("Average is "+average);
    }
}
