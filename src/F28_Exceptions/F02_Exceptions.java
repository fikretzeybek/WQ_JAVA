package F28_Exceptions;

import java.util.Scanner;

public class F02_Exceptions {
    public static void main(String[] args) {
        //kullanicidan iki tam sayi alin
        // ilk sayiyi ikinciye bolup yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen 2 tam sayi giriniz : ");

        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();

        if (sayi2 != 0) {
            System.out.println("Bolumleri : " + sayi1 / sayi2);
        } else {
            System.out.println("ikinci sayi 0 olamaz");
        }


    }
}
