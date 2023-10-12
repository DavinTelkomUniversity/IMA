import java.util.Scanner;

public class TP03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int jumlah = s.nextInt();
        int[] n = new int[jumlah];

        for (int i = 0; i < jumlah; i++) {
            n[i] = s.nextInt();
        }

        int min = n[0];
        for (int i = 1; i < jumlah; i++) {
            if (n[i] < min) {
                min = n[i];
            }
        }

        int max = n[0];
        for (int i = 1; i < jumlah; i++) {
            if (n[i] > max) {
                max = n[i];
            }
        }

        double mean = 0;
        for (int i = 0; i < jumlah; i++) {
            mean += n[i];
        }
        mean /= jumlah;

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.printf("Avg: %.2f\n", mean);
    }
}