
//https://github.com/hadjitejuco/JAVATN23NEW

public class Book {
    String title;
    String author;
    double price;
    
    //function display the value
    void displayInfo(){
        System.out.println("Title :"+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
    }

    public static void main(String[] args) {
        //create an instance of an object
        Book book1 = new Book();
        book1.title = "Introduction to Java Programming";
        book1.author ="Hadji Tejuco";
        book1.price = 200.00;
        
        book1.displayInfo();
    }

 }   
    

