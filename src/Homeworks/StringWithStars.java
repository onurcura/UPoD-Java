package Homeworks;

import java.util.Scanner;

public class StringWithStars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen değiştirmek istediğiniz cümleyi giriniz : ");
        String text = scan.nextLine();

        System.out.print(convertToStringWithStars(text));
    }

    static String convertToStringWithStars(String text) {
        String[] tempText = new String[text.length()];
        int counter = 0;

        /* Verilen Stringin uzunluğunu değiştiremeyeceğim ve char da tek karakter olup ekleme yapamayacağım için
        textdeki char karakterlerini Stringe çevirip String arrayi oluşturdum. */
        for (int i = 0; i < text.length(); i++) {
            tempText[i] = String.valueOf(text.charAt(i));
        }

        //Bir sonraki indexi kontrol edip '.' - ',' - ' ' var ise 2 adım boyunca * eklemeyip kalan durumlarda * ekledim.
        for (int i = 0; i < text.length() - 1; i++) {
            counter--;
            if (text.charAt(i + 1) == '.' || text.charAt(i + 1) == ',' || text.charAt(i + 1) == ' ') {
                counter = 1;
            }
            if (counter < 0) {
                tempText[i] = tempText[i] + "*";
            }
        }
        // Oluşan arrayi birleştirip geri döndürdüm.
        return text = String.join("", tempText);
    }
}












