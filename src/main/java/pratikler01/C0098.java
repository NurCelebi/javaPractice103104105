package pratikler01;

import javax.swing.*;

public class C0098 {

    public static void main(String[] args) {


        int num = 10;


        while (num > 1) {//sart kismi

//            num--;
            System.out.print(num + " ");
            num--;
//            System.out.println();
////            num--;

        }

        String str = "AliCan";
        System.out.println(str.substring(2, 5));


         /*
    A
    A A
    A A A
    A A A A

     */
        String a ="";

        int x = 4;

        for (int i =1 ; i< x ; i++){

            for (int k =1 ; k<=i ; k++){

                a=a+'A';
            }
            System.out.println(a);
        }


    }
}
