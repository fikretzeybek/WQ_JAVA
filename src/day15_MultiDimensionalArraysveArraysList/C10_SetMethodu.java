package day15_MultiDimensionalArraysveArraysList;

import java.util.ArrayList;
import java.util.List;

public class C10_SetMethodu {
    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();

        isimler.add("Deniz");
        isimler.add("Omer");
        isimler.add("Esra");
        isimler.add("Hamza");
        isimler.add("Basak");

        System.out.println(isimler);//[Deniz, Omer, Esra, Hamza, Basak]

        isimler.add(3,"Azim");

        System.out.println(isimler);// [Deniz, Omer, Esra, Azim, Hamza, Basak]

        // set() methodu bir elemani update icin kullanilir

        isimler.set(3,"Gulnur");

        System.out.println(isimler);//[Deniz, Omer, Esra, Gulnur, Hamza, Basak]

        // methodlarin yaptigi is ile bize dondurdugu sonuc FARKLI olabilir
        System.out.println(isimler.set(2, "Yusuf"));//[Deniz, Omer, Esra, Gulnur, Hamza, Basak]
                                                    //Esra--> Java diyor ki, 2 ye Yusuf' u update ettim
                                                    // Esra' yi sildim

        System.out.println(isimler);//[Deniz, Omer, Yusuf, Gulnur, Hamza, Basak]
    }
}
