package Homeworks;

import java.util.Scanner;

public class RecursiveCalculatePrice {
    public static void main(String[] args) {
        int n;
        double price;
        Scanner scan = new Scanner(System.in);

        System.out.print("Sayfa sayısını giriniz : ");
        n = scan.nextInt();

        price = fiyatHesapla(n);
        System.out.println("Ücret: " + price + " TL");
    }

    static double fiyatHesapla(int n) {
        int n1 = 25, n2 = 12;
        if (n >= n1) {
            return (n / n1) + fiyatHesapla(n % n1);
        } else if (n >= n2) {
            return (0.5 * (n / n2)) + fiyatHesapla(n % n2);
        } else {
            return 0.05 * n;
        }
    }
}
