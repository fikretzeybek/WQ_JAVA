package F24_ConstructorCall;

public class M_GrandChild extends K_Child {

    int sayi = 100;
    int yas = 23;

    String mahalle = "Birlik";
    String memleket = "Ankara";
    String arkadas = "Reyhan";

    public void method1() {
        System.out.println("GC method1");
    }

    public void method3() {
        System.out.println("GC method3");
    }

    public void method4() {
        System.out.println("GC method4");
    }

    public void runnerMethod(){
        int sayi = 5;
        int sansliSayi = 45;
        System.out.println(sayi);// 5
        System.out.println(this.sayi);// 100
        System.out.println(super.sayi);// 25

        System.out.println(sinif);// 8
        System.out.println(isim);// Ali Can
        System.out.println(yas);// 23
        System.out.println(tel);// 555353535

        System.out.println(this.sinif);// 8
        System.out.println(this.mahalle);// Birlik
        System.out.println(this.adres);// Cankaya
        this.method1();// GC method1

        System.out.println(super.sinif);// 8
        System.out.println(super.isim);// Ali Can
        System.out.println(super.memleket);// Konya

        System.out.println(sansliSayi);// 45
        //System.out.println(this.sansliSayi); CTE
        //System.out.println(super.sansliSayi); CTE

        System.out.println(arkadas);// Reyhan
        System.out.println(this.arkadas);// Reyhan
        //System.out.println( super.arkadas); CTE

        method2();// Parent method2
        this.method2();// Parent method2
        super.method2();// Parent method2

        method3();// GC method3
        this.method3();// GC method3
        super.method3();// Child method3


    }

    public static void main(String[] args) {

        M_GrandChild obj = new M_GrandChild();
    }


}