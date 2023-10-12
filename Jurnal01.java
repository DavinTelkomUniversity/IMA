import java.util.Scanner;

public class Jurnal01 {

    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int angka1 = s.nextInt();
	int angka2 = s.nextInt();
    System.out.println(perpangkatan(angka1, angka2));   
    }

    private static int perpangkatan(int angka1, int angka2){
        if (angka2 == 0) {
            return 1;
        } else {
            return angka1 * perpangkatan(angka1, angka2 -1);
        }
    }

}