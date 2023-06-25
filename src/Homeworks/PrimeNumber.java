package Homeworks;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen sayı giriniz : ");
        num = scan.nextInt();

        if (isPrime(num, 1, 0)) {
            System.out.print(num + " bir asal sayıdır.");
        } else {
            System.out.print(num + " bir asal sayı değildir.");
        }
    }

    static boolean isPrime(int num, int divider, int counter) {
        if ((num % divider) == 0) {
            counter++;
        }
        if (divider == num) {
            if (counter == 2) {
                return true;
            } else {
                return false;
            }
        }
        return isPrime(num, divider + 1, counter);
    }
}