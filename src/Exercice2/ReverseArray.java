package Exercice2;

public class ReverseArray {
    public static void reverse(int[] arr){
        // print out the array before reversing
        System.out.print("Array = [");
        for (int i=0;i<arr.length;i++) System.out.print(arr[i]+", ");
        System.out.print("]");
        System.out.println();

        // the reversing process by swapping
        for(int i=0;i<Math.round((float)arr.length/2);i++){
            int temp=arr[arr.length-1-i];
            arr[arr.length-1-i]=arr[i];

            arr[i]=temp;
        }

        // print out the array before reversing
        System.out.print("Reversed array = [");
        for(int i=0;i<arr.length;i++) System.out.print(arr[i]+", ");
        System.out.print("]");
    }
}
