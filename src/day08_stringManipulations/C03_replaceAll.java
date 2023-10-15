package day08_stringManipulations;

public class C03_replaceAll {
    public static void main(String[] args) {
        String str = "Arama sonucunda 1434 kelimeye ulasildi";

        //arama sonuclarinin 100 den fala oldugunu test edin
        // 100 den fazla ise "Test Passed"
        // 100 den fazla değilse "Test Failed"  yazdirin

        str = str.replaceAll("\\D", "");

        int sonucSayisi = Integer.parseInt(str);

        if (sonucSayisi > 100) {
            System.out.println("Test Passed");

        } else {
            System.out.println("Test Failed");
        }


    }
}
