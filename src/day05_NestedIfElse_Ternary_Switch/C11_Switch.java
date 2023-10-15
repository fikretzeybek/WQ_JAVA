package day05_NestedIfElse_Ternary_Switch;

import java.util.Locale;
import java.util.Scanner;

public class C11_Switch {
    public static void main(String[] args) {
        // Soru 4- Kullanicidan ISTQB kisaltmasindaki harflerden,
        //         anlamini ogrenmek istedigi harfi alin
        //         ve girilen harfin karsiligini yazdirin.
        //  I : International  S : Software T : Testing Q : Qualifications B: Board

        Scanner scanner = new Scanner(System.in);
        System.out.println("Harfi girin");
        char harf = scanner.next().charAt(0);

        switch (harf) {
            case 'I':
            case 'i':
                System.out.println("International".toUpperCase());
                break;
            case 'S':
            case 's':
                System.out.println("Software".toUpperCase());
                break;
            case 'T':
            case 't':
                System.out.println("Testing".toUpperCase());
                break;
            case 'Q':
            case 'q':
                System.out.println("Qualification".toUpperCase());
                break;
            case 'B':
            case 'b':
                System.out.println("Board".toUpperCase());
                break;
            default:
                System.out.println("Yanlış harf");

        }


    }
}
