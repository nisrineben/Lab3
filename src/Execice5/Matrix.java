package Execice5;

public class Matrix {
    public static int[][] matrixAdd(int[][] arr1,int[][] arr2) {
        // We assume both matrices have the same dimension
        int n=arr1.length;
        int m=arr1[0].length;
        int[][] r=new int[n][m];
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {
                r[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        return r;
    }
    public static void printMatrix(int[][] r){
        // We assume both matrices have the same dimension
        int n=r.length;
        int m=r[0].length;
        System.out.print("[");
        for (int i = 0; i < n; i++) {
            System.out.print("[");
            for (int j = 0; j < m; j++) {
                System.out.print(r[i][j]+", ");
            }
            System.out.print("]");
            System.out.println();

        }
        System.out.print("]");
    }


}
