package F25_inheritanceDataTypeKullanimi_overriding;

public class M_Childe extends L_Parent{

    public void method1(){
        System.out.println("Child method1");
    }

    public static void main(String[] args) {

        M_Childe childe1 = new M_Childe();
        childe1.method1();//Child method1

        L_Parent childe2 = new M_Childe();
        childe2.method1();//Child method1

        M_Childe childe3 = new M_Childe();
        childe3.method1();//Child method1

        L_Parent parent1 = new L_Parent();
        parent1.method1();//Parent method1

        K_GrandParent parent2 = new L_Parent();
        parent2.method1();//Parent method1

        K_GrandParent gp1 = new K_GrandParent();
        gp1.method1();// GP method
    }
}
