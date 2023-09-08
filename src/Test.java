
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        //ternary operator
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a grade: ");
        int grade = input.nextInt();   
        //"pass" or "fail"
        //String result = (grade>70) ? "pass" : "fail";     
        String result;
        if (grade > 70){
           //result = "pass";
           System.out.println("The grade value is pass");
        }else{
            //result = "fail";
            System.out.println("The grade value is fail");
        }
        //System.out.println("The grade value is "+result);
        
       
    }
  
}
