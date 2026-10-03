package Exercice6;

import static Exercice6.Median.median;


public class Main {
    public static void main(String[] args){
        int[] arr1={5, 2, 4, 17, 55, 4, 3, 26, 18, 2, 17};
        int[] arr2= {42, 37, 1, 97, 1, 2, 7, 42, 3, 25, 89, 15, 10, 29, 27};

        System.out.println("the median for arr1 :"+median(arr1));
        System.out.println("the median for arr2 :"+median(arr2));
    }
}
