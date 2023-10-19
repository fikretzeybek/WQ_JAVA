package F30_Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class F01_iterator {

    public static void main(String[] args) {

        int[] arr = {3,5,6,2,9,7,4,0,1,3,4,2,5,6,7,2};

        List<Integer> sayilar = new ArrayList<>();
        for (Integer each:arr
             ) {
            sayilar.add(each);
        }
        System.out.println(sayilar);//[3, 5, 6, 2, 9, 7, 4, 0, 1, 3, 4, 2, 5, 6, 7, 2]

        //index kullanmadan sadece

        for (Integer each:sayilar
             ) {

            if (each % 2 == 0){
                System.out.print(each + " ");
            }
            System.out.println("");

        }
        Iterator iterator = sayilar.iterator();

    }
}
