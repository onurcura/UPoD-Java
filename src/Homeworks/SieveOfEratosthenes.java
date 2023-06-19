package Homeworks;

import java.util.Scanner;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen sayı giriniz : ");
        int num = scan.nextInt();

        //2'den aldığım sayıya kadar olan değerleri içeren bir array oluşturdum.
        int a[] = new int[num - 1];
        for (int i = 0; i < num - 1; i++) {
            a[i] = i + 2;
        }

        //Sırasıyla n2>num olana kadar 2 ve katları, 3 ve katları diye devam eden indexleri 0 atadım.
        //Bunu yaparken daha önce 0 a atadıysam atlaması için if ile kontrol ettim.
        int i = 0;
        while (a[i] * a[i] <= num) {
            int n = 1;
            if (a[i] != 0) {
                while (i + a[i] * n <= a.length) {
                    a[i + a[i] * n] = 0;
                    n++;
                }
            }
            i++;
        }

        //Arrayimde 0'a eşit olmayan indexleri yazdırdım.
        System.out.print(num + " a kadar olan asal sayılar : ");
        for (int k = 0; k < num - 1; k++) {
            if (a[k] != 0) {
                System.out.print(a[k] + " ");
            }
        }
    }
}
