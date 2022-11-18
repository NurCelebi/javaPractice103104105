package day07_stringmanipulation;

import java.util.Scanner;

public class C01_StringManipulationsConcat {

    public static void main(String[] args) {

         /*

    ONEMLI NOT=JAVA YUKARIDAN ASAGI ; SOLDAN SAGA CALISIR.

     */




            System.out.println(15 + 20 + "Merhaba");//35Merhaba
            System.out.println("Merhaba" + 15 + 20);//parantez icerisinde degil bu sebeple 1520  olarak yazdirir.
            System.out.println("Merhaba" + (15 + 20));//merhaba35
            System.out.println("Merhaba" + 15 * 20);//carpmanin onceligi vardir o yuzden 300 olur

            //Kullanicidan ismini ve soyisimi girmesini isteyin, sonrasinda konsola kullanici nasil girerse girsin
            //tam isminin buyuk harfle yazilmasini saglayin.

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen isim ve soyisminizi giriniz...");

        String isim = input.nextLine(), soyIsim = input.nextLine();//multiple declaration == coklu tanimlama

         // String soyIsim = input.nextLine();
        String tamIsim = isim.concat(""+soyIsim).toUpperCase();
        System.out.println("tamIsim =" + tamIsim);

    }
}
