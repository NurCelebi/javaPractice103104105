package pratikler01;

public class SoruOzel {

    public static void main(String[] args) {

        // 1 en az 10 karakter icermeli
        // 2 Space characteri icermemeli
        // 3 ilk harfi "O" ya da "Z" olmali
        // 4 son karakteri 9 olmali
        // 5 en az bir tane kucuk harf
        // 6 en az bir tane buyuk harf olmali


        String pwd = "Z7ert.psGHJ9";

        boolean first = pwd.length() > 9;

        boolean second = !pwd.contains(" ");

        boolean third = pwd.charAt(0)=='O' || pwd.charAt(0)=='Z'; //pwd.startsWith("O") || pwd.startsWith("Z"); //

        boolean fourth = pwd.charAt(pwd.length()-1)=='9';

        boolean fifth = pwd.replaceAll("[^a-z]","").length()>0;


        boolean six   = pwd.replaceAll("[^A-Z]","").length()>0;

        System.out.println(first && second && third && fourth && fifth && six);




        int number = 3;
        switch(number){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
            default:
                System.out.println("Done");
        }


    }
}
