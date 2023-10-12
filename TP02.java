import java.util.Scanner;

public class TP02 {

	public static void main(final String[] args) {
		Scanner s = new Scanner(System.in);
        long transaksi = s.nextLong();
		long pajak = 11;
		if (transaksi > 200000) {
			long diskon = 10;
			long diskonnya = transaksi * diskon / 100;
			long didiskon = transaksi - diskonnya;
			double pajaknya = didiskon * pajak / 100;
			double dibayar = didiskon + pajaknya;
			System.out.println("Transaksi = " + transaksi);
			System.out.println("Total = " + transaksi + " - " + diskonnya);
			System.out.println("Ppn " + pajak + "% = " + pajaknya);
			System.out.println("Total dibayar = " + dibayar);
		} else {
			double pajaknya = transaksi * pajak / 100;
			double dibayar = transaksi + pajaknya;
			System.out.println("Transaksi = " + transaksi);
			System.out.println("Total = " + transaksi);
			System.out.println("Ppn " + pajak + "% = " + pajaknya);
			System.out.println("Total dibayar = " + dibayar);
		}
	}
}
