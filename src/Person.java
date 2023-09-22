//https://github.com/hadjitejuco/JAVATN23NEW
//MASTER Branch -> SRC Folder               Person
/*
    Ask to input Name, age                  -name: String
    Try to update Name                      -age: int

    private -> hidden                       Person(String name, int age)
                                            getName()
                                            setName(String name)      
                                            getAge()
                                            setAge(int age)            

*/                                          
import java.util.Scanner;

public class Person {
    private String name;
    private int age;
    
    //Constructor
    public Person (String name, int age){
        this.name = name;
        this.age = age;
    }
    
    //Getter for name
    public String getName(){
        return name;
    }
    //Setter for name
    public void setName(String name){
        this.name = name;
    }
    
    //Getter for age
    public int getAge(){
        return age;
    }
    
    //Setter for age
    public void setAge(int age){
        if (age >= 0){
            this.age = age;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        
        Person person = new Person(name, age);
        System.out.println("---------------------");
        System.out.println("Display Information");
        System.out.println("Name "+person.getName());
        System.out.println("Age "+person.getAge());
        System.out.println("---------------------");
        //update
        System.out.println("Update Name");
        System.out.println("---------------------");
        scanner.nextLine();     //newline
        String newName = scanner.nextLine();
        person.setName(newName);
        System.out.println("Updated Age");
        int newAge = scanner.nextInt();
        person.setAge(newAge);
        System.out.println("---------------------");
        System.out.println("Updated Name is "+person.getName());
        System.out.println("Updated Age is "+person.getAge());
        
        scanner.close();
        
    }
    
    
    
}
