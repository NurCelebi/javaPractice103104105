package day07_stringmanipulation;

import java.util.Scanner;

public class C06_StringManipulationssLength {

    /*
     * Length()
     * length() method'u girilen String'in uzunlugunu verir
     * butun karakterlerin adedi (bosluklar da birer karakterdir)
     */

    public static void main(String[] args) {

        //havva==length=5
        //index==4

        String cumle = "Bugun hava yagmurlu";


        String str1= "";
        System.out.println(str1.length());//0

        String str2 = " ";
        System.out.println(str2.length());//1



        //Kullanicidan isim ve soyisimini girmesini isteyin ve
        //hangisinin daha uzun oldugunu yazdirin.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen isminizi ve soyisminizi giriniz: \n isim :");
        String isim= input.next();


        System.out.println("soyisiminiz");
        String soyIsim=input.next();

        if (isim.length()> soyIsim.length()){
            System.out.println("isminiz soyisminizden uzundur");
        }else if(isim.length()==soyIsim.length()){//method ile sayi haline gitirdigimiz icin == kullandik.yoksa equals kullanacaktik.
            System.out.println("isminiz ve soyisminiz ayni uzunluktadir.");
        }else System.out.println("soyisminiz isminizden uzundur.");


        //kullanicidan 4 harfli bir kelime isteyin
        //ve girilen kelimeyi tersten yazdirin
//
//        Scanner input =new Scanner(System.in);
        System.out.println("LUTFEN 4 HARFLI BIR KELIME GIRINIZ");
        String kelime = input.nextLine();
        System.out.println(kelime.length());

        if (kelime.length()==4){
            char bir = kelime.charAt(0);
            char iki = kelime.charAt(1);
            char uc = kelime.charAt(2);
            char dort= kelime.charAt(3);
            System.out.println("Tersten yazilmis hali :" + dort+uc+iki+bir);




        }else if (kelime.length()>4){
            System.out.println("girdiginiz kelime 4 karakterden fazladir...");
        }else if (kelime.length()<4){
            System.out.println("girdiginiz kelime 4 karakterden azdir...");
        }

    }
}
