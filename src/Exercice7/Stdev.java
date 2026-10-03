package Exercice7;

public class Stdev {
    public static double stdev(int[] arr){

        int sum=0;
        for(int e:arr)sum+=e;
        double average=(double)sum/arr.length;//casting before division so the result be in double using floating-point division
        double upper=0;
        for(int e:arr){
            upper+=(e-average)*(e-average);
        }
        return Math.sqrt(upper/(arr.length-1));
    }

}
