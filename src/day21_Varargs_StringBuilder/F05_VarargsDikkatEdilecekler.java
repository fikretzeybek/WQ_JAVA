package day21_Varargs_StringBuilder;

public class F05_VarargsDikkatEdilecekler {

    // istenen kadar int parametre alip
    // ilk sayi disindaki tum sayilari toplayip
    // bulunan toplami ilk sayiile carpip yazdiran
    // bir method olusturun

    public static void main(String[] args) {

        islem1(1,2,3,4,5,6);
        islem1(2,3,0);
        islem1(0,3);
        islem1(1);

        // istenen kadar int parametre alip
        // son sayi disindaki tum sayilari toplayip
        // bulunan toplami son sayi ile carpip yazdiran
        // bir method olusturun

    }
    /*
    public  static  void islemYapSon(int... toplanacakSayilar , int sonSayi){


        Vararg parameter must be the last in the list..

        Varargs alacagi element sayisi konusunda sinir tanimadigindan
        tum elementleri almak ister

        bundan dolayi bir method'da parametre olarak varargs yazilacaksa
        EN SON parametre olarak yazilmalidir

        Bu sebeple bir method'da
        2 varargs parametre de KULLANILAMAZ
    }
    */

    public  static void islem1(int ilkSayi, int...geriyeKalanlar){

        int toplam = 0;

        for (int w : geriyeKalanlar
             ) {
            toplam += w;
        }

        System.out.println(ilkSayi * toplam);
    }
}
