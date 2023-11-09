
//import.java.io.*;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;


public class CreateAndWriteFileExample {
    public static void main(String[] args) {
         try {
            File myFile = new File ("/Users/hadjitejuco/NetBeansProjects/TN23/src/sample.txt");
            
            //create a filewriter append mode
            FileWriter writter = new FileWriter(myFile, true);
            
            //Write character
            writter.write('A');
            
            writter.close();
            
             System.out.println("Successfully written data to file...");

        }catch(IOException e){
             System.err.println("An Error occured ");
             e.printStackTrace(); //handle the exception error pinpoint line erro
        }  

    }
}
