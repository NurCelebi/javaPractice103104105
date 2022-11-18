package pratikler01;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {
         //elemanlari ali veli ayse ve fatma bi array olusturun ve bu array'e yazdiriniz.

//        String str[]= new String[4];
//        str[0] = "ali";
//        str[1] = "veli";
//        str[2]= "ayse";
//        str[3]= "fatma";
//
//
//        System.out.println(Arrays.toString(str));


//
//        int[] random = {6,-4,12,0,-10};
//        int x =12;
//        int y = Arrays.binarySearch(random,x);
//        System.out.println();




//         int x = 0;

         int crr[][]= new int [2][3];

        crr[0][0]=1;
        crr[0][1]=2;
        crr[0][2]=3;
        crr[1][0]=4;
        crr[1][1]=5;
        crr[1][2]=6;

        System.out.println(Arrays.deepToString(crr)); //[[1, 2, 3], [4, 5, 6]]

        int h = 1;

//        int w,l ;


        for (int[] w : crr ){

            for (int k=1 ; k<7 ; k++){

                h= h* k;







            }
            System.out.println(h);


        }











//        int yeni []= new int[crr.length];
//
//
//
//        int x = 1;
//
//         for ( int[] w: crr){
//
//             for (int  a : w ){
//
//                 x   =  x * w.length ;
//
//             }
//
//             System.out.println(x);
//
//
//
////             System.out.println(x);
//
//         }
//
////        System.out.println(x);








    }

}
