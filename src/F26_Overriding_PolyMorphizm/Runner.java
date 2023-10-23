package F26_Overriding_PolyMorphizm;

class GP {
    int product(int i) {
        int result = i * i;
        System.out.println("GP: " + i + "," + result);//1,1
        return result;
    }
}

class P extends GP {
    int product(int i) {
        int result = i + i;
        System.out.println("P: " + i + "," + result);//2,4

        return result;
    }
}

class C extends P {
    int product(int i) {
        int result = i * 2;
        System.out.println("C: " + i + "," + result);//3,6
        return result;//4,8
    }
}

public class Runner {

    public static void main(String[] args) {
        GP obj1 = new GP();
        P obj2 = new P();
        GP obj3 = new C();
        C obj4 = new C();

        obj1.product(1);
        obj2.product(2);
        obj3.product(3);
        obj4.product(4);
    }
}
