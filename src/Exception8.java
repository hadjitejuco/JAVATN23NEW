import java.io.IOException;
public class Exception8 {
   void methodx() throws IOException {
        throw new IOException("Device error");
    }

    public static void main(String[] args) {
        try {
            new Exception8().methodx();
        } catch (IOException e) {
            System.out.println("Caught exception");
        }
    } 
}
