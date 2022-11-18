package day02_variables;


import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class C03_Scanner {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//        System.out.println("lutfen isminizi giriniz");
//        String isim = input.next();// next'i secerseniz ilkini alir/ nextline sceersem iki ismi varsa ikisini de alir.
//
//        //Soru 1 ) Kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanini hesaplatan bir program yazdirin
//        //( CEMBERIN CEVRESI = 2*3.14*r  DAIRENIN ALANI = 3.14*r*r  )
//
//
//        System.out.println("lutfen yaricapi giriniz...");
//        int yariCap = input.nextInt();
//
//        System.out.println("sairenin alani :"+ 3.14*yariCap*yariCap);
//        System.out.println("dairenin cevrei :"+ 2*3.14*yariCap);

        // soru 2: //Soru 2 )  Kullanicidan bir dikdortgenin uzun ve kisa kenarlarini isteyip o dikdortgenin alan ve
        //// cevre hesabini yapan bir program yaziniz.

//        System.out.println("lutfen uzun kenariu giriniz...");
//        double uzun = input.nextDouble();
//
//        System.out.println("lutfen kisa kenari giriniz...");
//        double kisa = input.nextDouble();
//
//        System.out.println("alan:"+ uzun*kisa);
//        System.out.println("cevre"+ 2*(uzun+kisa));

        //3.soru: kenar uzunluklari kullanicidan alinan alinana bir ucgenin cevresini hesaplayan bir program yaziniz.(byte kullanin)
        //// Ucgenin cevresi=a+b+c
//
//        System.out.println("lutfen ilk kenar olcusunu giriniz");
//        byte ilk = input.nextByte();
//
//        System.out.println("lutfen ikinici kenari giriniz");
//        byte iki = input.nextByte();
//
//        System.out.println("lutfen ucuncu kenari girniz");
//        byte ucuncu = input.nextByte();
//
//        System.out.println("ucgenin cevresi :"+ (ilk+iki+ucuncu));
        // int cevre= a+b+c yapip = System.out.println("ucgenin cevresi" + cevre); yapabilirz.

        //4.soru: //    /*Kullanicidan aldiginiz sekille asagidaki gibi bir gorunum olusturan bir kod yaziniz
        //
        ///*
        //             A
        //            A A
        //           A A A
        //    */

//        System.out.println("lutfemn bir ifade giriniz");
//        char X = input.next().charAt(0);
//
//        System.out.println("  "+X+"   ");
//        System.out.println(" "+X+" "+X);
//        System.out.println(X+" "+X+" "+X);
//
//        System.out.println("lutfen bir karakter gitriniz..");
//        char z =input.next().charAt(0);
//
//        System.out.println(z+" "+z+" "+z);
//        System.out.println(" "+z+" "+z);
//        System.out.println("  "+z+"  ");


//        System.out.println("lutfen br karakter giriniz");
//        char Z = input.next().charAt(0);
//
//        System.out.println("  "+Z+"  ");
//        System.out.println(" "+Z+" "+Z+" ");
//        System.out.println(Z+" "+Z+" "+Z);
//
//        System.out.println("lutfen bir karakter giriniz...");
//        char X = input.next().charAt(0);
//
//        System.out.println(X+" "+X+" "+X);
//        System.out.println(" "+X+" "+X+" ");
//        System.out.println("  "+X+"  ");

        System.out.println("lutfen karakteri giriniz...");
        char O = input.next().charAt(0);

        System.out.println("  "+O+"  ");
        System.out.println(" "+O+" "+O+" ");
        System.out.println(O+" "+O+" "+O);
    }
}
