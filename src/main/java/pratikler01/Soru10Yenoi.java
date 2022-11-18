package pratikler01;

public class Soru10Yenoi {

    public static void main(String[] args) {
        String b = "Ali 12 ?_";
        System.out.println(b.replaceAll("\\w", "*"));
    }
}
