package pratikler01;

import java.awt.font.FontRenderContext;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Question01 {

    public static void main(String[] args) {
         /*
      arr1={ {1,2}, {3,4,5}, {6} };
arr2={ {7,8,9}, {10,11}, {12} };

Yukaridaki multidimensional arraylerin ic arraylerinde ayni indekse sahip elemanlarin toplamini
  ekrana yazdiran kod.
   */

//        int arr1[][]={ {1,2}, {3,4,5}, {6} };
//        int arr2[][]={ {7,8,9}, {10,11}, {12} };
////
//        int toplam =0;
//        int minArrUzunluk = Math.min(arr1.length,arr2.length);
//
//
//        for (int i =0; i<minArrUzunluk;i++){
//            for (int k =0;k<arr1[i].length;k++){
//                if (k<arr2[i].length){
//                    toplam = arr1[i][k]+arr2[i][k];
//                    System.out.println("dis arraylerin "+i+" .indeksi ile ic arraylerin "+k+ " indeksi toplami :" + toplam);
//                }
//            }
//        }

        //2.yol:
//
//        for (int i =0; i <arr1.length;i++ ){
//            for (int k =0; k<arr1[i].length;k++){
////                System.out.print(arr1[i][k]);//123456
//                for (int j=0;j< arr2.length;j++){
//                    for (int m = 0;m<arr2[j].length;m++){
//
//                        if (i==j && k==m){
//                            toplam=arr1[i][k]+arr2[j][m];
//                            System.out.println("dis arrylerin" +i+ ".indeksi ile ic arraylerin" +k+ ".indeksinin toplami: " + toplam);
//                        }
//                    }
//                }
//            }
//        }

        /*
        {{"$12" , "$22" , "0$"},   {"£9" , "£40" , "$1" },  {"£12", "$2","$0"}}
     *  Array de $ varsa 3.2 ile carp
     *  Array de £ varsa 4.2 ile carp
     *  elemanlarin toplamini  consola yazdir. sonuc = 374.6

 */

//        String str [][]= {{"$12" , "$22" , "0$"},   {"£9" , "£40" , "$1" },  {"£12", "$2","$0"}};
//        double toplam =0;
//
//        for (String[] w:str){
//            for (String k:w){
//                if (k.contains("$")){
//
//                    toplam+=Double.parseDouble(k=k.replace("$",""))*3.2;//string bir degeri matematiksel bir degere cevirmeemizi saglar.
//
//                }else {
//                    toplam += Double.parseDouble(k=k.replace("$",""))*4.2;
//                }
//            }
//        }
//        System.out.println(toplam);



        //example 3:
        /*
       Rastgele kullanici adi olusturan JAVA kodu yaziniz.
      *  1. Kullanici isimlerinin oldugu listemiz olsun.
      *  2. Kullanicidan ismini isteyelim
      *  3. Kullanicinin girecegi ismin onunde ve sonunda bosluklar olmasin.
      *  4. Kullanici adinin alinabilir olup olmadigina bakalim.
      *  5. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
       *  6. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup bunu kullaniciya sunalim.
      */

//
//        List<String> list = new ArrayList<>();
//        Random rnd =new Random();//rastegele sayi atamak icin
//        Scanner scan = new Scanner(System.in);
//
//        list.add("esra");
//        list.add("sumeyra");
//        list.add("cumali");
//        list.add("ebru");
//        list.add("mehmet");
//
//        System.out.println("kullanici isminizi giriniz.");
//        String kullanici = scan.nextLine().trim();
//
//        if (list.contains(kullanici)){
//            kullanici = kullanici+rnd.nextInt(100000);
//            System.out.println("kullanici adiniz daha once alinmistir." + kullanici+ "bu adi kullanabilirsiniz");
//        }else {
//            System.out.println("kullanici adi basariyla olusturulmustur."+kullanici);
//        }
//

        /*
        Math.random() classindan 0ile 1000 arasinda ureteceginiz sayilarda kullanici tarafindan verilen
         2 sayinin kac defa uretildigini gosteren bir method create ediniz?

         */



    }




}
