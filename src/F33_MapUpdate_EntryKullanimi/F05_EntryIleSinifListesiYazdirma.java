package F33_MapUpdate_EntryKullanimi;

import F32_Maps.MapMethodDepo;

import java.util.Map;

public class F05_EntryIleSinifListesiYazdirma {

    public static void main(String[] args) {
        // verilen sinif ve sube bilgisi ile
        // sinif listesini numara,isim,soyisim olarak yazdiran bir method olusturun

        Map<Integer,String> ogrenciMapi = MapMethodDepo.okulMapDondur();

        String sinif = "11";
        String sube = "m";

        MapMethodDepo.sinifListesiYazdirma(ogrenciMapi,sinif,sube);
    }
}