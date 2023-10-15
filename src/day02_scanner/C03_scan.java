package day02_scanner;

import java.util.Scanner;

public class C03_scan {
    public static void main(String[] args) {
        //Kullanicidan ismini, soyismini ve yasini alip asagidaki formatta yazdirin.
        //girilen bilgiler : J Doe, 44

        Scanner scanner = new Scanner(System.in);

        System.out.println("İsminizi giriniz ");
        char ilkHarf = scanner.next().charAt(0);

        System.out.println("Soyisminizi giriniz ");
        String soyIsim = scanner.next();

        System.out.println("Yasinizi giriniz :");
        int yas = scanner.nextInt();

        System.out.println("Girilen isim: " + ilkHarf +" " + soyIsim+"," + yas);


    }
}
