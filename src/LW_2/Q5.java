package LW_2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Q5 {

    public static void main(String[] args) {
        System.out.println("enter a sentence:");
        Scanner scanner = new Scanner(System.in);
        String sentence ;
        sentence = scanner.nextLine();
        StringTokenizer tokenizer = new StringTokenizer(sentence);
        StringBuilder cleaned = new StringBuilder();


        while(tokenizer.hasMoreTokens()){

            String word = tokenizer.nextToken();
            word = word.toLowerCase();
            cleaned.append(word);

        }
        String finalString=cleaned.toString();
        int left=0;
        int right=finalString.length()-1;
        boolean aPalindrome=true;
        while(left<right){
            if(finalString.charAt(left)!=finalString.charAt(right)){
                aPalindrome=false;
                break;
            }
            left++;
            right--;
        }
        if(aPalindrome){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }

}
