
//break statement
public class For3 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print (" " + i);
            if (i == 5)
                break;
        }
        System.out.println("\nloop stopped");
        
        for (int i = 0; i < 10; i++) {
            if (i %2 == 0){
                continue;
            }
            System.out.print(" " + i);
        }
    }
}
