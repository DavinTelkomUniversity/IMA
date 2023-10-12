import java.util.Scanner;

public class TP03 {
    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int a = 0;
    int b = 1;
    while (b != 0) {
        b = s.nextInt();
        a = a + b;
    } 
    System.out.println(a);
    }
}