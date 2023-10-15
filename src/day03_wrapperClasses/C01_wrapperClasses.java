package day03_wrapperClasses;

public class C01_wrapperClasses {

    public static void main(String[] args) {

        int sayi = 20;
        String str = "Java";

        Integer sayi2 = 30;

        sayi2 = sayi;

        // primitive data turleri ile o turun wrapper class ı arasinda gecis mumkundur

        System.out.println(Integer.MIN_VALUE) ;

        String str1 = "34";
        String str2 = "45";

        System.out.println(str1 + str2);

        System.out.println((Integer.parseInt(str1) + Integer.parseInt(str2)));

        char chr1 = 'd';
        System.out.println((Character.isDigit(chr1)));

        System.out.println( (Character.isLetter(chr1)));

        int sy = 20;

        String mt = ""+23;
        System.out.println(mt);




    }
}
