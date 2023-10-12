import java.util.Scanner;

public class Soal05 {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
int lombanya = s.nextInt();
int pesertanya = s.nextInt();

int[] rt01 = new int[lombanya * pesertanya];
int[] rt02 = new int[lombanya * pesertanya];
int[] rt03 = new int[lombanya * pesertanya];

int hasil1 = 0;
int hasil2 = 0;
int hasil3 = 0;

    for (int i = 0; i < rt01.length; i++) {
        rt01[i] = s.nextInt();
    }

    for (int i = 0; i < rt02.length; i++) {
        rt02[i] = s.nextInt();
    }

    for (int i = 0; i < rt03.length; i++) {
        rt03[i] = s.nextInt();
    }

    for (int i = 0; i < rt01.length; i++) {
        if(rt01[i] > rt02[i] && rt01[i] > rt03[i]) {
            hasil1++;
        } else if(rt02[i] > rt01[i] && rt02[i] > rt03[i]) {
            hasil2++;
        } else if(rt03[i] > rt01[i] && rt03[i] > rt02[i]){
            hasil3++;
        }
    }

    if(hasil1 > hasil2 && hasil1 > hasil3) {
        System.out.println("RT 01 juara umum perlombaan");
    } else if (hasil2 > hasil1 && hasil2 > hasil3) {
        System.out.println("RT 02 juara umum perlombaan");
    } else {
        System.out.println("RT 03 juara umum perlombaan");
    }

    }
}