import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Jurnal02 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int peserta = s.nextInt();
    ArrayList<Integer> n = new ArrayList<>();

    for (int i = 0; i < peserta; i++) {
      int point = s.nextInt();
      n.add(point);
    }

    Collections.sort(n, Collections.reverseOrder());

    int tier1 = 0;
    int tier2 = 0;
    int tier3 = 0;
    for (int p : n) {
      if (p <= 4) {
        tier1++;
      } else if (p <= 9) {
        tier2++;
      } else {
        tier3++;
      }
    }

    System.out.println("Tier 1 :" + getTierString(tier1));
    System.out.println("Tier 2 :" + getTierString(tier2));
    System.out.println("Tier 3 :" + getTierString(tier3));
  }

  private static String getTierString(int count) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < count; i++) {
      sb.append("*");
    }
    return sb.toString();
  }
}