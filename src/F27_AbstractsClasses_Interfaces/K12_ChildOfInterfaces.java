package F27_AbstractsClasses_Interfaces;


import static F27_AbstractsClasses_Interfaces.I10_Interface.isim;

public class K12_ChildOfInterfaces implements I08_Interface,I10_Interface{

    public void method1(){
        /*

         */

    }

    public void method2(){
        //I08

    }
    public void method3(){
        //I10
    }

    @Override
    public void method7() {

    }

    public String method4(){
        return null;
    }
    public int method5(){
       // birden fazla interface i implement ettgimizde
       // birden fazla interfacede ayni isimde method varsa
        //EGER return typleri ayni ise sorun yak
        // ama return typleri farkli ise karar vermemiz gerekir
        // - ya 2 IF den birini implement etmekten vazgececegiz
        // - veya mumkunse o interface'lerde degistirme yapacagiz
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(I10_Interface.isim);// Veli Cem
        System.out.println(I10_Interface.sayi1);// 25
    }
}
