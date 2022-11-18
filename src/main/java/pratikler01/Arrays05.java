package pratikler01;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Arrays05 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("LUTFEN BIR CUMLE YAZINIZ.");
        String x = input.nextLine();

        System.out.println(x);




        String brr [][] = {{}};
        String l = input.next();

        int sum = 0;

        for (String[] w : brr){

            for (String p :w){

                sum = sum+ w.length;

            }


            System.out.println(sum);

        }
    }

}
