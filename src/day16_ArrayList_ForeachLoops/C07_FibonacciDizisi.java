package day16_ArrayList_ForeachLoops;

import java.util.ArrayList;
import java.util.List;

public class C07_FibonacciDizisi {
    public static void main(String[] args) {
        // Soru 4- Verilen pozitif bir n tamsayisini alarak,
        // bize ilk n tane Fibonacci sayisini bir list olarak
        // donduren bir method olusturun.

        System.out.println(fibonacciListesiOlustur(10));

    }
    public static List<Integer> fibonacciListesiOlustur(int listedekiSayiAdedi){

        List<Integer> fibonacciList = new ArrayList<>();

        if (listedekiSayiAdedi == 1){
            fibonacciList.add(0);
        } else if (listedekiSayiAdedi == 2) {
            fibonacciList.add(0);
            fibonacciList.add(1);
        }else {// istenen eleman sayisi 2 den fazla
            fibonacciList.add(0);
            fibonacciList.add(1);

            for (int i = 2; i < listedekiSayiAdedi; i++) {

                fibonacciList.add(fibonacciList.get(i-1) + fibonacciList.get(i-2));

            }
        }
        return fibonacciList;
    }
}
