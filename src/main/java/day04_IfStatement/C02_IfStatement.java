package day04_IfStatement;


import javax.swing.plaf.synth.SynthOptionPaneUI;

public class C02_IfStatement {

    public static void main(String[] args) {


    /*
    Ogrenci asagidaki gibi notlar aldiginda karsisindaki degerleri yazdiran bir kod yaziniz
                 not hesaplayici
              90 ~100 => A  Cok Iyi
              80 ~ 89 => B  Iyi
              70 ~ 79 => C  Orta
              60 ~ 69 => D  Gecer
              0 ~ 59  => F  Zayif
   */

        int not = 80;

        if (not>= 90 && not<=100){
            System.out.println("A = COK IYI");
        }else if (not <90 && not>=80){
            System.out.println(" B = IYI");
        }else if (not< 80  && not>70){
            System.out.println("C = ORTA");
        }else if (not<70 && not >60){
            System.out.println("D = GECER");
        }else if (not<60 && not>0){
            System.out.println("F = ZAYIF");
        }else{
            System.out.println("lutfen gecerli bir sayi giriniz.");
        }

    }
}
