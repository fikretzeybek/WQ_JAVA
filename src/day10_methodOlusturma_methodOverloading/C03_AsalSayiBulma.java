package day10_methodOlusturma_methodOverloading;

import java.util.Scanner;

public class C03_AsalSayiBulma {
    public static void main(String[] args) {

        // Verilen pozitif bir tamsayinin
        // asal olup olmadigini kontol edip
        // asal ise true, asal degil ise false yazdiran bir method olusturun

        asalMiyazdir();

    }

    public static void asalMiyazdir() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen asal olup olmadigini ogrenmek istediginiz  sayiyi giriniz");
        int sayi = scanner.nextInt();

        boolean flag = true;

        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                flag = false;
                break;
            }
            System.out.println("asal degil");
        }
        System.out.println("asal");
    }


}
