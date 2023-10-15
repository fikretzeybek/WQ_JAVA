package day10_methodOlusturma_methodOverloading;

public class C05_AsalSayiMiDondur {
    public static void main(String[] args) {

        // verilen bir pozitif tam sayinin
        // asal sayi olup olmadigini kontrol edip
        // asal ise true, degilse false donduren
        // bir method olusturun

        asalMiDondur(45);

        System.out.println(asalMiDondur(43));//true

    }

    public  static boolean asalMiDondur(int sayi) {

        boolean flag = true;

        for (int i = 2; i < sayi; i++) {

            if (sayi % i == 0) {
                flag = false;
                break;
            }
        }
        return flag ;

    }
}
