package F33_MapUpdate_EntryKullanimi;

import F32_Maps.MapMethodDepo;

import java.util.Map;

public class F06_EntryIleIsimUpdate {

    public static void main(String[] args) {

        // Tum listeyi gozden gecirerek
        // isimleri ilk harfi buyuk, sonraki harfler kucuk olacak sekilde
        // update eden bir method olusturun

        Map<Integer, String> ogrenciMapi = MapMethodDepo.okulMapDondur();

        ogrenciMapi = MapMethodDepo.isimDuzenle(ogrenciMapi);

        System.out.println(ogrenciMapi);
    }
}