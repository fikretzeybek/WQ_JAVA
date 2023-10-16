package F27_AbstractsClasses_Interfaces;

public abstract class F06_AbstractParent extends F05_AbstarcrGrandParent{
    /*

     */

    public  void method1(){
        System.out.println("GP' daki abstract methd1 P'da concrete yapildi");
    }

    public void method4(){
        System.out.println("P'daki concrete method4");
    }

    public abstract int method5();

    public abstract String method6();




}
