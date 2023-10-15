package day08_stringManipulations;

public class C02_replaceAll {
    public static void main(String[] args) {

        String str = "J1a5v8a +/can87dir";

        str = str.replaceAll("\\d","");

        str = str.replaceAll("\\s","5");

        str = str.replaceAll("\\W","");

        str = str.replaceAll("\\d"," ");



        System.out.println(str);
    }
}
