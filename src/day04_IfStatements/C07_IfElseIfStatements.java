package day04_IfStatements;

import java.util.Scanner;

public class C07_IfElseIfStatements {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Pozitif bir tam sayi giriniz");
        int girilensayi = scanner.nextInt();

        if(girilensayi % 3 == 0 && girilensayi % 5 == 0) {
            System.out.println("super sayi");

        } else if (girilensayi % 5 == 0) {
            System.out.println("5 e bolunur");

        } else if (girilensayi % 3 == 0){
            System.out.println("3 e bolunur");

        }else {
            System.out.println("cop");
        }

    }
}
