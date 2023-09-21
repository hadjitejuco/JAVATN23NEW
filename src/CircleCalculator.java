//procedural programs
import java.util.Scanner;
public class CircleCalculator {
    //function to calculate the area of a circle
    //function to calculate the circumference of a circle
    
    //constant
    public static final double PI = 3.14159;
    
    //function to compute the area of a circle
    public static double calculateArea(double radius){
        return PI * radius * radius;
    }
    
    //function to compute the circumference of a circle
    public static double calculateCircumference(double radius){
        return 2 * PI * radius;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter the radius: ");
        double radius = scanner.nextDouble();
        
        double area = calculateArea(radius);
        double circumference = calculateCircumference(radius);
        
        System.out.println("Radius value is: "+radius);
        System.out.println("Area is: "+area);
        System.out.println("Circumference is: "+circumference);
        
        scanner.close();
    }
}
