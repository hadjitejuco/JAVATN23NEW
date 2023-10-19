/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hadjitejuco
 */
public class Exception2 {
    
    public static void main(String[] args) {
        int d,a;
        try {
            d = 0;
            a =10/d;
            System.out.println(a);
            System.out.println("This will not be printed");
        
        }
        catch(ArithmeticException e){
            System.out.println("Divsion by Zero, Arithmetic Exception" +e);
        
        }
    }
    
    
    
}
