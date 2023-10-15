package day05_NestedIfElse_Ternary_Switch;

import java.util.Scanner;

public class C10_Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gün numarasını giriniz");
        int gunNo = scanner.nextInt();

        switch (gunNo) {

            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Hafta içi");
                break;
            case 6:
            case 7:
                System.out.println("Hafta sonu");
                break;

            default:
                System.out.println("Hatalı giriş");


        }

    }
}
