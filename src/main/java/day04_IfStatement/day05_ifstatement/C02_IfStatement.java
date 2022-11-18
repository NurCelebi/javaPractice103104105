package day04_IfStatement.day05_ifstatement;

import java.util.Scanner;

public class C02_IfStatement {

    public static void main(String[] args) {

        // Kullanicidan yasini isteyin
        // 65 veya daha buyukse emekli olabilirsin
        // 65'den kucukse emekli olamazsin "? sene daha calisman lazim" yazdirin

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen yasinizi giriniz...");
        int yas = input.nextInt();

        if (yas>=65){
            System.out.println("emekli olabilirsin");
        }else{
            System.out.print("emekli olamazsin =");
            System.out.println(65-yas + "sene daha calisman lazim...");// print ve println yazinca tek satirda yazdirmis oldu.
        }

     // nested if else :

        if(yas>0){
            if (yas>65){
                System.out.println("emekli olabilirsin");
            }else{
                System.out.println("emekli olamazsin");
                System.out.println( 65-yas + " sene daha calismalisin");
            }
        }else{
            System.out.println("lutfen sifirdan buyuk bir sayi giriniz");
        }

    }
}
