package day21_Varargs_StringBuilder;

public class F02_Varargs {
    public static void main(String[] args) {

        topla(3, 5);
        topla(2);
        ;
        topla(1, 2, 3, 4, 5, 6);
        topla(12, 34, 56, 78, 23, 43, 23);


    }

    public static void topla(int... sayi) {
        int toplam = 0;
        for (int w : sayi
        ) {
            toplam += w;
        }
        System.out.println(toplam);

    }

    public static void topla(int sayi1, int sayi2) {

        System.out.println("Toplam : " + sayi1 + sayi2);
    }
}
