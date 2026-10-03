package Exercice3;

public class Jagged2DArray {
    public static void jagged(int n) {
        //the process of construction the jagged matrix
        int[][] arr = new int[n][n];
        arr[0][0]=1; //initial row
        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                arr[i][j] = arr[i-1][i-1] + j + 1; //keep tracking of the last previous value (previous row)+ the increment by 1,2,,,(i+1)
            }
        }
        //print out the matrix
        for (int i = 0; i < n; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print(arr[i][j]+", ");
            }
            System.out.println();
        }

    }
}
