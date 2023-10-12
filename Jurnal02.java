import java.util.Scanner;

public class Jurnal02 {

	public static void main(final String[] args) {
		Scanner s = new Scanner(System.in);
        long pendapatan = s.nextLong();
		long nominal = pendapatan * 1000000;
		if (pendapatan >= 0 && pendapatan <= 50) {
			long pajak = 5;
			long pajaknya = nominal * pajak / 100;
			long bersih = nominal - pajaknya;
			System.out.println("Penghasilan kotor = " + pendapatan + " juta Rupiah");
			System.out.println("Pajak " + pajak + "% = Rp. " + pajaknya);
			System.out.println("Penghasilan bersih = Rp. " + bersih);
		} else if (pendapatan >= 51 && pendapatan <= 250) {
			long pajak = 15;
			long pajaknya = nominal * pajak / 100;
			long bersih = nominal - pajaknya;
			System.out.println("Penghasilan kotor = " + pendapatan + " juta Rupiah");
			System.out.println("Pajak " + pajak + "% = Rp. " + pajaknya);
			System.out.println("Penghasilan bersih = Rp. " + bersih);
		} else if (pendapatan >= 251 && pendapatan <= 500) {
			long pajak = 25;
			long pajaknya = nominal * pajak / 100;
			long bersih = nominal - pajaknya;
			System.out.println("Penghasilan kotor = " + pendapatan + " juta Rupiah");
			System.out.println("Pajak " + pajak + "% = Rp. " + pajaknya);
			System.out.println("Penghasilan bersih = Rp. " + bersih);
		} else if (pendapatan > 500) {
			long pajak = 30;
			long pajaknya = nominal * pajak / 100;
			long bersih = nominal - pajaknya;
			System.out.println("Penghasilan kotor = " + pendapatan + " juta Rupiah");
			System.out.println("Pajak " + pajak + "% = Rp. " + pajaknya);
			System.out.println("Penghasilan bersih = Rp. " + bersih);
		}
	}
}
