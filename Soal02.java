import java.util.Arrays;
import java.util.Scanner;

public class Soal02 {

    public static String enkripsiPesan(String pesan, String kode) {
        String[] kata = pesan.split(" ");
        String hasil = "";

        for (int i = 0; i < kata.length; i++) {
            if (i % 2 == 0) {
                hasil += kata[i] + kode + " ";
            } else {
                StringBuilder sb = new StringBuilder(kata[i]);
                hasil += sb.reverse().toString() + kode + " ";
            }
        }

        return hasil;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String pesan = s.nextLine();
        String kode = s.nextLine();

        String enkripsi = enkripsiPesan(pesan, kode);
        System.out.println(enkripsi);
    }
}
