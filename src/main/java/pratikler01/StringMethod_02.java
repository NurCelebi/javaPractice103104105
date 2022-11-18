package pratikler01;

public class StringMethod_02 {

    public static void main(String[] args) {

        String str ="sarıkanarya";

//        //1)
//        System.out.println(str.charAt(4));
//
//        //2)
//        System.out.println(str.charAt(0));

        //3)
        System.out.println(str.length());
//
//        //4)
//        System.out.println(str.charAt(str.length()-1));


        int variable = 1;
        switch (variable){
            case 1 :
                System.out.print("P");
            case 2 :
            case 3 :
                System.out.print("Q");
                break;
            case 4 :
                System.out.print("R");
            default :
                System.out.print("S");
        }


    }
}
