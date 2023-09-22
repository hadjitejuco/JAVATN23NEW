
//https://github.com/hadjitejuco/JAVATN23NEW
//MASTER Branch -> SRC Folder
//Class with Methods

public class Calculator {
   //add, subtract, multiply,  divide
   int add (int a, int b){
       return a+b;
   } 
   
   int subtract(int a, int b){
       return a-b;
   }
   
   int multiply(int a, int b){
       return a*b;
   }
   
   double divide(int a, int b){
       if (b !=0){
           return (double)a/b;
       }else{
           System.out.println("Cannot divide by zero ");
           return 0;
       }
   }
   
    public static void main(String[] args) {
        
        Calculator calc = new Calculator();
        System.out.println(calc.add(1,1));
        System.out.println(calc.subtract(5, 3));
        System.out.println(calc.multiply(2, 4));
        System.out.println(calc.divide(5, 0));
        
    }
}
