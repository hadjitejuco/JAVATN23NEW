
public class SampleEncapsulation1App {
    public static void main(String[] args) {
        //Print radius - set initial value of our radius
        //print the area - compute the area -> PI * r2
        //set a new value of the radius var
        
        //creat an object 
        SampleEncapsulation1 circle = new SampleEncapsulation1 (5);
        
        System.out.println("Value of radius "+circle.getRadius()); //5
        System.out.println("The area of circle is "+circle.area());
        circle.setRadius(10);
        System.out.println("Value of radius "+circle.getRadius()); //10
        System.out.println("The area of circle is "+circle.area());
        
    }
}
