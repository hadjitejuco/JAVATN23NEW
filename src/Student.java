//https://github.com/hadjitejuco/JAVATN23NEW
//MASTER Branch -> SRC Folder

public class Student {
    //create variable
    String name;
    int age;
    
    //create a constructor
    Student (String n, int a){
      name = n;     //Hadji
      age = a;      //20
    }   
    
    void introduce(){
        System.out.println("Hello my name is "+name+ " and I'm "+age+" years old");
    }
    
    public static void main(String[] args) {
        Student student1 = new Student("Hadji", 20);
        Student student2 = new Student("Alessandra Gayle Cilot",19);
        student1.introduce();
        student2.introduce();
    }
    
}
