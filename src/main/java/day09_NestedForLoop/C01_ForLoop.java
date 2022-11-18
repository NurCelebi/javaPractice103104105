package day09_NestedForLoop;

import java.util.Scanner;

public class C01_ForLoop {

    public static void main(String[] args) {


          /*
              Kullanıcıdan aldiğınız 'c' ve 'a' iceren bir String değer içerisindeki
          'c' karakterinden önceki 'a' karakterlerinin sayısını bulan bir kod yazınız.
          */

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir cumle yaziniz...");
        String str = input.nextLine();

        int toplam = 0;

        str =str.toLowerCase();

        for (int i=0; i< str.length(); i++){
            if (str.charAt(i)=='a'){

                toplam++;



            }else if (str.charAt(i)=='c'){
                break;

            }

        }
        System.out.println("'c' oncesi 'a'larin sayisi " + toplam );
    }
}
