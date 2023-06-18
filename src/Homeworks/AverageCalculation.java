package Homeworks;

import java.util.Scanner;

public class AverageCalculation {
    public static void main(String[] args) {
        String name;
        int num,firstExam,secExam;
        double average;
        Scanner inp = new Scanner(System.in);

        System.out.print("Öğrenci sayısını giriniz: ");
        num = inp.nextInt();

        for (int i = 1;i<=num;i++){
            System.out.println();
            System.out.println("Öğrenci " + i + ":");
            inp.nextLine();
            System.out.print("Adı: ");
            name = inp.nextLine();
            System.out.print("Vize Notu: ");
            firstExam = inp.nextInt();
            System.out.print("Final Notu: ");
            secExam = inp.nextInt();

            if (firstExam<0 || firstExam>100 || secExam < 0 || secExam >100){
                System.out.println("Yanlış bir değer girdiniz. Tekrar deneyiniz.");
                i--;
                continue;
            }

            average = (0.4*firstExam + 0.6*secExam);
            if (average >= 90){
                System.out.println("Genel Notu : "+average +" - AA");
            }else if (average >=80){
                System.out.println("Genel Notu : "+average +" - BA");
            }else if (average >=70){
                System.out.println("Genel Notu : "+average +" - BB");
            }else if (average >=60){
                System.out.println("Genel Notu : "+average +" - CB");
            }else if (average >=50){
                System.out.println("Genel Notu : "+average +" - CC");
            }else if (average >=40){
                System.out.println("Genel Notu : "+average +" - DC");
            }else if (average >=30){
                System.out.println("Genel Notu : "+average +" - DD");
            }else if (average >=20){
                System.out.println("Genel Notu : "+average +" - FF");
            }
        }
    }
}
