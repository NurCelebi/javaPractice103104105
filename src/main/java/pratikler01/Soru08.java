package pratikler01;

import java.util.Scanner;

public class Soru08 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter password");
        String password = scan.nextLine();
        char initial = password.charAt(0);
        if(initial>='A' && initial<='Z') {
            if(initial=='A') {
                System.out.println("Gecerli");
            }else {
                System.out.println("Gecersiz");
            }
        }else if(initial>='a' && initial<='z') {
            if(initial=='z') {
                System.out.println("Gecerli");
            }else {
                System.out.println("Gecersiz");
            }
        }else {
            System.out.println("Bu ne?");
        }
    }
}
