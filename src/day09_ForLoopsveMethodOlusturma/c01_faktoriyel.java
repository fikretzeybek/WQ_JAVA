package day09_ForLoopsveMethodOlusturma;

import java.util.Scanner;

public class c01_faktoriyel {
    public static void main(String[] args) {
        //Soru 5- Kullanicidan 20’den kucuk bir sayi alip,
        // bu sayinin faktoryel degerini hesaplayin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen 20 den kucuk pozitif bir tam sayi giriniz");
        int sayi = scanner.nextInt();
        int faktoriyelSonuc = 1;

        for (int i = sayi; i >= 1; i--) {

            faktoriyelSonuc *= i;


        }
        System.out.println("Verilen sayinin faktoriyel degeri : " + faktoriyelSonuc);
    }
}
