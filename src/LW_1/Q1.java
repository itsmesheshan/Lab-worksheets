package LW_1;

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("ENTER AN ODD LENGTH WORD");
        String name = scanner.nextLine();
        System.out.println("MIDDLE LETTER OF THE WORD IS:"+ name.substring(name.length()/2,name.length()/2+1)  );


    }

}
