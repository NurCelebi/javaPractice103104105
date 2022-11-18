package day04_IfStatement.day05_ifstatement;

import java.util.Scanner;

public class C07_IfStatement {

    public static void main(String[] args) {

        //Kullanicidan dikdortgenin kenar uzunluklarini isteyin
        //ve dortgenin kare olup  olmadigini yazdirin

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen 1.kenar giriniz.");
        int kenar1 = input.nextInt();

        System.out.println("lutfen 2.kaner uzunlugunu giriniz");
        int kenar2 = input.nextInt();

        System.out.println("lutfen 3.kenar uzunlugunu giriniz");
        int kenar3 = input.nextInt();

        System.out.println("lutfen4.kenar uzunlugunu giriniz");
        int kenar4 = input.nextInt();


        if (kenar1 == kenar2 && kenar2 == kenar3 && kenar3 == kenar4){
            System.out.println("bu bir karedir...");
        }else System.out.println("kare degildir...");



        }
}
