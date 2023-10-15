package day05_NestedIfElse_Ternary_Switch;

import java.util.Scanner;

public class C06_Ternary {
    public static void main(String[] args) {
        //Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise “Eskenar ucgen” yazdirin,
        // degilse “Eskenar degil” yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen üçgenin kenar uzunluklarını giriniz");
        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();

        System.out.println(kenar1 == kenar2 && kenar2 == kenar3 && kenar1 > 0
                ?
                "Eşkenar üçgen"
                :
                "Eşkenar üçgen değil"
                );


    }
}
