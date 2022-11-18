package day03_ifstatement;

import java.util.Scanner;

public class C05_IfStatement {

    public static void main(String[] args) {



         /*
           kullanicidan alacaginiz iki sayiyi yine kullaniciya sectirecegiz.
           dort islemden biri ile isleme koyup yazdiriniz.
          */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen \n toplama islemi icin 1 \n cikarma islemi icin 2 \n bolme islemi icin 3 \n carpma islemi icin 4 \n giriniz... ");

        int islem = input.nextInt();//kullanicinin islem tercihi icin bir vriable olusturduk.

        System.out.println("lutfen iki tamsayi giriniz...");//kullaniciya bildirimde bulunduk
        double num1 = input.nextDouble();//1.sayi assign edildi.
        double num2 = input.nextDouble();//2.sayi assign edildi.

        if (islem== 1 ){
            System.out.println("toplama isleminin sonucu = " +num1+ "+" + num2+ "="+ (num1+num2));
        }else if(islem==2){
            System.out.println("cikarma isleminin sonucu : " +num1+ "-"+num2+ "="+(num1-num2));
        }else if(islem==3){
            System.out.println("bolme islemi sonucu " +num1+"/"+num2+ "="+ (num1/num1));
        }else if(islem==4){
            System.out.println("carpma isleminin sonucu :"+num1+"*"+ num2 +"="+(num1*num2));
        }else System.out.println("hatali giris yaptiniz...");







    }
}
