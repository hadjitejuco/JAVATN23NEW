

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;


public class FileWithStringInput {
    public static void main(String[] args) {
         Scanner scanner = new Scanner (System.in);
        try {
            System.out.println("Enter a string to write to the file: ");
            String userInput = scanner.nextLine();
           
            File myFile = new File ("/Users/hadjitejuco/NetBeansProjects/TN23/src/sample.txt");
            
            //overwrite
            FileWriter writter = new FileWriter(myFile);
            
            //Write character
            writter.write(userInput);
            
            writter.close();
            
            System.out.println("Successfully written data to file...");

        }catch(IOException e){
             System.err.println("An Error occured ");
             e.printStackTrace(); //handle the exception error pinpoint line erro
        }finally{
            scanner.close();
        
        }  
        
    }
}
