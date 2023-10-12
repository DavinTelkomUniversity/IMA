import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Jurnal03 {
    public static void main(String[] args) {
        Map<Integer, Integer> freq = new HashMap<>();
        int modus = 0;
        int max = 0;
        Scanner s = new Scanner(System.in);
        while (true) {
            int n = s.nextInt();
            if (n == -1) {
                break;
            }

            int count = freq.getOrDefault(n, 0) + 1;
            freq.put(n, count);

            if (count > max) {
                modus = n;
                max = count;
            } else if (count == max) {
                if (n > modus) {
                    modus = n;
                }
            }
        }

        System.out.println(modus);
    }
}