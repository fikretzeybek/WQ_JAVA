package day07_StringManipulations;

public class C02_IndexOf {
    public static void main(String[] args) {

        String str = "Java candir, Selenium heyecan";

        //str Selenium iceriyor mu
        System.out.println(str.contains("Selenium"));

        // str Selenium ile mi bitiyor
        System.out.println(str.endsWith("Selenium"));

        // str Selenium ile mi basliyor
        System.out.println(str.startsWith("Selenium"));

        // peki bu Selenium nerede
        System.out.println(str.indexOf("Selenium"));

        //olmayan bir metin aratilirsa
        System.out.println(str.indexOf("x"));

        //contains methodu kullanmadan str nin java icerip icermedigini yazdirin
        System.out.println();

        if (str.indexOf("java") == -1) {
            System.out.println("false");

        } else {
            System.out.println("true");
        }

        // str daki ilk a harfinin indexini yazdirin
        System.out.println(str.indexOf("a"));

        //str daki ikinci a harfinin indexini yazdirin
        System.out.println(str.indexOf("a", 2));

        //str daki ucuncu a harfinin indexini yazdirin
        System.out.println(str.indexOf("a", 4));

        //str da 4. a varsa index ini yazdirin
        // yoksa str sadece 3 tane a icerir

        if (str.indexOf("a", 7) == -1) {
            System.out.println("str sadece 3 tane a iceriyor");
        } else System.out.println("4. a nin indexi : " + str.indexOf("a", 7));

        //str da 5. a varsa index ini yazdirin
        // yoksa str sadece 4 tane a icerir

        if (str.indexOf("a", 28) == -1) {
            System.out.println("str sadece 4 tane a iceriyor");

        } else {
            System.out.println("5. a nin indexi : " + str.indexOf("a", 28));
        }


    }
}
