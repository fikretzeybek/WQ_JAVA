package day09_ForLoopsveMethodOlusturma;

public class C12_MethodOlusturma {
    public static void main(String[] args) {

        String str = "Sevim bak kim gelmiş ? ";
        str.toUpperCase();

        //  method bize bir sonuc donduruyorsa
        //  sadece o satırda, sonucu gormek ıstıyorsanız, kalıcı bir degisiklik yapmıyacaksınız
        //  direk yazdırabiliriz

        System.out.println(str.toLowerCase());// sevim bak kim gelmiş ?
        //  veya degisikligin kalıcı olmasını istıyorsak
        // yeni halini kaydedebiliriz

        String strBuyukharf = str.toUpperCase();
        System.out.println(str); // Sevim bak kim gelmiş ?
        System.out.println(strBuyukharf); // SEVİM BAK KİM GELMİŞ ?

        // Google === google
    }
}
