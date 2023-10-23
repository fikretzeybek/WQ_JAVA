package F31_Collections;

import java.util.HashSet;
import java.util.Set;

public class F02_Set {

    public static void main(String[] args) {

        Set<String> harfler = new HashSet<>();
        System.out.println(harfler.hashCode());//0

        harfler.add("A");
        harfler.add("Ali");
        System.out.println(harfler.hashCode());//65983

    }
}
