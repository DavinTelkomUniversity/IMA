import java.util.Scanner;

public class TP01 {
    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
    int a = 30;
    int m = 0;
    while (a < n) {
        m += 15;
        a *= 2;
    } 
    System.out.println(m);
    }
}