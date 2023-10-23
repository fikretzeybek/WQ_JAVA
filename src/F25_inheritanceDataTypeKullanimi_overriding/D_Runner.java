package F25_inheritanceDataTypeKullanimi_overriding;

public class D_Runner {

    public static void main(String[] args) {

        C_AvciKuslar kartal1 = new C_AvciKuslar();

        System.out.println(kartal1.hareket); // C Ucarlar
        System.out.println(kartal1.solunum); // B akcigerle nefes alirlar
        System.out.println(kartal1.beslenme); // C Et yerler
        System.out.println(kartal1.cogalma); // B Yumurtayla cogalirlar
        System.out.println(kartal1.omur); // A yasar ve olurler
        System.out.println(kartal1.kanat); // B Kanatlidirlar
        System.out.println(kartal1.gaga); // C Sivri gagalidir
        System.out.println(kartal1.pence); // C pencelidir

        B_Kuslar kartal2 = new B_Kuslar();
        A_Hayvanlar kartal3 = new A_Hayvanlar();


    }
}
