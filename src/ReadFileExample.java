

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileExample {
    public static void main(String[] args) {
        String filePath = "/Users/hadjitejuco/NetBeansProjects/TN23/src/sample.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        
        }catch(IOException e){
             System.err.println("An Error occured " + e.getMessage());
        
        }
        
    }
}
