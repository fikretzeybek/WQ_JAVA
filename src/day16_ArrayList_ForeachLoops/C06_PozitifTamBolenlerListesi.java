package day16_ArrayList_ForeachLoops;

import java.util.ArrayList;
import java.util.List;

public class C06_PozitifTamBolenlerListesi {
    public static void main(String[] args) {
        //Soru 6- Verilen pozitif bir tamsayiyi,
        // tam bolebilen tum pozitif tamsayilari bir liste olarak
        // bize donduren bir method olusturun.

        System.out.println(tamBolenlerListesi(20));

    }

    public static List<Integer> tamBolenlerListesi(int sayi){

        List<Integer> tamBolenlerListesi = new ArrayList<>();


        for (int i = 1 ; i < sayi ; i++) {

            if (sayi % i == 0){
                tamBolenlerListesi.add(i);
            }
        }

        return tamBolenlerListesi;
    }
}
