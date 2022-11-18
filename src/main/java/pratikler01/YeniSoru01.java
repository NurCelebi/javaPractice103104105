package pratikler01;

import java.util.Scanner;

public class YeniSoru01 {

    public static void main(String[] args) {

        //kullanicidan bir cumle ve bir kelime isteyin kelimenin cumledeki kullanimina bakarak asagidaki
        // 3 cumleden uygun olanini yazdirin
        // girilen kelime cumlede kullanilmamis
        // girilen kelime cumlede bir kere kullanilmis
        // girilen kelime cumlede 1'den fazla kullanilmis

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir cumle yaziniz.");
        String cumle = input.nextLine();

        System.out.println("lutfen bir kelime yaziniz.");
        String kelime = input.next();

        int ilk = cumle.indexOf(kelime);
        int son = cumle.lastIndexOf(kelime);
//        String cumle = "Java bir gun degil,her gun calisilmasi gereken bir derstir.";
//        String kelime = "Java";

        if (cumle.equals(kelime) && cumle.indexOf(kelime)==cumle.lastIndexOf(kelime)){//-1 yok mu'yu bulmak icin
            System.out.println("Girilen kelime cumlede bir kere kullanilmis");

        }else if(!cumle.equals(kelime) && cumle.indexOf(kelime)!=cumle.lastIndexOf(kelime)){
            System.out.println("Girilen kelime cumlede birden cok kez kullanilmsitir");

        }else{

            System.out.println("girilen kelime cumlede kullanilmamistir.");
        }





    }
}
