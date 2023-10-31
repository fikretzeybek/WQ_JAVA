package F35_Maps;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetSuperMi {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen anne adını giriniz: ");
        String anneAdi = scanner.nextLine().toLowerCase();

        System.out.print("Lütfen baba adını giriniz: ");
        String babaAdi = scanner.nextLine().toLowerCase();

        System.out.print("Lütfen çocuk adını giriniz: ");
        String cocukAdi = scanner.nextLine().toLowerCase();

        Set<Character> anneHarfler = new HashSet<>();
        Set<Character> babaHarfler = new HashSet<>();
        Set<Character> cocukHarfler = new HashSet<>();

        for (char harf : anneAdi.toCharArray()) {
            if (Character.isLetter(harf)) {
                anneHarfler.add(harf);
            }
        }

        for (char harf : babaAdi.toCharArray()) {
            if (Character.isLetter(harf)) {
                babaHarfler.add(harf);
            }
        }

        for (char harf : cocukAdi.toCharArray()) {
            if (Character.isLetter(harf)) {
                cocukHarfler.add(harf);
            }
        }

        boolean superAileMi = false;

        for (char harf : cocukHarfler) {
            if (babaHarfler.contains(harf) && anneHarfler.contains(harf)) {
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
