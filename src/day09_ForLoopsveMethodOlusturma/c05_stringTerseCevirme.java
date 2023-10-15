package day09_ForLoopsveMethodOlusturma;

import java.util.Scanner;

public class c05_stringTerseCevirme {
    public static void main(String[] args) {
        //Soru 10 (interview)- Kullanicidan bir String isteyin ve
        // String’i tersine cevirip kaydedin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin yazin");

        String girilenMetin = scanner.nextLine();
        // Ali topu at
        // ta upot ilA

        // tersMetin = ""; +t+a+ +u+p+.....+A

        String tersMetin = "";

        for (int i = girilenMetin.length()-1; i >= 0 ; i--) {

            tersMetin += girilenMetin.charAt(i);

        }
        System.out.println("Girilen metinin ters hali : " + tersMetin);

        // tersi ile duzden yazilisi ayni olan metinlere PALINDROME denir
        // girilen metinin palindrome olup olmadiginin yazdiralim

        if (girilenMetin.equalsIgnoreCase(tersMetin)){
            System.out.println("Girilen metin palindrome");

        }else {
            System.out.println("Girilen metin palindrome degil");
        }
    }
}
