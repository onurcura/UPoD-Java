package Homeworks;

import java.util.Scanner;

public class RecursiveCalculatePrice {

    static double fiyatHesapla(int n) {
        if (n >= 25) {
            return (n / 25) + fiyatHesapla(n % 25);
        } else if (n >= 12) {
            return (0.5 * (n / 12)) + fiyatHesapla(n % 12);
        } else {
            return 0.05 * n;
        }
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
