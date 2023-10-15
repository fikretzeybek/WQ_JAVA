package day02_scanner;

import java.util.Scanner;

public class C01_scan {
    public static void main(String[] args) {

        //Soru 1- Kullanicidan uc farkli data turunde deger alip, girilen degerleri aciklamalariyla yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz:");
        String girilenIsim = scanner.nextLine();


        System.out.println("Lutfen yasinizi giriniz : ");
        int yas = scanner.nextInt();


        System.out.println("Emekli misiniz  true or false");
        boolean emekliMi = scanner.nextBoolean();

        System.out.println("Girdiginiz isim :"+girilenIsim);
        System.out.println("Yasiniz :" + yas);
        System.out.println("Emekli misin :" + emekliMi);

    }



}
