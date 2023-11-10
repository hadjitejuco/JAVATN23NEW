
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
//    private static final String FILE_NAME = "/Users/hadjitejuco/NetBeansProjects/TN23/src/bankaccount.txt";


public class AppendStringToFile {
      public static void main(String[] args) {
         Scanner scanner = new Scanner (System.in);
        try {
            System.out.println("Enter a string to write to the file: ");
            String userInput = scanner.nextLine();
           
            File myFile = new File ("/Users/hadjitejuco/NetBeansProjects/TN23/src/sample.txt");
            
            //append mode
            FileWriter writter = new FileWriter(myFile, true);
            
            //Write character
            writter.write(userInput + "\n");
            
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

