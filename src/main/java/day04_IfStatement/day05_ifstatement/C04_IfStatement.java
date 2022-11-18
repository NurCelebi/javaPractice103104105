package day04_IfStatement.day05_ifstatement;

import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class C04_IfStatement {

    public static void main(String[] args) {


        //Kullanici 0'dan kucuk 120'den buyuk deger giremiyecek sekilde degerleri aldiktan sonra ;
       // Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir,
        // calisan erkekse 65 yasindan buyukse emekli olabilir seklinde yazdiran bir kod yaziniz.

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen cinsiyetinizi yaziniz" + "\n Kadin icin K \n Erkek icin E harfini yaziniz...");
        char cinsiyet = input.next().toUpperCase().charAt(0);


        System.out.println("lutfen yasinizi giriniz...");
        double yas = input.nextDouble();


        if (cinsiyet == 'K'){
            if (yas<0 || yas>120){
                System.out.println("lutfen dogru yas giriniz..");
            }else if (yas>60){
                System.out.println("emekli olabilirsin");
            }else{
                System.out.println("emekli olamazsin" + (60-yas) + " daha yil calismalisin");
            }

        }else if(cinsiyet == 'E'){
            if (yas<0 || yas >120){
                System.out.println("lutfen dogru yas degeri giriniz");
            }else if (yas>65){
                System.out.println("emekli olabilirsin");
            }else{
                System.out.println("emekli olamazsin" + (65-yas) + " daha yil calismalisin");

            }



        }else System.out.println("lutfen gecerli bir harf giriniz...");



    }
}
