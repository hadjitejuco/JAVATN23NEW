
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;

public class CreateAndWriteFileFromInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        try {
            System.out.println("Enter a character to write to the file: ");
            char userChar = scanner.nextLine().charAt(0);
           
            File myFile = new File ("/Users/hadjitejuco/NetBeansProjects/TN23/src/sample.txt");
            
            //create a filewriter append mode
            //FileWriter writter = new FileWriter(myFile, true);
            
            //overwrite
            FileWriter writter = new FileWriter(myFile);
            
            //Write character
            writter.write(userChar);
            
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
