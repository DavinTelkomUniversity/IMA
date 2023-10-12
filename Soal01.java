import java.util.Scanner;

public class Soal01 {

	public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int satu = s.nextInt();
        int dua = s.nextInt();
        int tiga = s.nextInt();
        digit(satu);
        digit(dua);
        digit(tiga);
    }

    private static void digit(int angkanya) {
        int angka1 = (angkanya / 1000) + 7; 
        int angka2 = ((angkanya / 100) % 10) + 7; 
        int angka3 = ((angkanya / 10) % 10) + 7;
        int angka4 = (angkanya % 10) + 7;
        if (angka1 > 9 || angka2 > 9 || angka3 > 9|| angka4 > 9) {
            angka1 = angka1 % 10; 
            angka2 = angka2 % 10; 
            angka3 = angka3 % 10; 
            angka4 = angka4 % 10; 
        }

        // System.out.printf(angka3);
        System.out.printf("%d%d%d%d\n",angka3,angka2,angka1,angka4);
    }
}
