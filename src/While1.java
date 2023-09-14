
//dislay the series and compute for the sum using while loop
public class While1 {
    public static void main(String[] args) {
           
        int i = 1; //init
        int sum = 0, x = 1;
        while (i <= 5) {
            System.out.println("Loop: "+i);
            i++;
        }
        System.out.println("Next Statement");
        while (x <= 5) {
            sum += x;
            x++;
        }
        System.out.println("Sum: "+sum);
        System.out.println("Next Statement");
    }
}
