import java.util.Scanner;

public class TP02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        if (a < 1 || a > 10) {
          System.out.println("Isi 1 - 10");
        } else {
            String l = "\n";
            for (int i = 0; i < a; i = i + 1) {
                l = "*"+ l;
                for (int j = 1; j < a - i; j++) {
                    System.out.print(" ");
                }
                System.out.print(l);
            }
        }
    }
}