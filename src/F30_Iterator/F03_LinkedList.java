package F30_Iterator;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class F03_LinkedList {

    public static void main(String[] args) {

        /*

         */

        LinkedList<String> ll1 = new LinkedList<>();

        List<Integer> ll2 = new LinkedList<>();

        Queue<String> ll3 = new LinkedList<>();

        Deque<String> ll4 = new LinkedList<>();

        //Eger data turu olarak List secilirse
        //bizim simdiye kadar kullandigimiz ArrayList ile ayni ozelliklere sahip olur

        ll2.add(4);
        ll2.add(5);
        ll2.add(8);

        System.out.println(ll2);//[4,5,8]

        ll2.add(1,9);
        System.out.println(ll2);//[4, 9, 5, 8]

        System.out.println(ll2.get(2));//5

        System.out.println(ll2.remove(1));//9

        Integer silinecekSayi = 8;

        System.out.println(ll2.remove(silinecekSayi));//true
        System.out.println(ll2);//[4, 5]


    }
}
