package Exercice7;

import static Exercice7.Stdev.stdev;

public class Main {
    static void main(String[] args){
        int[] arr={1, -2, 4, -4, 9, -6, 16, -8, 25, -10};
        System.out.println("the stdev of the array: "+stdev(arr));
    }
}
