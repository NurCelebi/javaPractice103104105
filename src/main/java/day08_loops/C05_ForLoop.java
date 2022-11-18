package day08_loops;

import java.util.Scanner;

public class C05_ForLoop {
    public static void main(String[] args) {
        /*
  Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
  tekrarlayan kodu yaziniz

 * ornek:  input            output
 *         elma  2           eaea
 *         army  3           ayayay

 */

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir kelime giriniz");
        String kelime= input.nextLine();


        System.out.println("lutfen kac kere tekrarlanmasini istiyorsaniz giriniz");
        int tekrarSayisi = input.nextInt();

       String ilkSonHarf =  kelime.substring(0,1) + kelime.substring(kelime.length()-1);
       String cikti = "";//int'lerde 0 koyariz.Stringlerde "" yani hiclik atariz.

       for (int i = 0 ; i<kelime.length() ; i++){
           cikti += ilkSonHarf;//cikti= cikti + ilkSonHarf

           
       }
        System.out.println(cikti);

    }
}
