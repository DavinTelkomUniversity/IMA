import java.util.Scanner;
import java.util.Locale;

public class Jurnal02 {
    public static void main(final String[] args) {
        int x;
        int a = 0;
        double n = 0;
        Scanner s = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        do {
            a++;
            x = s.nextInt();
            n += x;
        }
		while (x != 0);
        double y = n/(a-1);
        float hasil = (float)(y);
        float myFloat = hasil;
        String hasilnya = String.format("%.02f", myFloat);
        System.out.println(hasilnya);
    }
}