package day08_stringManipulations;

import java.util.Scanner;

public class C12_BaslangicBitisiVerilenleriToplama {
    public static void main(String[] args) {
        // Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        // sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        // Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen iki sayi giriniz");
        int sayiBas = scanner.nextInt();
        int sayiBit = scanner.nextInt();

        int toplam = 0;

        if (sayiBit < sayiBas) {
            System.out.println("Bitis degeri baslangic degerinden kucuk olamaz");

        } else {

            for (int i = sayiBas; i <= sayiBit; i++) {

                toplam += i;

            }

            System.out.println(toplam);
        }


    }
}
