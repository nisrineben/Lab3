package Exercice8;

public class Wall {
    private double height;
    private double width;
    public Wall(){}
    public Wall(int height,int width){
            this.height=Math.max(height,0);
            this.width=Math.max(width,0);
    }
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    public void setWidth(double width){
        this.width=Math.max(width,0);
    }
    public void setHeight(double height){
        this.height=Math.max(height,0);
    }
    public double getArea(){
        return height*width;
    }

}
