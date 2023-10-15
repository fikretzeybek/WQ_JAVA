package day04_IfStatements;

import java.util.Scanner;

public class C06_IfStatements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //System.out.println("Bir karakter giriniz");
        //char krk = scanner.next().charAt(0);
//
        //if(krk>='a' && krk<= 'z'){
        //    System.out.println( Character.toUpperCase(krk));
//
        //}else {
        //    System.out.println(krk);
        //}

        /*Kullanicidan bir sayi alin sayi tek ise negatif veya pozitif tek sayi
oldugunu yazdirin, sayi cift sayi ise 10’un tam kati olup olmadigini
yazdirin.*/

        System.out.println("Bir sayi giriniz");
        int sayi = scanner.nextInt();

        if (sayi % 2 != 0) {
            if (sayi < 0) {
                System.out.println("Sayi negatif tek sayidir");
            } else {
                System.out.println("Sayi pozitif tek sayidir");
            }

        } else if (sayi % 2 == 0){
            if (sayi % 10 == 0) {
                System.out.println("Sayi 10 un katidir");

        } else {
            System.out.println("Sayi 10 un kati degildir");
        }

        }

    }
}
