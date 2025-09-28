package LW_2;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" input a number to find the length");
        int num;
        num=scanner.nextInt();
        String number=String.valueOf(num);

        System.out.println(number.length()+"is the length of the number ");
    }
}
