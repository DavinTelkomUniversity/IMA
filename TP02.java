import java.util.Scanner;

public class TP02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int jumlah = s.nextInt();
        int[] n = new int[jumlah];

        for (int i = 0; i < jumlah; i++) {
            n[i] = s.nextInt();
        }

        for (int i = 0; i < jumlah; i++) {
            for (int j = i + 1; j < jumlah; j++) {
                if (n[i] < n[j]) {
                    int temp = n[i];
                    n[i] = n[j];
                    n[j] = temp;
                }
            }
        }

        for (int i = 0; i < jumlah; i++) {
            System.out.print(n[i] + " ");
        }
    }
}