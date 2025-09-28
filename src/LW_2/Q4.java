package LW_2;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] numbers=new int[10];
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<5;i++){
            System.out.println("enter the "+(i+1)+"th number:");
            numbers[i]=scanner.nextInt();
        }
        for(int i=0;i<5;i++){
            if(numbers[i]>largest){
                largest=numbers[i];
            }
        }
        System.out.println("The largest number is "+largest);
    }
}
