
public class Array8 {
    public static void main(String[] args) {
        //default array and printout the values
        int [][] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}       
        };
        //print the value of the 2dim array
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
 
}
