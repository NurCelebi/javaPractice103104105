package pratikler01;

import java.util.Scanner;

public class Soru06 {

    public static void main(String[] args) {


        Scanner scan =new Scanner(System.in);

        System.out.println("Enter an inteğer");
        int a = scan.nextInt();

        if(a%2==0) {
            if(a%3==0) {
                System.out.println("Woooow!");
            }else {
                System.out.println("Hmmmm!");
            }
        }else{
            if(a%3==0) {
                System.out.println("Normal!");
            }else {
                System.out.println("Yazik!");
            }
        }
    }
}
