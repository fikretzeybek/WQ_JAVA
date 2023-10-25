package F33_MapUpdate_EntryKullanimi;

import F32_Maps.MapMethodDepo;

import java.util.Map;

public class F03_SinifUpdate {

    public static void main(String[] args) {

        // Yil sonunda calistirilmak uzere
        // tum ogrencileri bir ust sinifa cikartan method olusturun
        // 12.siniftaki ogrencilerin sinif bilgisi olarak mezun yazin


        Map<Integer,String> ogrenciMap = MapMethodDepo.okulMapDondur();

       ogrenciMap = MapMethodDepo.yilSonuSinifArtir(ogrenciMap);

        System.out.println(ogrenciMap);

    }
}
