package pratikler01;

import java.util.Scanner;

public class StudentPracticeSonSoru {

    public static void main(String[] args) {



    }

    Scanner input = new Scanner(System.in);

    int x=input.nextInt();
    int y = input.nextInt();



    public static void rastgele(int a , int b ){
        int counterA=0;
        int counterB=0;
        for (int i =0;i<1000;i++) {
            int sayi = (int) (Math.random() * 1000);
            if (sayi == a) {
                counterA++;
            } else if (sayi == b) {
                counterB++;
            }

            System.out.println(a + "sayisi" + counterA + " defa geldi.");
            System.out.println(a + "sayisi" + counterB + " defa geldi.");
        }    }
}
