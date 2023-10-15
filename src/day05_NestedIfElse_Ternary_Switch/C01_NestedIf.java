package day05_NestedIfElse_Ternary_Switch;

import java.util.Scanner;

public class C01_NestedIf {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Cinsiyetinizi giriniz E:Erkek, K:Kadin");
        char cinsiyet = scanner.next().toUpperCase().charAt(0);

        System.out.println("Yasinizi giriniz");
        double yas = scanner.nextDouble();

        if (yas < 20 || yas > 80 || !(cinsiyet =='E' || cinsiyet == 'K')) {
            System.out.println("Girilen bilgiler hatali!");

        }else if(cinsiyet == 'E' && yas >= 65){
            System.out.println("Erkek emekli olabilir");

        }else if (cinsiyet == 'E' && yas < 65) {
            System.out.println("Erkek emekli omak icin daha " + (65-yas) + "yil calismalidir");

        } else if (cinsiyet == 'K' && yas >= 60) {
            System.out.println("Kadin emekli olabilir");

        }else {
            System.out.println("Kadin emekli omak icin daha " + (65-yas) + "yil calismalidir");
        }

    }
}
