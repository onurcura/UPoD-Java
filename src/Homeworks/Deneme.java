package Homeworks;

public class Deneme {
    public static void main(String[] args) {

        int r = b(a(1,2, 3,4,5), a(1, 2, 3,4,5), a(2, 4, 6, 8, 10,12));
        System.out.println(r);
    }

    static int b(int[] x, int[] y, int[] z) {
        int total = 0;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < y.length; j++) {
                for (int k = 0; k < z.length; k++)
                    total += x[i] + y[j] + z[k];
            }
        }
        return total;
    }

    static int[] a(int... x) {

        return x;
    }
}
