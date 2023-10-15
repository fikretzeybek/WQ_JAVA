package day02_scanner;

import java.util.Scanner;

public class C02_scan {
    public static void main(String[] args) {

//Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip, dikdortgenin alanini yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dikdortgenin iki kenar uzunlugunu giriniz");

        double kisaKenar = scanner.nextDouble();
        double uzunKenar = scanner.nextDouble();

        System.out.println("Dikdortgenin alani : " + kisaKenar*uzunKenar);

    }
}
