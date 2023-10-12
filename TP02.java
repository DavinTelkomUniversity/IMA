import java.util.Scanner;

public class TP02 {
    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int a = s.nextInt();
    int b = 0;
    while (a != 0) {
        b = b * 10;
        b = b + a % 10;
        a = a / 10;
    } 
    System.out.println(b);
    }
}