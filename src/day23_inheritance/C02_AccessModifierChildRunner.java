package day23_inheritance;

import day22_stringBuilder_accessModifier_encapsulation.F02_AccessModifier;

public class C02_AccessModifierChildRunner extends F02_AccessModifier {
    public static void main(String[] args) {

        F02_AccessModifier.marka = "Opel";
        F02_AccessModifier.yil = 2023;

        F02_AccessModifier.renk = "Kirmizi";
        F02_AccessModifier.maxHiz = 230;

        // F02_AccessModifier.model = "Astra";
        // F02_AccessModifier.fiyat = 2000;

        // F02_AccessModifier.seriNo = "123";
        // F02_AccessModifier.km = 120000;


        System.out.println(F02_AccessModifier.marka);
        System.out.println(F02_AccessModifier.yil);

        System.out.println(F02_AccessModifier.renk);
        System.out.println(F02_AccessModifier.maxHiz);

        // System.out.println(F02_AccessModifier.model);
        // System.out.println(F02_AccessModifier.fiyat);

        // System.out.println(F02_AccessModifier.seriNo);
        // System.out.println(F02_AccessModifier.km);
    }
}