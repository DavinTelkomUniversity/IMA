import java.util.Scanner;

public class Jurnal01 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String[] nama = new String[100];
    int jumlah = 0;

    String x = s.next();
    while (!x.equals("-")) {
    	nama[jumlah] = x;
    	jumlah++;
    	x = s.next();
    }

    for (int i = 0; i < jumlah; i++) {
      	System.out.println("Bulan " + (i + 1) + ": " + nama[i]);
    }
  }
}