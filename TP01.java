import java.util.Scanner;

public class TP01 {

	public static void main(final String[] args) {
		Scanner s = new Scanner(System.in);
		float suhu1 = s.nextFloat();
		float suhu2 = s.nextFloat();
		float suhu3 = s.nextFloat();
		suhu(suhu1,suhu2,suhu3);
	}

		private static void suhu(float suhu1, float suhu2, float suhu3) {
			float celcius1 = (float)(((5.0 / 9) * (suhu1 - 32) * 100) / 100.0);
			float celcius2 = (float)(((5.0 / 9) * (suhu2 - 32) * 100) / 100.0);
			float celcius3 = (float)(((5.0 / 9) * (suhu3 - 32) * 100) / 100.0);
			System.out.printf("%.1f %.1f %.1f", celcius1, celcius2, celcius3);
		}
}
