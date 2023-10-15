package day09_ForLoopsveMethodOlusturma;

import java.util.Scanner;

public class c04_rakamlarToplami {
    public static void main(String[] args) {
        //Soru 7- Kullanicidan pozitif bir tamsayi alip,
        //         rakamlar toplamini yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen pozitif bir tam sayi giriniz");
        int girilenSayi = scanner.nextInt();

        int rakamlarToplami = 0;
        int rakam = 0;

        for (int i = girilenSayi; i > 0 ; i/= 10) {

            rakam = i % 10;
            rakamlarToplami += rakam;
        }

        System.out.println(girilenSayi + " sayisinin rakamlar toplami :" + rakamlarToplami);

        // aynı soruyu basamak sayisi kadar tekrar ederek cozelim
        rakamlarToplami = 0;
        rakam = 0;
        int basamakSayisi = (girilenSayi+"").length();
        int sayi = girilenSayi;

        for (int i = 1; i <= basamakSayisi; i++) {// basamak sayisina gore loop olusturalim

            rakam = sayi % 10;
            rakamlarToplami += rakam;
            sayi /= 10;


        }

        System.out.println(girilenSayi + " sayisinin rakamlar toplami :" + rakamlarToplami);



    }
}
