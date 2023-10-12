import java.util.Scanner;
import java.util.Locale;

public class Soal03 {
 
	public static void main(final String[] args) {
		Scanner s = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		String jenis = s.nextLine();
		int berat = s.nextInt();
		double tinggi = s.nextDouble() / 100.0;
		double BMI = berat / Math.pow(tinggi, 2);
		String cat = "";
		
		if (jenis.equals("pria")) {
			if (BMI < 18.5) {
				cat = "Kurus";
			} else if (BMI >= 18.5 && BMI < 25.99) {
				cat = "Ideal";
			} else if (BMI >= 26 && BMI <= 31.99) {
				cat = "Overweight";
			} else if (BMI >= 32) {
				cat = "Obesitas";    
			}
		}
		if (jenis.equals("wanita")) {
			if (BMI < 20.5) {
				cat = "Kurus";
			} else if (BMI >= 20.5 && BMI < 26.99) {
				cat = "Ideal";
			} else if (BMI >= 27 && BMI <= 34.99) {
				cat = "Overweight";
			} else if (BMI >= 35) {
				cat = "Obesitas";
			}
		}
		float hasil = (float)(BMI);
		float myFloat = hasil;
		String hasilnya = String.format("%.02f", myFloat);
		System.out.println(hasilnya + ", " + cat);
	}
}
