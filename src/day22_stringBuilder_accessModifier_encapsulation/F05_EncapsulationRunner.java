package day22_stringBuilder_accessModifier_encapsulation;

public class F05_EncapsulationRunner {

    public static void main(String[] args) {

        F04_Encapsulation obj = new F04_Encapsulation();

        System.out.println(obj.getGorulebilsin());
        // Bu variable gorulebilir ama degistirilemez

        obj.setDegerAtanabilsin("Ali");

        obj.setDegerAtanabilsin("Veli");

        // bizim argument olarak yazdigimiz degerleri atama yapiyor
        // ancak bizim gormemize izin vermiyor

        obj.gorulebilirVeDegerAtanabilir = "Deneme";
        System.out.println(obj.gorulebilirVeDegerAtanabilir); // Deneme

        // obj.sayi = 20;
        // System.out.println(obj.sayi);

        obj.setSayi(20);
        System.out.println(obj.getSayi()); // 20


    }
}