package Homeworks;

import java.util.Scanner;

public class CalculateSpecialNumbers {
    public static void main(String[] args) {
        int select=0;
        Scanner scan = new Scanner(System.in);

        while (select!= 4){
            System.out.println("1-Asal sayı bulma\n2-Fibonacci serisi bulma\n3-Mükemmel sayı bulma\n4-Çıkış yap");
            System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
            select = scan.nextInt();

            switch (select) {
                case 1:
                    System.out.print("Bir sayı giriniz : ");
                    int num = scan.nextInt();
                    if (isPrime(num, 1, 0)) {
                        System.out.println(num + " bir asal sayıdır.");
                    } else {
                        System.out.println(num + " bir asal sayı değildir.");
                    }
                    break;
                case 2:
                    System.out.print("Fibonacci serisinin kaç terimi görmek istersiniz ? : ");
                    num = scan.nextInt();
                    fibonacci(num);
                    break;
                case 3:
                    System.out.print("Bir sayı giriniz : ");
                    num = scan.nextInt();
                    if (isPerfect(num)) {
                        System.out.println(num + " bir mükemmel sayıdır.");
                    } else {
                        System.out.println(num + " bir mükemmel sayı değildir.");
                    }
                    break;
                case 4 :
                    System.out.println("İyi günler !");
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz.");
            }
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

    static void fibonacci(int num) {
        int firstNum = 0, tempNum = 1;
        for (int i = 1; i <= num; i++) {
            System.out.print(firstNum + " ");
            tempNum += firstNum;
            firstNum = tempNum - firstNum;
        }
        System.out.println();
    }

    static boolean isPerfect(int num) {
        int total = 0;
        for (int i = 1; i <= num / 2; i++) {
            if ((num % i) == 0) {
                total += i;
            }
        }
        if (total == num) {
            return true;
        } else {
            return false;
        }
    }
}
