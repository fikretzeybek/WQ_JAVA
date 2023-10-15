package day06_StringManipulations;

public class C04_CharAt {
    public static void main(String[] args) {
        String str = "Java gun gectikce guzellesiyor.";

        // ilk harfi yazdirin
        System.out.println(str.charAt(0));// J

        System.out.println(str.charAt(4));// space

        // str de 31 karakter var
        // son karakter olan .' nin index'i 30 olur

        //son karakteri yazdirin
        System.out.println(str.charAt(31 - 1));

        //sodan 5. karakteri yazdirin
        System.out.println(str.charAt(31 - 5));

        // str de olmayan bir index'i istersek
        System.out.println(str.charAt(44));
    }
}
