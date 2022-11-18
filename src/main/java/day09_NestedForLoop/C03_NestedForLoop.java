package day09_NestedForLoop;

import java.util.Scanner;

public class C03_NestedForLoop {

    public static void main(String[] args) {

        //EX: Dikey olarak bolunen bir agac sekli ciziniz.. agacin tac uzunlugunu kullanicidan aliniz..
        // Not :govde sabit sayi =5 olsun
    /* tac uzunlugu -> 6 iken

       ^
       ^^
       ^^^
       ^^^^
       ^^^^^
       ^^^^^^
       |||
       |||
       |||
       |||
       |||


*/
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen agacin tac uzunlugunu giriniz." );
        int tacUzunlugu = input.nextInt();


        String yaprak = "";

        for (int x= 0 ; x< tacUzunlugu; x++){
            yaprak+="^";
            System.out.println(yaprak);


        }
        for (int i =0; i<tacUzunlugu ;i++){
            System.out.println("|||");
        }


    }
}
