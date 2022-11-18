package day03_ifstatement;

import java.util.Scanner;

public class C01_Scanner {

    public static void main(String[] args) {

       /*  Problem Tanımı
       Bir işçinin işi bitirme süresini ve toplam işçi sayısını alarak, işin bitme süresini
       hesaplayan kodu yazınız.
       Örneğin, Bir işçi bir işi 10 günde yapabilmektedir.
       Buna göre 2 işçi aynı işi kaç günde yapar?

       Örnek Ekran Çıktısı
        Bir işçi işi kaç günde bitirmektedir? 10
        Toplam kaç işçi çalışacak? 2
       İşin bitme süresi 5 gündür.
   */

        Scanner input = new Scanner(System.in);


        System.out.println("bir iscinin isi bitirme suresini giriniz...");
        double bitirmeSuresi = input.nextDouble();
        System.out.println("bitirme Suresi = " + bitirmeSuresi);

        System.out.println(" toplam kac isci calisacaktir...");
        double isciSayisi = input.nextDouble();
        System.out.println(" isci sayisi = " + isciSayisi);

        double hepBirlikteBitirmeSuresi = bitirmeSuresi/isciSayisi;
        System.out.println("hep birlikte bitirme sureleri = "+ hepBirlikteBitirmeSuresi);





    }
}
