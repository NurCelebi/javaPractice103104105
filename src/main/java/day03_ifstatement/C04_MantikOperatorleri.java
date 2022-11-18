package day03_ifstatement;

public class C04_MantikOperatorleri {

    /*
&& ile & arasindaki fark
&& de boolean sonuc 3 te bir tane false bulnuca durur tum satiri kontrol etmeye calısmaz
ancak & tum satırı kontrol eder ondan sonra durur
sonucta fark yok sadece biri ilk hatayı buldugunda durur digeri sonuna kadar gider
&& tekliye göre daha hızlı calisir.
mukemmelliyetcidir tum sartlar true olursa true olur.
 */

    public static void main(String[] args) {
        //1:
        System.out.println(5+2 == 8);

        //2:
        boolean sonu1 =5>4 && 7<9 && 6+3==9 && 5+2!=8;
        System.out.println("sonuc1==>"+sonu1);

        //3:
        boolean sonu2 = 5>4 && 7>9 && 6+3==9 && 5+2!=8;
        System.out.println("sonu2 = " + sonu2);

        //sayi1 in 10 ile 20 araliginda oldugunu true diyerek dondurelim
        // ikili karsilastirmalar yapip mantiksal operatorler ile birlestirmelyiz.
        // 10<SAYI1<20 JAVA UCLU KARSILASTIRMA YAPMAZ


        int sayi1 = 15;
        System.out.println(10<sayi1 && sayi1<20);



        //sayi2 nin 10 ile 20 arasinda olmadigini true diyerek dondurelim.
        int sayi2 = 5;
        System.out.println(sayi2<10 || sayi2<20); //true
        System.out.println( sayi2<10 || sayi2>20);// true

        //&& == ve ||=veya

        int sayi3 = 15;
        System.out.println(sayi3>10 || sayi3>20);//true









    }
}
