package day03_wrapperClasses;

public class C06_Concatanation {
    public static void main(String[] args) {

        String s1 = "Java";
        String s2 = "Kolaydır";
        String s3 = " ";
        String s4 = "";

        int a = 4;
        int b = 3;

        //Java Kolaydır 12
        System.out.println(s1+s3+s2+s3+a*b);

        //Java7Kolaydır
        System.out.println(s1+(a+b)+s2);

        //43Java
        System.out.println(s4+a+b+s1);

        //Java 34 Kolaydır
        System.out.println(s1 + s3 + s4 + b + a + s3 + s2);




    }
}
