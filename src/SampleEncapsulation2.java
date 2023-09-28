//apply multiple var
//compute area of a rectagle
//area = width * height
public class SampleEncapsulation2 {
    //variables
    private double width;
    private double height;
    
    //Constructor
    public SampleEncapsulation2 (double width, double height){
        this.width = width;
        this.height = height;
    }
    
    //Getters -> Accesors
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    
    //setters -> Mutators
    public void setWidth(double width){
        this.width = width;
    }
    
    public void setHeight(double height){
        this.height = height;
    }
    
    public double area(){
        return width * height;
    }
    
}
