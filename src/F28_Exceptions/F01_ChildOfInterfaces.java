package F28_Exceptions;

public class F01_ChildOfInterfaces implements I01_InterfaceIstisna {

    /*


     */


    @Override
    public void method1() {

    }

    @Override
    public String method3() {
        return null;
    }

    @Override
    public int method5() {
        return 0;
    }

    @Override
    public int method4() {
        return 44;
    }

    @Override
    public int method7() {
        return 0;
    }

    public static void main(String[] args) {

        System.out.println(I01_InterfaceIstisna.method2());
        F01_ChildOfInterfaces obj = new F01_ChildOfInterfaces();
        obj.methodIstisna();
    }
}
