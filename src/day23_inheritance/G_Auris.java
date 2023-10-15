package day23_inheritance;

public class G_Auris extends E_Toyota{

    public static void main(String[] args) {

        G_Auris auris1 = new G_Auris();
        System.out.println(auris1.marka);//Toyota
        System.out.println(auris1.model);//Model atanmamis
        System.out.println(auris1.renk);//Renk atanmamis
        System.out.println(auris1.yakit);//Yakit atanmamis
        System.out.println(auris1.uretimYeri);//Japonya ve Turkiye
        System.out.println(auris1.sanziman);//Otomatik veya manuel
        System.out.println(auris1.lastik);//Pirelli
        System.out.println(auris1.guvenlik);//Toyota araclar ekstra guvenlik donanimina sahiptir
        System.out.println(auris1.aku);//Aku atanmadi
    }

}
