package F35_Maps;
import java.util.Scanner;

public class SuperMi2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen anne adını giriniz : ");
        String anneAdi = scanner.nextLine().toLowerCase();

        System.out.print("Lütfen baba adını giriniz : ");
        String babaAdi = scanner.nextLine().toLowerCase();

        System.out.print("Lütfen çocuk adını giriniz : ");
        String cocukAdi = scanner.nextLine().toLowerCase();

        boolean sonuc = superAileMi(anneAdi, babaAdi, cocukAdi);
        sonucYazdir(sonuc);
    }

    public static boolean superAileMi(String anneAdi, String babaAdi, String cocukAdi) {
        for (char hrf : anneAdi.toCharArray()) {
            if (Character.isLetter(hrf) && babaAdi.contains(String.valueOf(hrf)) &&
                cocukAdi.contains(String.valueOf(hrf))) {
                return true;
            }
        }

        return false;
    }
    public static void sonucYazdir(boolean superAile) {
        if (superAile) {
            System.out.println("Aile super ailedir ");
        } else {
            System.out.println("Aile super aile degildir ");
        }
    }
}