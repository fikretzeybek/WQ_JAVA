package day04_IfStatements;

import java.util.Scanner;

public class C10_ElseVeSusluParantezlerinGorevi {
    public static void main(String[] args) {
        // musteriden satin aldigi urun adetini isteyin
        // adet 100 den fazla ise "% 20 indirim kazandiniz"
        // adet 50 den fazla ise "% 10 indirim kazandiniz"

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen aldiginiz urun adedini giriniz");
        int adet = scanner.nextInt();

        if (adet > 100) {
            System.out.println("% 20 indirim kazandiniz");
        } else if (adet > 50) {
            System.out.println("% 10 indirim kazandiniz");

        }
/*
    if else-if ...cumleleri else ile bitmek zorunda degil
    AMA else ile bitmez ise bazi sonuclarin kapsam dişi kaldigini bilmemiz gerekir

    EGER if veya else-if lerden sonra {} kullanılmazsa
    Java ilk ; e kadar olan kismi body olarak kabul eder

    geriye kalan kodlar i if, else-if statement ile ilgisiz kabul eder
    NOT : eger if veya else body'niz sadece 1 satir ise
          { } kullanmadan kod yazabilirsiniz
          ANCAK body'ye yazmaniz gereken satir sayisi 1'den fazla ise
          MUTLAKA { } kullanmalisiniz
*/


    }
}
