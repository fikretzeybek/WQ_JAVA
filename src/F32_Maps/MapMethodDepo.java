package F32_Maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMethodDepo {
     /*
        Map kompleks bilgiler barindirabilir
        Ne kadar cok bilgi barindirirsa, bilgilere erismek o kadar islem gerektirebilir
        Ama temel olarak map key ve value'dan olusur

        value bir cok bilgi barindiran bir String ise
        bilgilere ulasmak icin split() ile String'i array'e ceviririz

        1- Eger sadece value'dan bilgiler istenirse
           - ogrenciMap.values() ile value'ler bir collection'a kaydedilir
           - sonra collection'daki String'ler for-each loop ile ele alinip
           - split() ile array'e cevrilir
           - ve ISTENEN SARTLARA uyan value'lardan ISTENEN BILGILER kullanilir

        2- Eger key ve value birlikte istenirse
            - ogrenciMap.keySet() ile key'ler bir Set'e kaydedilir
            - for each loop ile key'ler elden gecirilir
            - sadece key degil, ogrenciMap.get(each) ile value'ya ulasilir
            - value split() ile array'e cevrilir
            - Istenen sartlari saglayan kayitlarin, istenen bilgileri KULLANILIR

     */

    // verilen sube'deki ogrencilerin isim ve soyisimlerini yazdiran bir method olusturun

    public static void subeListesiyazdir(Map<Integer,String> ogrenciMap, String istenenSube){

        Collection<String> valueCollection = ogrenciMap.values();
        // [Ali-Can-11-H-MF, Veli-Cem-10-K-TM, Ali-Cem-11-K-TM, Ayse-Can-10-H-MF, Sevgi-Cem-11-M-TM, Sevgi-Can-10-K-MF]
        String[] valueArr;
        System.out.println("========"+istenenSube + " subesi ogrenci Listesi"+"======");

        for (String each: valueCollection
        ) { // each ==> Ali-Can-11-H-MF

            valueArr = each.split("-"); // [Ali, Can, 11, H, MF]

            if (valueArr[3].equalsIgnoreCase(istenenSube)){
                System.out.println(valueArr[0] + " "+ valueArr[1]);
            }


        }


    }

    public static Map<Integer, String> okulMapDondur() {

        Map<Integer,String> ogrenciMap = new HashMap<>();

        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");
        ogrenciMap.put(107,"Esra-Han-11-M-SOZ");
        ogrenciMap.put(108,"Azim-Kan-12-L-SOZ");
        ogrenciMap.put(109,"Huseyin-Fan-12-H-MF");
        ogrenciMap.put(110,"Azim-Kayisi-11-K-TM");

        return ogrenciMap;
    }

    public static void bolumListesiYazdir(Map<Integer, String> ogrenciMap, String istenenBolum) {
        // istenen bolumdeki ogrencilerin sinif, sube, isim, soyisim'lerini yazdiran
        Collection<String> valueCollection = ogrenciMap.values();

        String[] valueArr;

        System.out.println("======="+ istenenBolum + " bolumu ogrenci listesi=========");

        for (String each : valueCollection
        ) { // each ==> "Azim-Kayisi-11-K-TM"

            valueArr = each.split("-"); // [Ali, Can, 11, H, MF]

            if (valueArr[4].equalsIgnoreCase(istenenBolum)){

                System.out.println(valueArr[2] + " " + valueArr[3] + " " + valueArr[0] + " "+valueArr[1]);
            }

        }
    }

    public static void soyisimdenOgrenciBulma(Map<Integer, String> ogrenciMap, String istenenSoyisim) {

        // sinif, sube, isim, soyisim bilgilerini yazdiran bir method olusturun

        Collection<String> valueCollection = ogrenciMap.values();

        String[] valueArr;
        System.out.println("=======" + istenenSoyisim+" soyismindeki ogrenci listesi ======");

        for (String each : valueCollection
        ) { // each ==> "Azim-Kayisi-11-K-TM"

            valueArr = each.split("-");

            if (valueArr[1].equalsIgnoreCase(istenenSoyisim)){

                System.out.println(valueArr[2] + " " + valueArr[3] + " " + valueArr[0] + " "+valueArr[1]);

            }

        }

    }

    public static void numaraliSinifOgrenciListesiYazdir(Map<Integer, String> ogrenciMap, String sinifNo) {
        // numara, isim, soyisim ve subelerini yazdiran bir method olusturun
        Set<Integer> keySeti = ogrenciMap.keySet(); //[101, 102, 103, 104, 105, 106, 107, 108, 109, 110]
        String valueEach;
        String[] valueArr;

        System.out.println("======= Numarali "+ sinifNo + ". sinif listesi ========");

        for (Integer each : keySeti
        ) { // each ==> key'leri getirecek 101

            valueEach = ogrenciMap.get(each); // "Azim-Kayisi-11-K-TM"
            valueArr = valueEach.split("-");

            if (valueArr[2].equals(sinifNo)){

                System.out.println(each + " " + valueArr[0] + " " + valueArr[1] + " " + valueArr[3]);

            }

        }

    }

    public static void numaraAraligindakiOgrenciListesi(Map<Integer, String> ogrenciMap, int baslangicNo, int bitisNo) {

        // ogrencilerin numara, isim, soyisim'lerini yazdiran bir method olusturun

        Set<Integer> keySeti = ogrenciMap.keySet();
        // [101, 102, 103, 104, 105, 106, 107, 108, 109, 110]

        String valueEach;
        String[] valueArr;
        int sayac=0;

        for (Integer each : keySeti
        ) { // each ==> 101

            if (each >= baslangicNo && each<=bitisNo){

                valueEach = ogrenciMap.get(each);
                valueArr = valueEach.split("-");

                System.out.println(each + " " + valueArr[0] + " " + valueArr[1]);
                sayac++;
            }

        }

        if (sayac == 0){
            System.out.println("Verilen aralikta ogrenci bulunmamaktadir");
        }

    }
}