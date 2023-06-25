package Homeworks;

import java.util.Scanner;

public class asdl {
    public static void main(String[] args) {
        String a = "";
        String b = "";
        Scanner scan = new Scanner(System.in);
        a = scan.nextLine();
        int counter = 0;
        for (int i = 0; i < a.length(); i++) {
            counter = 0;
            for (int j = 0; j < a.length(); j++) {
                if (a.charAt(i) == a.charAt(j)) {
                    counter++;

                }
            }
            if (counter > 1) {
                System.out.print(a.charAt(i));
            }
        }
    }
}
