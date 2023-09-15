
//solve for the sum of array
public class Array2 {
    public static void main(String[] args) {
        int a[] = new int[5]; //new -> instantiate (create) a new object of a class or array
                              //new allocate a and store it to the heap
                              //managing memory dynamically
        int sum = 0;
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;
        for (int i = 0; i < 5; i++) {
            sum = sum+a[i];
        }
        System.out.println("The sum is "+sum);
        sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum+a[i];
        }
        System.out.println("The sum is "+sum);
    }
}
