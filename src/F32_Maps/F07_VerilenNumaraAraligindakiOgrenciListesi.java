package F32_Maps;

import java.util.Map;

public class F07_VerilenNumaraAraligindakiOgrenciListesi {
    public static void main(String[] args) {

        // ogrenci map'inde verilen baslangic ve bitis numaralari (dahil) arasindaki
        // ogrencilerin numara, isim, soyisim'lerini yazdiran bir method olusturun


        Map<Integer,String> ogrenciMap = MapMethodDepo.okulMapDondur();

        MapMethodDepo.numaraAraligindakiOgrenciListesi(ogrenciMap,110,100);
    }

}