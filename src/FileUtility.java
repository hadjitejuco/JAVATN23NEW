
import java.io.*;

public class FileUtility {
    public static final String FILE_NAME = "bankaccount.txt";
    
    public static void writeToFile(String content){
        try (FileWriter fw = new FileWriter(FILE_NAME, true)) {
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            bw.newLine();
        }catch(IOException e){
             System.err.println("An Error occured ");
        
        }
    }
    
    public static void readToFile(){
     try (FileReader fr = new FileReader(FILE_NAME)) {
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            
        }catch(IOException e){
             System.err.println("An Error occured ");
        
        }
    
    } 
    
}
    
