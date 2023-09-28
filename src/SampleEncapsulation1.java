/*
Benefits of encapsulation
1. Data Hiding
    - users will not have any idea about the inner implementation of the classes / class.
2. Flexibility
    - Can easily change the internal implementation of classes with out affecting the other classes.
3. Increases the security 
    
Public and Private modifiers
    private - accessible only in the same own class
    public - accessible from other classes

*/
//print value of radius and area. Set a new radius
//compute area of a circle 
//update the classname -> Circle
public class SampleEncapsulation1 {
    //set private var
    private double radius;
    //constructor
    public SampleEncapsulation1(double radius){
        this.radius = radius;
    }
    //getters and setters
    //Accessor  /  Mutator
    
    //getters  -> Accessor
    public double getRadius(){
        return radius;
    }
    
    //setters -> Mutator
    public void setRadius (double radius){
        if (radius>0){
            this.radius = radius; //set new value
        }else{
            System.out.println("Radius cannot be a negative or zero value.");
        }
    
    }
    
    public double area (){
        return Math.PI * radius * radius;
    }
}
