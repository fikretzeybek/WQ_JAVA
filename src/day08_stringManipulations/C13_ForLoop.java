package day08_stringManipulations;

import java.util.Scanner;

public class C13_ForLoop {
    public static void main(String[] args) {
        //Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        // sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        // Bitis degeri baslangic degerinden kucuk olsa da program calissin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen iki sayi giriniz");
        int sayiBas = scanner.nextInt();
        int sayiBit = scanner.nextInt();

        int toplam = 0;

        if (sayiBit > sayiBas) {

            for (int i = sayiBas; i <= sayiBit; i++) {
                toplam += i;

            }

        } else {
            for (int i = sayiBit; i <= sayiBas; i++) {
                toplam += i;

            }


        }
        System.out.println("Verilen araliklardaki sayilarin toplami : " + toplam);

        String a = "Ali Can";
        System.out.println(a.startsWith("a", 5));

    }
}
