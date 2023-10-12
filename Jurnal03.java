import java.util.Scanner;

public class Jurnal03 {

	public static void main(final String[] args) {
		Scanner s = new Scanner(System.in);
        double P = s.nextDouble();
        double A = s.nextDouble();
        double B = s.nextDouble();
		double NA = 0.25*P+0.35*A+0.4*B;

        System.out.println(NA);
	}
}
