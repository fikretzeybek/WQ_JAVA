package day09_ForLoopsveMethodOlusturma;

import java.util.Scanner;

public class C09_NestedForLoops {
    public static void main(String[] args) {
        /* kullanicidan satir  sayisini alip
        asagidaki gibi bir sekil cizdirin
        1
        2 2
        3 3 3
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Satir sayisini giriniz");
        int satir = scanner.nextInt();

// ucgen sekiller icin de nested for loop kullanilir
// dikdortgenden farki sutun nosuna ihtiyacimiz yoktur
// her satirdaki sutun sayisi o satirin nosu ile aynidir

        for (int i = 1; i <= satir ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j + " ");

            }
            System.out.println("");
        }

    }
}
