package day09_NestedForLoop;

import java.util.Scanner;

public class C06_WhileLoop {

    public static void main(String[] args) {

        /*
        Kullanicicdan toplanmak uzere sayilar isteyin.
        sayi adedi 10'u gecerse ya da toplami 500'u gecerse
        "Bu kadar sayi yeter.... adet sayi girdiniz.toplami ..."
        yazdirin

         */

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen sayi giriniz.");
//        int sayi = input.nextInt();

        int toplam = 0;//sayilarin toplami icin

        int sayi = 0;

        int sayac = 0;//adet sayisi icin


        while(sayac<11 && toplam<500 ){
            System.out.println("lutfen toplanmak uzere sayi giriniz.");
            sayi = input.nextInt();
            toplam+= sayi;
            sayac++;

        }
        if (toplam >500){
            System.out.println(sayac+ " adet sayi girdiniz.Toplami "+ toplam);
        }else System.out.println("bukadar sayi yeter."+ sayac+ "adet sayi girdiniz.toplami "+ toplam);
    }
}
