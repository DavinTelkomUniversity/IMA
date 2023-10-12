import java.util.Scanner;

public class Soal01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean lampu1 = false;
        boolean lampu2 = false;
        int input;

        input = s.nextInt();

        for (int i = 0; i < input; i++) {
            if (!lampu1 && !lampu2) {
                lampu1 = true;
                System.out.println("HIDUP MATI");
            } else if (lampu1 && !lampu2) {
                lampu2 = true;
                System.out.println("HIDUP HIDUP");
            } else if (lampu1 && lampu2) {
                lampu1 = false;
                System.out.println("MATI HIDUP");
            } else if (!lampu1 && lampu2) {
                lampu2 = false;
                System.out.println("MATI MATI");
            }
        }
    }
}
