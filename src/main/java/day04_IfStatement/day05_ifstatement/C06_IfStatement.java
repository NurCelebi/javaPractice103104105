package day04_IfStatement.day05_ifstatement;

import java.util.Scanner;

public class C06_IfStatement {

    public static void main(String[] args) {

           //Kullanıcıdan 4 basamakli bir sayi girmesini isteyin.
          // Girdiği sayi 5’e  bölünüyorsa son rakamını kontrol edin.
          // Son rakamı 0 ise ekrana "5’e bölünen çift sayı" yazdırın.
          // Son rakamı 0 değil ise "5’e bölünen tek sayı" yazdırın.
         // Girdiği password 5’e bölünmüyorsa ekrana "Tekrar deneyin" yazdırın.

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen dort basamakli bir sayi giriniz...");
        int sayi = input.nextInt();

        if(sayi<1000 || sayi>9999){
            System.out.println("lutfe gecerli pozitif bir sayi giriniz..." );
        }else if (sayi %5==0){//4 bas ve 5'e bolunebilir
           if (sayi%10==0){//4 basamakli 5 ile bolunebilen son rakami =0 olan sayilar var.
               System.out.println("5'e bolunebilen cift sayi");
           }else{
               System.out.println("5'e bolunebilen tek sayi");
           }









        }else {//4 basamakli ama 5'e bolunemiyor.
            System.out.println("tekrar deneyin...");
        }
    }
}
