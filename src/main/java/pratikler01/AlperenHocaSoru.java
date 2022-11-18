package pratikler01;

import java.util.Scanner;

public class AlperenHocaSoru {

    public static void main(String[] args) {

     Scanner scan = new Scanner(System.in);
        System.out.println("cumle ve kelime gir");
        String cumle = scan.nextLine();
        String kelime = scan.nextLine();
        int ilk=cumle.indexOf(kelime);
        int son=cumle.lastIndexOf(kelime);
        if (ilk==(-1)){                          // YOK MU
            System.out.println("Girilen kelime cumlede kullanilmamis.");
        } else if (ilk==son){                   // ilk girilen son girilene esit mi
            System.out.println("Girilen kelime cumlede 1 kere kullanilmis.");
        }else {                                   // diger durumlarda sonuc
            System.out.println("Girilen kelime cumlede 1’den fazla kullanilmis.");
        }
    }

    //gorunmez constructor'in gorunur hali budur aslinda.constructor obje olusturmaya yarar.
    //Class olusturdugumuzda Java otomatik olarak gorunmaz bir constructor verir.Cunku Java Class'in bir kalip oldugunu
    // ve Object olusturmak icin yaratildigini ve Object olusturmak icin constructor'in sart oldugunu bilir.
    //Java'nin otomatik olarak olusturdugu bu gorunmez constructor'a 'default constructor' denir.
    //siz kendiniz herhangi bir constructor olsutrudgunuzda Java 'default constructor'i siler.
    //Bir Class'da birden fazla constructor olabilir.Fakat bu contructor'larin parametreleri farkli olmalidir.
    //"this" keyword "bu class" anlamindadir.this.price demek bu Class'daki "price" variable demektir.
    //"this.price" syntax'i constructor'larin icinde kullanilir.
    //constructor kullanarak variable'lar uzerinde yaptiginiz degisimler sadece Object uzerindeki variable'larin degerlerini degistirir.
    //Class'daki variable degerlerini degistiremez.
}
