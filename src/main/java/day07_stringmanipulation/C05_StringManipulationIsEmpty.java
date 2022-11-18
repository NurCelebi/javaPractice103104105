package day07_stringmanipulation;

import java.util.Scanner;

public class C05_StringManipulationIsEmpty {

    public static void main(String[] args) {

        String str1 = "Hi";
        System.out.println(str1.isEmpty());//falsee

        String str2 = "";
        System.out.println(str2.isEmpty());//true

        String str3= " ";
        System.out.println(str3.isEmpty());//false


        //kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.


        String str4 = "Kelime";

        if(str4.isEmpty()){
            System.out.println("bosluk var");
        }else System.out.println("bosluk yok");

    }
}
