
//https://github.com/hadjitejuco/JAVATN23NEW/tree/master/src
//multiple private var

public class SampleEncapsulation2App {
    public static void main(String[] args) {
        //create object
        SampleEncapsulation2 rectangle = new SampleEncapsulation2(4,7);
        System.out.println("Value of Width is: "+rectangle.getWidth());
        System.out.println("Value of height is: "+rectangle.getHeight());
        System.out.println("Area of rectangle is "+rectangle.area());
        //update the value of width and height
        rectangle.setWidth(5);
        rectangle.setHeight(5);
        System.out.println("Value of Width is: "+rectangle.getWidth());
        System.out.println("Value of height is: "+rectangle.getHeight());
         System.out.println("New Area of rectangle is "+rectangle.area());
        
    }
}
