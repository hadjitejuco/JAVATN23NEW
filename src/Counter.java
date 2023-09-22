//https://github.com/hadjitejuco/JAVATN23NEW
//MASTER Branch -> SRC Folder
//Class with static variables
public class Counter {
    static int count = 0; //static varible
    
    //constructor
    Counter(){
        count++;     //1+1+1
    }
    
    static void displayCount(){
        System.out.println("Total Count: "+count);
    }
    
    public static void main(String[] args) {
        Counter obj1 = new Counter(); //create object - obj1
        Counter obj2 = new Counter(); //create object - obj2
        Counter obj3 = new Counter(); //create object - obj2
        Counter.displayCount();
        
    }
    
    
}
