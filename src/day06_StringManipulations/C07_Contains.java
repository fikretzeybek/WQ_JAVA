package day06_StringManipulations;

public class C07_Contains {
    public static void main(String[] args) {

        String str = "Javaya cok calisirsan cabuk is bulursun";

        System.out.println(str.contains("a"));
        System.out.println(str.contains("Java"));
        System.out.println(str.contains("java"));
        System.out.println(str.contains("av"));
        System.out.println(str.contains(" "));
        System.out.println(str.contains(""));
        System.out.println(str.contains("cok calis"));


    }
}
