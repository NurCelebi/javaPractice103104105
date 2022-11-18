package day06_nestedifswitch;

import java.util.Scanner;

public class C01_Ternary {

    public static void main(String[] args) {


        /*
TASK :
 Kullanıcıdan sifirdan buyuk pozitif bir tamsayı girmesini isteyin.
 Girilen pozitif tamsayı 3 basamaklı ise ekrana "3 Basamaklı" yazdırın.
 3 basamaklı degilse çift olup olmadigini kontrol edin.
 Çift ise "3 basamaklı olmayan çift sayı" yazdırın.
 Çift sayı degilse "3 basamaklı olmayan tek sayı yazdırın."
 */

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen sifirdan buyuk bir tamsayi giriniz...");
        int sayi = input.nextInt();

        if (sayi>99 && sayi<1000){
            System.out.println("uc basamakli sayi");
        }else if(sayi%2==0){
            System.out.println("3 bas olmayan cift  sayi");
        }else if (sayi%2!=0){//bunu silebilriiz.
            System.out.println("3 basamakli olmayan tek sayi");
        }else{
            System.out.println("lutfen 0'dan buyuk bir sayi giriniz...");
        }




//        String sonuc = (sayi>0)       ? ( sayi>99 && sayi<1000)   ? ("uc basamakli 0'dan buyuk" ) :
//                (sayi%2==0)  ? ("3 basamakli olmayan cift sayi") : ( "3 basamakli olmayan tek sayi") :
//                "Lutfen 0'dan buyuk bir sayi giriniz";
//
//        System.out.println(sonuc);

    }
}
