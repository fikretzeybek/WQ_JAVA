package day06_StringManipulations;

public class C05_length {
    public static void main(String[] args) {

        String str = "Java ogren issiz kalma..";

        System.out.println(str.length());

        //sondan 2. karakteri yazdiriniz

        System.out.println(str.charAt(str.length() - 7));

        //metnin son karakterini yazdirin

        System.out.println(str.charAt(str.length() - 1));

        str = "Java guzeldir";

        System.out.println(str.charAt(str.length() - 1));
    }
}
