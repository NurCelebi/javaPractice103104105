package pratikler01;

import java.util.Arrays;
import java.util.List;

public class Arrays02 {

    public static void main(String[] args) {

        //soru2:Verilen multi dimensional arrayin ic array larindeki son elemanlarinin carpimini ekrana yazdiriniz.
//        int arr [][] = {{1, 2, 3}, {4, 5},{6}};  //3*5*6=
//
//        int carpim = 1;
//
//        for (int[] w: arr){
//
//                int k = w[w.length-1];
//
//                carpim = carpim * k;
//
//
//        }
//
//        System.out.println(carpim);//90


        ////soru3:Verilen multi dimensional arraylarin  ic array larindeki
        // ayni indexe sahip elemanlarinin toplamini ekrana yazdiran program.

//
//        int[][] arr1 = {{1, 2}, {3, 4, 5}, {6}};
//        int[][] arr2 = {{7, 8, 9}, {10, 11}, {12}};
//
//        int toplam1= 0;
//        int topla2 = 0;
//
//
//        for (int[] w: arr1 ) {
//            toplam1 = toplam1 + w.length;
//
//        }
//
//        for (int[] x :arr2){
//            topla2 = topla2 + x.length;
//        }
//        System.out.println(toplam1+topla2);
//
//
//        int idx=0;
//        int arr3[] = new int[toplam1+topla2];
//
//        for (int[] w :arr1){
//            for (int k: w){
//                arr3[idx] = k;
//                idx++;
//
//            }
//        }
//
//        for (int[] x : arr2){
//            for (int c :x){
//                arr3[idx]=c;
//                idx++;
//            }
//
//        }
//        System.out.println(Arrays.toString(arr3));
//
//
//
//        soru 1Ö verilen 3 elemanlai bir arrayiin tum elemanlarinin bir soldaki konum tasiyacak programi zayin.orn
//        array[1,2,3] output ise [2,3,1]


        int y[] = new int[3];

        y[0] =1;
        y[1]= 2;
        y[2] =3;

        System.out.println(Arrays.toString(y));

        int g[]= new int[3];

        g[0] = 2;
        g[1] =3;
        g[2] = 1;

        System.out.println(Arrays.toString(g));





        //verilen bir Arryay'in tum elemanlarini toplayan programi yaziniz.


        int z[] = new int[3];

        z[0] =1;
        z[1]= 2;
        z[2] =3;

        int toplam = 0;



        for (int w : z){
            toplam = toplam + w;

        }
        System.out.println(toplam);//6

        //soru 4 : multidimensional arrayin ic array'lerin tum elemanalrinin toplamini birere birer bulan ve herbir sonucu yazdiran kodu yaziniz.

        int zzr [][] = { {1,2,3}, { 4,5 }, {6,7} };

        int sum =0;


        for (int[] w  : zzr){

            for ( int k : w){
                sum = sum + k;

            }



        }

        System.out.println(sum);//28


















    }
}
