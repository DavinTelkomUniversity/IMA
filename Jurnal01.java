import java.util.Scanner;
import java.util.Locale;

public class Jurnal01 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    Locale.setDefault(Locale.US);
    double h = s.nextDouble();
    double n = s.nextDouble();
    double r = 0;
    while (n > r) {
        n -= 10;
        h = h / 2;
    } 
    float hasil = (float)(h);
    float myFloat = hasil;
    String hasilnya = String.format("%.03f", myFloat);
    System.out.println(hasilnya);
    }
}