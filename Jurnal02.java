import java.util.Scanner;

public class Jurnal02 {

    private static int faktor(int bilangan1, int bilangan2) {
        return (bilangan2 == 0) ? bilangan1 : faktor(bilangan2, bilangan1 % bilangan2);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(faktor (s.nextInt(),s.nextInt()));
    }
    
}