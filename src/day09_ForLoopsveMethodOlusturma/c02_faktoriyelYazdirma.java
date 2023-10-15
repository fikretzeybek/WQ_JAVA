package day09_ForLoopsveMethodOlusturma;

import java.util.Scanner;

public class c02_faktoriyelYazdirma {
    public static void main(String[] args) {
        //Soru 6- Kullanicidan 20’den kucuk bir sayi alip,
        // bu sayinin faktoryel degerini hesaplayin.
        // Konsolda faktoryel hesabinin yapilisini da yazdirin.
        // Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayi giriniz");
        int sayi = scanner.nextInt();

        long faktoriyelSonucu = 1;

        System.out.print(sayi + "!= ");

        for (int i = sayi; i >= 1; i--) {

            faktoriyelSonucu *= i;

            if (i != 1) {
                System.out.print(i + "*");

            } else {
                System.out.print(i + " = ");
            }

        }

        System.out.println(faktoriyelSonucu);
    }
}
