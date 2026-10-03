package Exercice9;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(1, 1);
        Point p2 = new Point(4, 5);
        p1.setX(2);
        p2.setY(5);
        System.out.println(p1.getX());
        System.out.println(p2.getY());
        System.out.println("Method distance() without any parameters : " + p1.distance());
        System.out.println("Method distance() with parameter of type Point : " + p1.distance(p2));
        System.out.println("Method distance() with two parameters  : " + p1.distance(p1,p2));

    }
}
