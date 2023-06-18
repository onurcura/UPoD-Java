package Homeworks;

import java.util.Scanner;

public class StringWithStars {

    public static void main(String[] args) {
        String a = "I love Java, a lot";
        int counter = 0;
        for (int i = 0; i < a.length(); i++) {
            if ((i+1)==a.length()){
                System.out.print(a.charAt(i));
                break;
            }
            counter--;
            if (a.charAt(i + 1) == '.' || a.charAt(i + 1) == ',' || a.charAt(i + 1) == ' ') {
                counter = 2;
            }
            if (counter>0){
                System.out.print(a.charAt(i));
            }else {
                System.out.print(a.charAt(i));
                System.out.print("*");
            }
        }
    }
}
