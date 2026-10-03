package Exercice4;

public class SpecialArray {
    public static void _2ColumnTo5Column(int[][] arr){
        int temp;
        // the process of swapping the second column with the fifth column
        for(int i=0;i<6;i++){
            temp=arr[i][1]; // a temporary variable to preserve the value of arr[i][1]
            arr[i][1]=arr[i][5]; // transform to 0 index the 2nd column the element with index=1 ,etc
            arr[i][5]=temp;

        }
        // print out the new matrix
        for (int i = 0; i < 6; i++) {

            for (int j = 0; j < 8; j++) {
                System.out.print(arr[i][j]+" ,");
            }
            System.out.println();
        }
    }

}
