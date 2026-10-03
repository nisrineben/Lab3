package Exercice6;


import java.util.Arrays;

import static Exercice1.SortArray.sortIntegers;

public class Median {
    public static int median(int[] arr) {
        //sorting the array
        int[] sortedArr=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min])min=j;
            }
            sortedArr[i]=arr[min];
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        return sortedArr[(arr.length-1)/2];//the length is odd then >0
    }

}
