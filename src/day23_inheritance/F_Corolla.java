package day23_inheritance;

public class F_Corolla extends E_Toyota {

    String model = "Corolla";
    String uretimYeri = "Turkiye";
    String lastik = "Pirelli Sakarya";
    String aku = "Inci";

    String tekerCapi = "19 inch";
    String guvenlik = "Safe drive";
    String bagajHacmi = "200 litre";

    public static void main(String[] args) {

        F_Corolla corolla1 = new F_Corolla();

        System.out.println(corolla1.marka);//Toyota
        System.out.println(corolla1.model);//Corolla
        System.out.println(corolla1.renk);//Renk atanmamis
        System.out.println(corolla1.yakit);//Yakit atanmamis
        System.out.println(corolla1.uretimYeri);//Turkiye
        System.out.println(corolla1.sanziman);//Otomatik veya manuel
        System.out.println(corolla1.lastik);//Pirelli Sakarya
        System.out.println(corolla1.guvenlik);//Safe drive
        System.out.println(corolla1.aku);//Inci
        System.out.println(corolla1.bagajHacmi);//200 litre
        System.out.println(corolla1.tekerCapi);//19 inch
    }
}
