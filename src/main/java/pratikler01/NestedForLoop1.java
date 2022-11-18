package pratikler01;

import java.util.Scanner;

public class NestedForLoop1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//        System.out.println("lutfen bir karakter giriniz");
//        char ch = input.next().charAt(0);

//        for (int x =1; x<=4;x++){
//
//            for (int y=1 ; y<=x;y++){
//                System.out.print("*" + " ");
//            }
//
//            System.out.println();
//        }
//
//        System.out.println("carpim tablosu icin bir sayi giriniz...");
//
//        int p = input.nextInt();
//
//        for (int i = 1; i<=3;i++){
//
////            for (int p = 1; p<=3;p++){
//                System.out.println(p + "x" + i +  "=" + i*p);
////            }
////            System.out.println();
//        }
//
//        System.out.println();
//
//        //while loop kullanarak 3'den 13'e kadar tum tek sayilari yazdiriniz
//
//        int u=3;
//
//        while (u<14){
//
//           if (u%2!=0){
//               System.out.print(u+ " ");
//
//           }
//           u++;
//
//        }
//        System.out.println();


        //for loop ve while loop kullanarak 3 basamakli sayilardan 15,20,90'na tam bolunebilen sayilari yazdirin

//        System.out.println("lutfen 3 bas bir sayi girniz.");
//        int f = input.nextInt();
//
//        for (f=100;f<1000; f++){
//            if (f/15==0 && f/20==0 && f/90==0){
//                System.out.println("tam bolunuyor");
//            }else{
//                System.out.println("tam bolunmuyor");
//            }
//
//        }
//        System.out.println();

        //kullanicidan baslangic ve bitis degerlerini alin.baslangic degeri ve bitis degeri dahil aralarindaki tum cift sayilari whiler loop ile ekrana yazdirin.

//        System.out.println("lutfen baslangic sayisini girin");
//
//        System.out.println("lutfen bitis sayisini giriniz");
//
//
//        int  q =0;
//
//        while (q <101){
//
//            if (q%2==0){
//                System.out.print(q + " ");
//            }
//            q++;
//        }
//
//        System.out.println();

        //kullaniciddan baslangic ve biris harflerini alin ve baslangic harfinden baslayip bitis harfinde biten tum harfleri
        // buyuk harf olarak ekrana yazdirin.kullanicinin hata yapmadigini far edin.


//            System.out.println("lutfen bir harf giriniz.");
//            char ch = input.next().charAt(0);
//
//            for ( ch ='A'; ch <= 'Z' ; ch++){
//                if (ch>='A' ||  ch<='Z'){
//                    System.out.println(ch + " ");
//                }else {
//                    System.out.println("lutfen tekrar giriniz");
//
//
//                }
//
//            }
//            System.out.println();


        //kullanicidan bir rakam alin cve bu rakam icin carpim tablosu yazdirin.

        System.out.println("lutfen bir rakam giriniz");

        int g =1 ;

        while (g <11){
            System.out.println(g + "x" + g + "=" + g*g);

            g++;


        }

        System.out.println();
        // kullanicicdan bir sayi alin ve bu sayiyi tam bolen sayilari ve toplam kac tane olduklarini ekrana yazdirin.

//        System.out.println("lutfen bir sayi giriniz.");
//
////        int sayi = input.nextInt();
//
//        int f=1;
//
//        while( f <= 20){
//
//            if (f%2==0 ){
//                System.out.print(f+" ");
//
//            }
//            f++;
//            System.out.println();
//        }

        //kullanicicdan bir sayi alin ve rakamlari toplamini yazdrin



        int toplam = 0;

        int sayi1= 145;

        sayi1= Math.abs(sayi1);


        while (sayi1>0){

            toplam = toplam+ sayi1%10;

            sayi1 = sayi1/10;
        }

        System.out.println(toplam);









    }







}
