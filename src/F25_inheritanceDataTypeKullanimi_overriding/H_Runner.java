package F25_inheritanceDataTypeKullanimi_overriding;

public class H_Runner {

    public static void main(String[] args) {

        G_AvciKuslar kartal4 = new G_AvciKuslar();

        kartal4.hareket();
        kartal4.solunum();
        kartal4.beslenme();
        kartal4.cogalma();
        kartal4.omur();
        kartal4.kanat();
        kartal4.gaga();
        kartal4.pence();

        F_Kuslar kartal5 = new G_AvciKuslar();
        kartal5.hareket();
        kartal5.solunum();
        kartal5.beslenme();
        kartal5.cogalma();
        kartal5.omur();
        kartal5.kanat();
        kartal5.gaga();
        //kartal5.pence();CTE

        E_Hayvanlar kartal6 = new G_AvciKuslar();
        kartal6.hareket();
        kartal6.solunum();
        kartal6.beslenme();
        kartal6.cogalma();
        kartal6.omur();
        //kartal6.kanat();CTE
        //kartal6.gaga();CTE
        //kartal6.pence();CTE


        F_Kuslar kus1 = new F_Kuslar();

        kus1.hareket();
        kus1.solunum();
        kus1.beslenme();
        kus1.cogalma();
        kus1.omur();
        kus1.kanat();
        kus1.gaga();
        //kus1.pence(); CTE

        E_Hayvanlar kus2 = new F_Kuslar();

        kus2.hareket();
        kus2.solunum();
        kus2.beslenme();
        kus2.cogalma();
        kus2.omur();
        //kus2.kanat();CTE
        //kus2.gaga();CTE
        //kus1.pence(); CTE

        E_Hayvanlar hayvanlar1 = new E_Hayvanlar();

        hayvanlar1.hareket();
        hayvanlar1.solunum();
        hayvanlar1.beslenme();
        hayvanlar1.cogalma();
        hayvanlar1.omur();
        //hayvanlar1.kanat();CTE
        //hayvanlar1.gaga();CTE
        //hayvanlar1.pence();CTE


    }
}
