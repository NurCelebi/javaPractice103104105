package day03_ifstatement;

public class C02_AsciiDegerleri {

    public static void main(String[] args) {

        //ascii sayisal deger demektir.klavyedeki harf ve sembollerin ascii degerleri yani bir karsiligi vardir.
        //'A' ve 'a' ascii degerleri farklidir.kucuklerin ascii degerleri buyuklerinkinde farklidir.

        char harf = 'a';
        char harf2 ='A';

        System.out.println("harf > harf2 ==>"+ (harf> harf2));
        //true karsilastirma islemlerin sonucunu boalean true yada false doner

        // Buyuk harflerin Ascii degerleri kucuk harflerin ASCII degerlerinden daha kucuktur.

          //1) herhangi bir char variable'in ASCII degerleri kod yazarak bulunuz.

        char harf3= 'b';
        char harf4 = 'B';

        System.out.println("harf3 > harf4 ==>" + (harf3 >harf4));

        char space =' ';

        System.out.println("Space'in ASCII degeri : "+ (space+0));// 32 space\in ascii degerini hesaplamak icin toplamaya etkisi olmayan '0'
        //seceriz. boylece yazdirdigimiz deger bize space'in ASCII degerini verir.

        //1.yol:

        char m = 'm';
        System.out.println("m'nin ASCII degeri : "+ (m+0));

        //2.yol:
        // char'larda Java char karakteri integer'da atayabiliriz. cunku char'in bir resim karakteri
        // bir de sayisal matematiksel ASCII degeri vardir.Bu nedenler ASCII degerlerini hesaplayabiliriz.

        int harf5= 'm';
        System.out.println("m'nin ASCII degeri  =" + harf5);


        //soru:
        byte b1 = 12;
        byte b2 = -125;

        System.out.println("b1> b2 ==> "+ (b1>b2));

        //soru:

        float f1 =2.45645f;
        float f2 = 5.86786F;

        System.out.println("f1>f2 ==> " + (f1>f2));
        System.out.println("b1> f1 ==> "+ (b1> f1));


        //soru:

        long lng1 = 657897654L;
        System.out.println("b1<lng1 ==>"+ (b1<lng1));//true

        char ch = 'h';
        System.out.println("b1>ch ==>"+ (b1>ch));//false

        //kiyaslamalar her zama boolean true-false oluyor








    }
}
