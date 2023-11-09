
//CREATE a file
import java.io.File;
import java.io.IOException;

public class CreateFileExample {
    public static void main(String[] args) {
        
        try {
            //create a file sample.txt
            //path save - retrieve
            ///Users/hadjitejuco/NetBeansProjects/TN23
            //c:\\users\\desktop\\Netbeans\\TN23\\sample.txt
            
            File myFile = new File ("/Users/hadjitejuco/NetBeansProjects/TN23/src/sample.txt");
            
            //create the file
            if (myFile.createNewFile()){
                System.out.println("File created "+myFile.getName());
            }else{
                System.out.println("File Aready exist. ");
            }
        
        }catch(IOException e){
             System.err.println("An Error occured ");
             e.printStackTrace(); //handle the exception error pinpoint line erro
        }  
    }
}
