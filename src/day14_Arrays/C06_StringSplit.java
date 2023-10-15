package day14_Arrays;

import java.util.Arrays;

public class C06_StringSplit {
    public static void main(String[] args) {

        String str = "Yaklaşık 145.000.000 sonuç bulundu (0,31 saniye) ";

        // arama sonuc sayisinin 1 milyondan cok oldugunu test edin

        String[] kelimeler = str.split(" ");

        System.out.println(Arrays.toString(kelimeler));//[Yaklaşık, 145.000.000, sonuç, bulundu, (0,31, saniye)]

        int sonucSayisi = Integer.parseInt(kelimeler[1].replaceAll("\\D",""));

        System.out.println(sonucSayisi);//145000000

        String[] ayirac = str.split("u");

        System.out.println(Arrays.toString(ayirac));//[Yaklaşık 145.000.000 son, ç b, l, nd,  (0,31 saniye) ]

        String[] ayiracHiclik = str.split("");
        System.out.println(Arrays.toString(ayiracHiclik));//[Y, a, k, l, a, ş, ı, k,  , 1, 4, 5, ., 0, 0, 0, ., 0, 0, 0,  , s, o, n, u, ç,  , b, u, l, u, n, d, u,  , (, 0, ,, 3, 1,  , s, a, n, i, y, e, ),  ]

        String[] ayiracVirgul= str.split(",");
        System.out.println(Arrays.toString(ayiracVirgul));//[Yaklaşık 145.000.000 sonuç bulundu (0, 31 saniye) ]


    }
}
