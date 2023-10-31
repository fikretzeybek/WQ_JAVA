package F35_Maps;

import java.util.Scanner;

public class SuperMi3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen anne adını giriniz: ");
        String anneAdi = scanner.nextLine().toLowerCase();

        System.out.print("Lütfen baba adını giriniz: ");
        String babaAdi = scanner.nextLine().toLowerCase();

        System.out.print("Lütfen çocuk adını giriniz: ");
        String cocukAdi = scanner.nextLine().toLowerCase();

        boolean superAileMi = false;

        for (int i = 0; i < cocukAdi.length(); i++) {
            char harf = cocukAdi.charAt(i);
            if (babaAdi.indexOf(harf) != -1 && anneAdi.indexOf(harf) != -1) {
                superAileMi = true;
                break;
            }
        }

        if (superAileMi) {
            System.out.println("Aile super ailedir ");
        } else {
            System.out.println("Aile super aile degildir ");
        }
    }
}


