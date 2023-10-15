package day17_Constructors;

public class C07_Car {

    String marka = "Marka atanmamis";
    String model= "Model atanmamis";
    String renk = "Renk atanmamis";
    int yil = 1900;
    int fiyat;

    C07_Car(){
        // bir class'da asagidaki gibi gorunur bir constructor olusturdugumuzda
        // Java default constructor'i siler
        // Bu durumda proje kapsamindaki baska class'larda
        // bu class'in default constructor'ini kullanarak olusturulmus olan objeler
        // CTE verir
        // Bu durumun onune gecmek icin
        // bir class'da gorunur bir parametreli constructor olusturuldugunda
        // DEFAULT constructor yerine de parametresiz ve bos bir cons. olusturulur
    }

    C07_Car(String marka,String model){
        this.marka = marka;
        this.model = model;
    }

    C07_Car(String marka , String model ,String renk, int yil , int fiyat){
        this.marka = marka;
        this.model = model;
        this.renk = renk;
        this.yil = yil;
        this.fiyat = fiyat;
    }


    public String toString() {
        return "<= Arac Ozellikleri =>" +

                "\nMarkasi   :   " + marka  +
                "\nModeli    :   " + model +
                "\nRengi     :   " + renk +
                "\nModel Yili:   " + yil +
                "\nFiyati    :   " + fiyat ;
    }
}