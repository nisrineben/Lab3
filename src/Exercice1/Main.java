package Exercice1;

import static Exercice1.SortArray.*;

public class Main {
    static void main(String[] args){
        int[] arr={106,26,81,5,15};
        System.out.println("Before sorting :");
        printArray(arr);
        System.out.println("After sorting :");
        printArray(sortIntegers(arr));
    }
}
