package day10_methodOlusturma_methodOverloading;

import java.util.Scanner;

public class S01_soru {
    public static void main(String[] args) {
       /* Kullanicidan input olarak verilen bir String,
            -baslangic ve bitis indexlerine gore
        baslangic index'i dahil, bitis index'i haric olacak sekilde aradaki harfleri yazdiran bir method olusturun.
            - kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse, hata mesaji verin
            - kullanici str'da olan index'lerden daha buyuk bir index girerse hata mesaji yazdirin
             */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir metin girin: ");
        String str = scanner.nextLine();

        System.out.print("Başlangıç indeksi girin: ");
        int ilkIndex = scanner.nextInt();

        System.out.print("Bitiş indeksi girin: ");
        int sonIndex = scanner.nextInt();



    }

        public static String stringKesme(int ilkIndex, int sonIndex) {
            if (ilkIndex >= sonIndex) {
                return "Başlangıç indeksi, bitiş indeksinden büyük veya eşit olamaz.";
            }

            String str = null;
            if (sonIndex < 0 || ilkIndex > str.length()) {
                return "Başlangıç veya bitiş indeksi, dize sınırlarının dışında olamaz.";
            }

            // Başlangıç indeksini dahil, bitiş indeksini hariç alarak alt dizeyi oluşturun
            String result = "";
            for (int i = ilkIndex; i < sonIndex; i++) {
                result += str.charAt(i);
            }
            return result;

        }

}
