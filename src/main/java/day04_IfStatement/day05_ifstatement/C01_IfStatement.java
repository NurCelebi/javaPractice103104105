package day04_IfStatement.day05_ifstatement;

import java.util.Scanner;

public class C01_IfStatement {

    public static void main(String[] args) {

       /*Soru 6) Kullanicidan iki sayi isteyin,
 sayilarin ikisi de pozitif ise "sayilarin toplamini "yazdirin,
 sayilarin ikisi de negative ise "sayilarin carpimini" yazdirin,
 sayilarin ikisi farkli isaretlere sahipse "farkli isaretlerde sayilarla islem yapamazsin" yazdirin,
 sayilardan sifira esit olan varsa "sifir carpmaya gore yutan elemandir" yazdirin.*/


        Scanner input = new Scanner(System.in);
        System.out.println("lutfen iki sayi girniz...");
        double a = input.nextDouble();
        double b= input.nextDouble();

        if (a>0 && b>0){
            System.out.println("sayilarin toplami ="+ (a+b));
        }else if (a<0 && b<0){
            System.out.println("sayilarin carpimi" + (a*b) );
        }else if(a==0 || b==0){
            System.out.println("sifir carpmaya gore yutan elemandir");
        }else{
            System.out.println("farkli isaretlerde sayilarla islem yapamazsin");

        }


    }
}
