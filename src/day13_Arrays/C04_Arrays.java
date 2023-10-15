package day13_Arrays;

public class C04_Arrays {
    public static void main(String[] args) {

        // Verilen String bir array da
        // istenen harfi iceren elementleri yazdirin

        String[] isimler = {"Huseyin", "Mehmet", "Esra", "Ercan", "Omer"};
        String istenenHarf = "a";


        for (int i = 0; i < isimler.length; i++) {

            if (isimler[i].contains("a")) {

                System.out.println(isimler[i] + " ");

            }

        }

    }
}
