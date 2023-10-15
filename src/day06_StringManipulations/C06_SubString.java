package day06_StringManipulations;

public class C06_SubString {
    public static void main(String[] args) {

        String str = "Java en guzel programlama dili";

        System.out.println(str.substring(5));

        System.out.println(str.substring(0));

        System.out.println(str.substring(1));

        //son 4 karakteri yazirin

        System.out.println(str.substring(str.length() - 4));

        // metinde sadece Java yi yazdirin

        System.out.println(str.substring(0, 4));

        // cumledeki 2. space' in index i 7 ise
        //2. space den sonraki 5 harfi yazdirin

        System.out.println(str.substring(8, 13));

        System.out.println(str.substring(0, 1));
        System.out.println(str.substring(3, 4));
        System.out.println(str.substring(6, 7));
        System.out.println(str.substring(5, 5));
        System.out.println(str.substring(5, 2));


    }
}
