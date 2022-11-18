package day04_IfStatement.day05_ifstatement;

import java.util.Scanner;

public class C03_IfStatement {

    public static void main(String[] args) {

        //1) kullanicidan maas icin bir teklif isteyin ve
        //Teklif 20.000'in uzerinde ise 'kabul ediyorum'
        //10.000'nin altinda ise 'maalesef kabul edemem'

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen maas icin bir teklif veriniz...");
        double maas = input.nextDouble();

        if(maas>= 20000){
            System.out.println("kabul ediyorum");
        }else if (maas>=10000 && maas<20000){
            System.out.println("konusabiliriz");
        }else {
            System.out.println("maalesef kabul edemem");
        }

        //2.yol:


    }

}
