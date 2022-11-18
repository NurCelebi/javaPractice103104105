package pratikler01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FarkliOgeSoru {

    public static void main(String[] args) {
        //Bir listede kaç farklı öğe olduğunu gösteren kodu yazınız.
//Örnek: {10, 31, 15, 7, 15, 7, 7} ==> 4


            List<Integer> list = Arrays.asList(10, 31, 15, 7, 15, 7, 7);
            List<Integer> list2 = new ArrayList<>();

            for(int i=0; i<list.size(); i++) {
                for(int k=0; k<list.size(); k++) {
                    if(!list2.contains(list.get(k)))
                        list2.add(list.get(k));
                    continue;
                }
            }
            System.out.println(list2);
            System.out.println("listede "+list2.size()+" farklı sayı var");

        }
}
