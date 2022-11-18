package day04_IfStatement;

import java.util.Scanner;

public class C04_IfStatement {

    public static void main(String[] args) {


     /*
         Print "Lutfen is unvaninizi girin
        jobTitle isimli bir degisken olusturun ve kullanicidan isteyin.
        Dogru jobTitle yazdirmak icin asagidaki test datalarini kullanin. Example :
        Eger jobTitle  qa ise print is unvaniniz Quality Analyst
         test data: qa ise print Quality Analyst
        dev ise print Developer
         ba ise print Business Analyst
         pm ise print Project Manager
       */

        Scanner input = new Scanner(System.in);
        System.out.println("LUTFEN IS UNVANINIZI GIRINIZ");
        String jobTitle = input.nextLine().toLowerCase();

        if (jobTitle.equals("qa")){
            System.out.println("is unvani quality Analyst");
        }else if(jobTitle.equals("dev")){
            System.out.println("is unvani developer");
        }else if (jobTitle.equals("pm")){
            System.out.println("is unvani project manager");

        }
    }
}
