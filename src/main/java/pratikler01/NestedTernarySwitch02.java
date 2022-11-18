package pratikler01;

import java.util.Scanner;

public class NestedTernarySwitch02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir gun sayisi giriniz...");
        byte dayNum = input.nextByte();

         // tum gun isimlerini yazdirmasin diye 'break' koyuyoryuz.

        //soru :
        // 1) Kullanıcı herhangi bir gün sayısı girdiğinde o gunun ve sonraki günlerin isimlerini ekranda
        //görmek istiyor.
        //2) default mesajını geçerli gün sayısı girdiğinde görmek istemiyor

        switch(dayNum) {
            case 1:
                System.out.println("Sunday");

            case 2:
                System.out.println("Monday");

            case 3:
                System.out.println("Tuesday");

            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Enter a valid day number");
        }
    }
}
