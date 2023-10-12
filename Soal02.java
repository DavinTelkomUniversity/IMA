import java.util.Scanner;

public class Soal02 {

	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int angka1 = s.nextInt();
        int angka2 = s.nextInt();
        int total = angka1 - angka2;
        int ratusan = (total / 100) % 10;
        int puluhan = (total / 10) % 10;
        int satuan = (total / 1) % 10;
        System.out.printf("%s ratus %s puluh %s\n", katanya(ratusan), katanya(puluhan), katanya(satuan));
    }

    private static String katanya(int angka) {
        switch (angka) {
            case 1:
                return "satu";
            case 2:
                return "dua";
            case 3:
                return "tiga";
            case 4:
                return "empat";
            case 5:
                return "lima";
            case 6:
                return "enam";
            case 7:
                return "tujuh";
            case 8:
                return "delapan";
            case 9:
                return "sembilan";
        }
        return "";
    }
}
