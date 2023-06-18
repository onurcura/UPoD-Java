package Homeworks;

import java.util.Scanner;

public class CalculatePrice {
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
        double price;
        price = n / n1 * 1 + (n % n1) / n2 * 0.5 + (n % n1) % n2 * 0.05;

        return price;
    }

}
