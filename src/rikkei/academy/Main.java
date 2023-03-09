package rikkei.academy;

public class Main {
    public static void main(String[] args) {
        System.out.println("---Circle---");
        Circle circle = new Circle(5.0, "red");
        System.out.println(circle);
        System.out.println("-------------------------------------------");
        System.out.println("---Cylinder---");
        Cylinder cylinder = new Cylinder(10.0,"blue",2.0);
        System.out.println(cylinder.theTich()+"--->thể tích");
    }
}