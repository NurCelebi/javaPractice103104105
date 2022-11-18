package day09_NestedForLoop;

import java.util.Scanner;

public class C05_ForLoop {

    public static void main(String[] args) {

        // Girilen bir stringin harflerini teker teker ekrana alt alta olacak
// sekilde yazdiriniz, bosluk veya a harfi geldiginde bunlari yazmasin


        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir kelime giriniz");
        String str = input.nextLine();

        for(int i = 0; i< str.length() ; i++){

            if (str.charAt(i)== 'a'|| str.charAt(i)==' ')//ifadenin karakterlerine bakildi
                continue;        //break denirse loop'dan cikar.ifadede 'a' yada bosluk varsa atla
                System.out.println(str.charAt(i));



        }

    }
}
