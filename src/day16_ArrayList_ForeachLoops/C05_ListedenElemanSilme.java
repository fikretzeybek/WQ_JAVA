package day16_ArrayList_ForeachLoops;

import java.util.ArrayList;
import java.util.List;

public class C05_ListedenElemanSilme {
    public static void main(String[] args) {
        //Soru 3- Verilen String bir listede istenmeyen harf iceren elementleri silip,
        //kalan kismini list olarak bize donduren bir method olusturun

        List<String> isimler = new ArrayList<>();

        isimler.add("Deniz");
        isimler.add("Omer");
        isimler.add("Esra");
        isimler.add("Hamza");
        isimler.add("Basak");
        isimler.add("Ayca");

        String silinecekHarf = "a";

        System.out.println(istenmeyenleriSil(isimler, silinecekHarf));
        System.out.println(istenmeyenleriSilKalanlariKaydet(isimler, silinecekHarf));
        System.out.println(istenmeyenleriSilKalanlariKaydet2(isimler,silinecekHarf));

    }

    public static List<String> istenmeyenleriSil(List<String> isimler, String silinecekHarf) {

        for (int i = 0; i < isimler.size(); i++) {

            if (isimler.get(i).toUpperCase().contains(silinecekHarf.toUpperCase())) {

                isimler.remove(isimler.get(i));
                i--; // silinen indeks olursa onun yerine gelecek indeksi kontrol etmesi için
                //1 eksiltme yaptık
            }

        }
        return isimler;

        // yada yeni bir list oluşturup silinmeyecek elemanlar yeni listeye eklenir.
    }

    public static List<String> istenmeyenleriSilKalanlariKaydet(List<String> isimler, String silinecekHarf) {

        List<String> silinmeyeceklerListesi = new ArrayList<>();

        for (String each : isimler) {
            if (!each.toUpperCase().contains(silinecekHarf.toUpperCase())) {
                silinmeyeceklerListesi.add(each);
            }

        }
        return silinmeyeceklerListesi;
    }

    public static List<String> istenmeyenleriSilKalanlariKaydet2 (List<String> isimler, String silinecekHarf) {

        List<String> silinmeyeceklerListesi2 = null;
        for (String w : isimler) {

            silinmeyeceklerListesi2 = new ArrayList<>();

            if (!w.toUpperCase().contains(silinecekHarf.toUpperCase())) {
                silinmeyeceklerListesi2.add(w);
            }


        }
        return silinmeyeceklerListesi2;
    }

}