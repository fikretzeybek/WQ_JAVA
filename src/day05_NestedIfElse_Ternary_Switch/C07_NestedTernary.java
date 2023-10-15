package day05_NestedIfElse_Ternary_Switch;

import java.util.Scanner;

public class C07_NestedTernary {
    public static void main(String[] args) {

        // kullanıcıdan bir tam sayı alalım
        // sayı pozitif ise 100 den büyük veya küçük olduğunu yazdırın
        // sayı negatifse tek ve çift olduğunu yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir tam sayı giriniz");
        int sayı = scanner.nextInt();

        System.out.println(
                         sayı > 0
                        ?
                        //sayı 0 dan büyük yazdırılacak kısım
                        sayı > 100 ? "sayı büyük" : "sayı küçük"
                        :
                        //sayı 0 dan büyük yazdırılacak kısım
                        sayı % 2 == 0 ? "sayı çift" : "sayı tek"


        );
    }
}
