package pratikler01;

import java.util.Scanner;

public class Nested01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("sayi gir");
        byte dayNum = input.nextByte();

        switch(dayNum) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");

            case 3:
                System.out.println("Tuesday");

            case 4:
                System.out.println("Wednesday");

            case 5:
                System.out.println("Thursday");

            case 6:
                System.out.println("Friday");

            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Enter a valid day number");
        }
    }
}
