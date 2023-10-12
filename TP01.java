import java.util.Scanner;

public class TP01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int jumlah = s.nextInt();
        String[] nama = new String[jumlah];

        for (int i = 0; i < jumlah; i++) {
            nama[i] = s.next();
        }
		
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Bulan " + (i + 1) + ": " + nama[i]);
        }
    }
}