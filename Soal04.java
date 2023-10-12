import java.util.Scanner;

public class Soal04 {

	public static void main(String[] args) {
		
				Scanner s = new Scanner(System.in);
				int a = s.nextInt();
				int b = s.nextInt();
				int n = s.nextInt();

                int Un = a + (n-1) * b;
                int Sn = (a+Un) * n / 2;
                System.out.println(Sn);
            }
	}
