package Exercice1;

public class SortArray {
    public static void printArray(int[] arr) {
        for (int i=0;i<arr.length;i++) System.out.println("Element "+i+" contents "+arr[i]);
    }
    public static int[] sortIntegers(int[] arr){
        int[] sortedArr=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int max=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[max])max=j;
            }
            sortedArr[i]=arr[max];
            int temp=arr[i];
            arr[i]=arr[max];
            arr[max]=temp;
        }
        return sortedArr;
    }

}
