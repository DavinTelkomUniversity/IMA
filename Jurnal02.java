import java.util.Scanner;

public class Jurnal02 {

	public static void main(final String[] args) {
		Scanner s = new Scanner(System.in);
		String hari = s.nextLine();
		int bilangan = s.nextInt();
		int result = 0;
		if (hari.equals("Senin")) {
			int day = 1;
			int totalDay = bilangan + day;
			if (totalDay > 7) {
				result = totalDay - 7;
			} else {
				result = totalDay;
			}
		} else if (hari.equals("Selasa")) {
			int day = 2;
			int totalDay = bilangan + day;
			if (totalDay > 7) {
				result = totalDay - 7;
			} else {
				result = totalDay;
			}
		} else if (hari.equals("Rabu")) {
			int day = 3;
			int totalDay = bilangan + day;
			if (totalDay > 7) {
				result = totalDay - 7;
			} else {
				result = totalDay;
			}
		} else if (hari.equals("Kamis")) {
			int day = 4;
			int totalDay = bilangan + day;
			if (totalDay > 7) {
				result = totalDay - 7;
			} else {
				result = totalDay;
			}
		} else if (hari.equals("Jumat")) {
			int day = 5;
			int totalDay = bilangan + day;
			if (totalDay > 7) {
				result = totalDay - 7;
			} else {
				result = totalDay;
			}
		} else if (hari.equals("Sabtu")) {
			int day = 6;
			int totalDay = bilangan + day;
			if (totalDay > 7) {
				result = totalDay - 7;
			} else {
				result = totalDay;
			}
		} else if (hari.equals("Minggu")) {
			int day = 7;
			int totalDay = bilangan + day;
			if (totalDay > 7) {
				result = totalDay - 7;
			} else {
				result = totalDay;
			}
		}
		switch (result) {
			case 1: System.out.println("Senin");
			break;
			case 2: System.out.println("Selasa");
			break;
			case 3: System.out.println("Rabu");
			break;
			case 4: System.out.println("Kamis");
			break;
			case 5: System.out.println("Jumat");
			break;
			case 6: System.out.println("Sabtu");
			break;
			case 7: System.out.println("Minggu");
			break;
		}
	}
}
