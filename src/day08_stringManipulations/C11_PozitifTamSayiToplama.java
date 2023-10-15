package day08_stringManipulations;

import java.util.Scanner;

public class C11_PozitifTamSayiToplama {
    public static void main(String[] args) {
        // kullanicidan pozitif bir tam sayi degeri isteyin
        // o sayiya kadar olan tum poz tam sayi toplamini yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen poz bir tam sayi giriniz");
        int sayi = scanner.nextInt();

        int toplam = 0;

        for (int i = 1; i <= sayi; i++) {

            toplam += i;

        }
        System.out.println(sayi + "' ye kadar olan pozitif sayilerin toplami : " + toplam );
    }
}
