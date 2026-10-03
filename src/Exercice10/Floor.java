package Exercice10;

public class Floor {
    private double length;
    private double width;

    public Floor(double length,double width){
        this.length=Math.max(length,0); //set the length /width to 0 when they're negatives
        this.width=Math.max(width,0);
    }

    public double getArea(){
        return length*width;
    }
}
