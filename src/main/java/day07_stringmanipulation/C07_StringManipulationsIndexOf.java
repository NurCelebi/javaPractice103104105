package day07_stringmanipulation;

public class C07_StringManipulationsIndexOf {

 /*
           String str = "Kara kara dusunme Ankara";
        //indexOf() method'u verilen character veya caharacter'lerin "ilk gorunumunun" index'ini verir.
        int idxA1 = str.indexOf("kara");
        System.out.println(idxA1);//5


        //lastIndexOf() method'u verilen character veya caharacter'lerin "son gorunumunun" index'ini verir.
        int idxA2 = str.lastIndexOf("kara");//20 bastan Ankara'nin kara'si
        System.out.println(idxA2);
         */

    //Ex: Verilen bir String'deki bir character'in tekrarli veya tekrarsiz olup olmadigini gosteren kodu yaziniz

    public static void main(String[] args) {

        String cumle = "Javacancandir";//rakam koyarak da yapabilir,sembol de olur
        char ch= 'a';
        System.out.println(cumle.indexOf(ch)==cumle.lastIndexOf(ch));

        if (cumle.indexOf(ch)==cumle.lastIndexOf(ch)){
            System.out.println("TEKRARSIZ");
        }else
            System.out.println("TEKRARLI");
    }
}
