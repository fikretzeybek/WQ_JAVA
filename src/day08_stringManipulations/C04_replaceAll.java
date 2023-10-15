package day08_stringManipulations;

import java.util.Scanner;

public class C04_replaceAll {
    public static void main(String[] args) {

        //kullanıcıdan isim soyisim ve kart no alin
        // Isim soyisim : S***** G****
        // Kart No :: 1234 **** **** ****

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz");
        String isim = scanner.next();

        System.out.println("Lutfen soyisminizi giriniz");
        String soyIsim = scanner.next();

        System.out.println("Lutfen kart no giriniz");
        String kartNo = scanner.next();

        String yildizliIsim = isim.substring(0,1).toUpperCase() +
                              isim.substring(1).replaceAll("\\w","*");

        String yildizliSoyisim = soyIsim.substring(0,1).toUpperCase() +
                                 soyIsim.substring(1).replaceAll("\\w","*");

        String yildizliKart = kartNo.substring(0,4) + " **** **** ****";

        System.out.println("Isim soyisim : " + yildizliIsim + " " + yildizliSoyisim);
        System.out.println("Kart No : "  + yildizliKart);





    }
}
