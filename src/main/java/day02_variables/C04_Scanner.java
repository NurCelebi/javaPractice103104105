package day02_variables;

import java.util.Scanner;

public class C04_Scanner {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


          //Soru 1)   Kullanicinin  girdigi 4 basamakli sayinin ilk ve son rakaminin toplamini ekrana yazdiran programi yazdiriniz

//        System.out.println("lutfen 4 haneli bir sayi giriniz...");
//        int sayi = input.nextInt();
//
//        //bir sayinin birler basamagindaki rakami %10 ile hesaplatabiliriz.
//
//        int sonRakam= sayi%10;
//        int ilkRakam=sayi/1000;
//
//        System.out.println("ilk rakam + son rakam =  " +  (ilkRakam+sonRakam));
        //  Soru 3) Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve son 2 basamagindaki rakamlarin toplamini bulunuz
        //         *   Ex :
        //         *   input  : 12345==>1+2+4+5=12
        //         *   output : 12


        // soru 2:  Kullanicidan uc basamakli bir sayi alin ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin

         /* Ornek : Inputs : 853
             Output : Girdiginiz sayinin birler basamagi : 3
             Girdiginiz sayinin onlar basamagi : 5
             Girdiginiz sayinin yuzler basamagi : 8

         */
//
//        System.out.println("lutfen 3 basamakli sayiyi giriniz");
//        int sayi1= input.nextInt();
//
//
//        //1ler basamagindaki sayiyi bulmak icin
//
//        int birler = sayi1%10;
//        System.out.println("girdiginiz sayinin birler basamagi"+ birler);
//
//        //int yeniSayi = sayi1/10;
//        //System.out.println("yeni sayi ="  +yeniSayi);
//
//        //10lar basamagi icin
//        int onlar = yeniSayi%10;
//        System.out.println("girdiginiz sayinin onlar basamagi"+ onlar);
//
//        //100ler basamagi
//        int yuzler = sayi1/10;
//        System.out.println(" yuzler basamagi = "+yuzler);




        //  Soru 3) Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve son 2 basamagindaki rakamlarin toplamini bulunuz
        //         *   Ex :
        //         *   input  : 12345==>1+2+4+5=12
        //         *   output : 12


        System.out.println("bes basamakli bir sayi giriniz...");
        int num = input.nextInt();
        int ilkIikiRakam = num/1000;

        System.out.println("ilk iki rakami = "+ ilkIikiRakam);// 12 bulur burada
        int ilkIkiTop = (ilkIikiRakam%10)+ (ilkIikiRakam/10);//2+1
        System.out.println("ilkikitop = "+ ilkIkiTop);

        int sonIkiRakam = num%100;
        System.out.println("sonIkiRakam = "+ sonIkiRakam);
        int sonIkiTop = (sonIkiRakam%10)+ (sonIkiRakam/10);
        System.out.println("sonIkitop ="+ sonIkiTop);

        int toplam = ilkIkiTop+ sonIkiTop;
        System.out.println("toplam =" + toplam);



















    }
}
