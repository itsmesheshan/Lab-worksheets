package LW_1;

import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first name");
        String firstName = scanner.nextLine();
        System.out.println("enter the middle name");
        String middleName = scanner.nextLine();
        System.out.println("enter the last name");
        String lastName = scanner.nextLine();
        System.out.println("Name is:"+lastName+","+firstName+" "+middleName.substring(0));
    }
}
