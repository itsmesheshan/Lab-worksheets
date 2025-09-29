package LW_1;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter radius of the larger circle");
        double radius1=scanner.nextDouble();

        System.out.println("enter radius of the  smaller circle ");
        double radius2=scanner.nextDouble();

        Circle circle1 = new Circle(radius1);
        Circle circle2 = new Circle(radius2);
        System.out.println("area of the circular part is:"+(circle1.claArea()-circle2.claArea()));



    }
}
