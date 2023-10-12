import java.util.Scanner;

public class Jurnal03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        if (a < 1 || a > 100) {
            System.out.println("Isi 1 - 100");
        } else {
			int n = 0;
			for (int i = 1; i <= a; i++) 
			{ 
			for (int j = 1; j <= i; j++) 
			{ 
				System.out.print(n % 10); 
				n++; 
			} 
			System.out.print("\n"); 
			} 
        }
    }
}