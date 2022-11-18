package pratikler01;

import java.util.Scanner;

public class Soru04 {
    public static void main(String[] args) {

        //kullanicidan SDET kisaltmasindaki harflerden birini yazmasini isteyin
        //kullanici s girerse software
        //D girerse developer
        //e girerse engineer
        //t girerse in testing yazdirin

        Scanner input = new Scanner(System.in);
        System.out.println("SDET kelimesindeki harflerden birini giriniz...");
        String harf = input.next();

        if (harf.equalsIgnoreCase("S")){
            System.out.println("software...");
        }else if(harf.equalsIgnoreCase("D")){
            System.out.println("developer");
        }else if(harf.equalsIgnoreCase("E")){
            System.out.println("engineer");
        }else if(harf.equalsIgnoreCase("T")){
            System.out.println("in testing");
        }

        switch (harf){

            case "S " :
                System.out.println("software");
                break;
            case "D" :
                System.out.println("developer");
                break;
            case "E":
                System.out.println("Engineer");
                break;
            case "T" :
                System.out.println(" In Testing");
                break;
            default:
                System.out.println("lutfen gecerli bir harf giriniz...");
        }




    }
}
