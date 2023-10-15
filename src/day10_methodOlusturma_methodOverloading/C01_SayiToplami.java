package day10_methodOlusturma_methodOverloading;

import java.util.Scanner;

public class C01_SayiToplami {
    public static void main(String[] args) {

        // Verilen iki sayiyi toplayip,sonucu yazdiran bir method olusturun


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen toplanmak uzere iki sayi giriniz");
        double sayi1 = scanner.nextDouble();
        double sayi2 = scanner.nextDouble();

        toplaYazdir(sayi1, sayi2);
    }// main method sonu

    public static void toplaYazdir(double sayi1, double sayi2) {
        System.out.println("Verilen iki sayinin toplami : " + (sayi1 + sayi2));
    }

}// class sonu
