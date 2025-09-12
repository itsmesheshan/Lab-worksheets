package LW_1;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter length in centimeters:");
        int centi = scanner.nextInt();
        double inch = centi/2.54;
        int feet=(int)inch/12;
        double inches=inch%12;
        System.out.println("length in feet and inches is:"+feet+"feet and"+inches+"inches");

    }
}