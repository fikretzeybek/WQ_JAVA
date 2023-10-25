package F33_MapUpdate_EntryKullanimi;

import F32_Maps.MapMethodDepo;

import java.util.Map;

public class F07_EntryIleSoyisimUpdate {

    public static void main(String[] args) {

        // okulMap'deki tum soyisimleri buyuk harf yapan bir method olusturun

        Map<Integer,String> ogrenciMap = MapMethodDepo.okulMapDondur();

        ogrenciMap = MapMethodDepo.soyisimleriBuyukHarfYap(ogrenciMap);

        System.out.println(ogrenciMap);
    }
}