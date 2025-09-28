package LW_2;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter a number of rows:");
        Scanner scanner=new Scanner(System.in);
        num=scanner.nextInt();
        for(int i=0;i<=num;i++){
            for(int j=num-i-1;j>=0;j--){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}
