import java.util.Scanner;

public class Jurnal03 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int i;
		boolean cek = true;
		if (a == 0 || a == 1) {
			cek = false;
		  } else {
			for (i = 2; i <= a / 2; i++) {
			  if (a % i == 0) {
				cek = false;
				break;
			  }
			}
		  } 
		  
		  if (cek) {
			System.out.println("YA");
		  } else {
			System.out.println("BUKAN");
		}
	}
}