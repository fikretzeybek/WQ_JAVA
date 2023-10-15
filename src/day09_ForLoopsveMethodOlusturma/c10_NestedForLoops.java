package day09_ForLoopsveMethodOlusturma;

import java.util.Scanner;

public class c10_NestedForLoops {
    public static void main(String[] args) {
           /* kullanicidan satir  sayisini alip
        asagidaki gibi bir sekil cizdirin
        *
        * *
        * * *
        * * * *
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Satir sayisini giriniz");
        int satir = scanner.nextInt();

        for (int i = 1; i <= satir ; i++) {// satir
            for (int j = 1; j <= i ; j++) {// sutun
                System.out.print( "* ");

            }
            System.out.println("");
        }
    }
}
