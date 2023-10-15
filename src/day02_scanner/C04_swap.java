package day02_scanner;

import java.util.Scanner;

public class C04_swap {
    public static void main(String[] args) {

        //Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ilk tam sayi giriniz :");
        int sayi1 = scanner.nextInt();

        System.out.println("Ikinci tam sayi giriniz :");
        int sayi2 = scanner.nextInt();

        System.out.println("Girdiginiz degerler :" + "sayi1 =" + sayi1+ " "+"sayi2 ="+ sayi2);

        int bosKova = 0;

        bosKova =sayi2;

        sayi2 = sayi1;

        sayi1 = bosKova;

        System.out.println("Degistirilen degerler :" + "sayi1 =" + sayi1+ " "+"sayi2 ="+ sayi2);






    }
}
