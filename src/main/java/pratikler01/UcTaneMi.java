package pratikler01;

import java.util.Arrays;
import java.util.Scanner;

public class ThreeEvenOdd {

     /*
   Parametre olarak int dizisi verildiğinde
   array 3 tane çift veya 3 tane  tek değer içeriyorsa true değerini döndürür.
   Örnek:
   intArray([2, 1, 3, 5]) sonuc  true olmalı
   intArray([2, 1, 2, 5]) sonuc   false olmalı
   intArray([2, 4, 2, 5]) sonuc   true olmalı
   */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("lutfen eleman sayisi giriniz");
        int elemanSayisi = input.nextInt();
        int arr[]=new int[elemanSayisi];
        System.out.println(Arrays.toString(arr));//[0, 0, 0, 0]


        boolean UcElemanMi = true;

        int ciftSayiToplam =0;
        int tekSayiToplam =0;



        int eleman = 0;

        for (int i =0 ; i<elemanSayisi;i++){

            System.out.println(i+1 + "elemani giriniz.");
            eleman=input.nextInt();
            arr[i]=eleman;

        }
        System.out.println(Arrays.toString(arr));





        for (int i = 0;i <arr.length;i++){

            if (arr[i]%2==0){
                ciftSayiToplam++;

            }else{
                tekSayiToplam++;

            }

            System.out.print(ciftSayiToplam);
            System.out.print(tekSayiToplam);

            if (ciftSayiToplam>=3 || tekSayiToplam>=3){
                System.out.println(UcElemanMi);

            }else
                System.out.println("false");




        }



    }
}
