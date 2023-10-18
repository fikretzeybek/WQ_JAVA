package F29_Exceptions_garbageCollector;

import java.util.Scanner;

public class F05_ThrowKeyword {

    public static void main(String[] args) {

        int sayi = 5;

        //sayi negatifse asagidaki ilk 3 satir calismasin

        try {
            if (sayi < 0) throw new RuntimeException("Sayi 0 dan kucuk");
            System.out.println(1);
            System.out.println(2);
            System.out.println(3);


        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
        System.out.println(4);
        System.out.println(5);

        //kullanicidan yasini isteyin
        //negatif girerse exception firlatin
        //ve hicbir islem yapmayin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Yasinizi girirniz");

        int yas = scanner.nextInt();

        try {
            if (yas<0){
                throw new IllegalArgumentException("Yas negatif olamaz");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

}
