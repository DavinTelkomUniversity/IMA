import java.util.Scanner;

public class Soal04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahPemain = sc.nextInt();
        int amsyongNumber = sc.nextInt();

        int kalah1 = -1;
        int kalah2 = -1;

        int[] angkaTebakan = new int[jumlahPemain];
        for (int i = 0; i < jumlahPemain; i++) {
            angkaTebakan[i] = sc.nextInt();
        }
        for (int i = 0; i < jumlahPemain-1; i++) {
            for (int j = i+1; j < jumlahPemain; j++) {
                if (angkaTebakan[i] + angkaTebakan[j] == amsyongNumber) {
                    if (kalah1 == -1) {
                        kalah1 = i+1;
                        kalah2 = j+1;
                    } else {
                        break;
                    }
                }
            }
        }

        if (kalah1 != -1 && kalah2 != -1) {
            System.out.println(kalah1 + " " + kalah2);
        } else {
            System.out.println("");
        }
    }
}
