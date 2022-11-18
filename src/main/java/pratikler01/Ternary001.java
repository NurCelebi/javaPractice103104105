package pratikler01;

import java.util.Scanner;

public class Ternary001 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//        System.out.println("lutfen iki sayi giriniz...");
//        int a = 12;
//        int b = 13;
//
//        int min = a < b ? a : b;
//        System.out.println(min);



        //kullanicidan bir tam sayi alin ve sayinin cif mi tek mi oldugunu yazdirin

//        System.out.println("lutfen bir tamsayi giriniz...");
//        int c = input.nextInt();
//        Math.abs(c);
//        System.out.println();


//        if(c%2==0){
//            System.out.println("cift sayi");
//        }else if(c%2!=0){
//            System.out.println("tek sayi");
//        }else {
//            System.out.println("lutfen gecerli tamsayi giriniz...");
////        }


//
//        String  sonuc = c%2==0 ? ("cift sayi") : ("tek sayi");
//        System.out.println(sonuc);



        //Kullanicidan bir sayi alin ve sayinin mutlak degerini yazdirin.

        System.out.println("lutfen bir sayi giriniz...");
        int c= input.nextInt();
        c = Math.abs(c);
//        int abs  = c<0 ? -1*c : c;

        System.out.println(c);


        //kullanicidan bir sayi lain.sayi pozitif ise sayi pozitif yazdirin negatifse sayisinin karesini yazdirin

        System.out.println("lutfen bir sayi giriniz...");
        int f = 10;
        int sonuc = f>0 ? f : f*2;







    }
}