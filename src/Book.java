
//https://github.com/hadjitejuco/JAVATN23NEW
//MASTER Branch -> SRC Folder

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
        Book book2 = new Book();
        book1.title = "Introduction to Java Programming";
        book1.author ="Hadji Tejuco";
        book1.price = 200.00;
        
        book2.title = "Introduction to Java Pyhton";
        book2.author ="Hadji Javier";
        book2.price = 100.00;
        
        book1.displayInfo();
        book2.displayInfo();
    }

 }   
    

