package Homeworks;

import java.util.Scanner;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = 100;
        int a[]= new int[num-1];
        for (int i =0;i<num-1;i++){
            a[i] = i+2;
        }

        int i =0;
        while(a[i]*a[i]<=num){
            int n =1;
            if (a[i]!=0){
                while(i+a[i]*n <a.length){
                    a[i+a[i]*n]=0;
                    n++;
                }
            }
            i++;
        }
        for (int k = 0 ; k<num-1;k++){
            if (a[k]!=0){
                System.out.print(a[k] +" ");
            }
        }


    }
}
