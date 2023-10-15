package day04_IfStatements;

public class C01_BasitBagimsizIfCumleleri {

    public static void main(String[] args) {


        int a = 61;
        int b = 40;

        if (a > b) {
            System.out.println("a b den buyuk");

        }

        if (a % 2 == 0) {
            System.out.println("a cift sayi");
        }
        if (b % 5 == 0) {
            System.out.println("b 5 ile tam bolunur");

        }
        if (a > 99 && a < 1000) {
            System.out.println("a sayisi 3 basamakli");
        }

        boolean sart = a + b > 100;
        System.out.println(sart);

        if (sart) {
            System.out.println("a ile b nin toplami 100 den buyuktur");

        }

        if (true) {
            System.out.println("her zaman calisirim");
        }

    }


}
