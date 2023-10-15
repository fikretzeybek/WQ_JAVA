package day11_WhileLoopDoWhileLoop;

public class C02_WhileLoop {
    public static void main(String[] args) {
        // 1 den 10 a kadar olan sayilari yazdirin

        for (int i = 1; i <= 10 ; i++) {
            System.out.print(i + " ");
        }
        // soruyu while loop ile yapalim
        // WL de
        //      -loop icinde kullanilacak variable,
        //      -bitis sarti
        //      -artis/azalis yontemini yazmaliyiz

        int sayi = 1;

        while (sayi <= 10){
            System.out.println(sayi + " ");
            sayi++;
        }

        // for loop ile yapilabilecek bir islemi
        // for loop ile yapmak tercih edilir
    }
}
