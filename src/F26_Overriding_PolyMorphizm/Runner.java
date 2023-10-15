package F26_Overriding_PolyMorphizm;

class GP {
    int product(int i) {
        int result = i * i;
        System.out.println("GP: " + i + "," + result);
        return result;
    }
}

class P extends GP {
    int product(int i) {
        int result = i + i;
        System.out.println("P: " + i + "," + result);

        return result;
    }
}

class C extends P {
    int product(int i) {
        int result = i * 2;
        System.out.println("C: " + i + "," + result);
        return result;
    }
}

public class Runner {

    public static void main(String[] args) {
        GP obj1 = new GP();
        P obj2 = new P();
        GP obj3 = new C();
        C obj4 = new C();

        obj1.product(1);//GP: 1,1
        obj2.product(2);//P: 2,4
        obj3.product(3);//C: 3,6
        obj4.product(4);//C: 4,8
    }
}
