package Homeworks;

import java.util.Scanner;

public class CalculatePrice {
    public static double fiyatHesapla(int n) {
        double price;
        price = n/25 * 1 + (n%25)/12 * 0.5 + (n%25)%12 * 0.05;

        return price;
    }

    public static void main(String[] args) {
        int n;
        double price;
        Scanner scan = new Scanner(System.in);

        System.out.print("Sayfa sayısını giriniz :");
        n = scan.nextInt();

        price = fiyatHesapla(n);
        System.out.println("Ücret: " + price + " TL");
    }
}
