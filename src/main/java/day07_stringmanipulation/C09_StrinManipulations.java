package day07_stringmanipulation;

import java.util.Scanner;

public class C09_StrinManipulations {

     /*
       Bir password'un gecerli olup olmadigini asagidaki kurallara gore kontrol eden kodu yaziniz.
                   i)En az 8 character icermeli
                   ii)Space characteri icermemeli
                   iii)Buyuk harf icermemeli
                   iv)Son characteri "." olmali

*/
     public static void main(String[] args) {





         Scanner input = new Scanner(System.in);
        System.out.println("LUTFEN SIFRESINIZI GIRINIZ");

       String pwd = input.nextLine();

       boolean bir = pwd.length()>7;
         System.out.println(bir);

         boolean iki = !pwd.contains((" "));
         System.out.println(iki);

         boolean uc = pwd.replaceAll("[^A-Z]" , "").length()>0;
         System.out.println(uc);

         boolean dort =  pwd.endsWith(".");
         System.out.println(dort);


         if (bir&&iki&&uc&&dort){
             System.out.println("gecerli");
         }else{
             System.out.println("gecersiz");
         }




     }



}
