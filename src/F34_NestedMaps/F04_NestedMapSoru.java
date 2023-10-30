package F34_NestedMaps;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class F04_NestedMapSoru {

    public static void main(String[] args) {

        //Soru : Verilen bir array’de kullanilan sayilari
        //       ve kacar defa kullanildigini yazdirin.
        //
        //Input : {1,2,3,4,5,3,4,2,5,1,3,2,4,1}
        //output : 1 kullanimi : 3 adet
        //	2 kullanimi : 3 adet
        //	3 kullanimi : 3 adet
        //	4 kullanimi : 3 adet
        //	5 kullanimi : 2 adet

        int[] input = {1,2,3,4,5,3,4,2,5,1,3,2,4,1,6};

        // bir map olusturalim
        // key array'deki sayilar olsun
        // value kullanim miktarlari olsun

        Map<Integer,Integer> kullanimMiktariMap = new TreeMap<>();
        //  {1,2,3,4,5,3,4,2,5,1,3,2,4,1,6};
        for (Integer each : input
        ) {
            // map'i kontrol edecegim
            // bizim oglanin getirdigi sayi map'de yoksa, kullanim adedi = 1 olarak ekleyelim
            if (!kullanimMiktariMap.containsKey(each)){

                kullanimMiktariMap.put(each,1);

            }else {

                // bizim oglanin getirdigi sayi map'de varsa, kullanim adedini 1 artiralim

                Integer eskiKullanimMiktari = kullanimMiktariMap.get(each);
                kullanimMiktariMap.put(each,eskiKullanimMiktari+1);
            }

        }

        System.out.println(kullanimMiktariMap); // {1=3, 2=3, 3=3, 4=3, 5=2, 6=1}

        Arrays.sort(input); // [1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5,6]

        int sayilanSayi = input[0];
        int sayac = 1;

        for (int i = 1; i < input.length; i++) {
            if (input[i] == sayilanSayi) {
                sayac++;
            } else {
                System.out.println(sayilanSayi + " : " + sayac + " adet");
                sayilanSayi = input[i];
                sayac = 1;
            }
        }

        System.out.println(sayilanSayi + " : " + sayac + " adet");
    }
}
