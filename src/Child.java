//subclass
public class Child extends Parent{
    void display(){
        System.out.println("From Child class method");
    }
    
     void show(){
         display();   //from Child class 
         super.display();  //from Parent class
    }
}
