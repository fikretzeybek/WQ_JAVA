package day21_Varargs_StringBuilder;

public class F03_Varsrgs {
    // 1 int ve istenen kadar String parametre alip
    // String parametre sayisi ile int sayinin carpimini
    //yazdiran bir method olusturun

    public static void main(String[] args) {

        islemYap(5,"a","b","c");
        islemYap(2,"a");
        islemYap(5);
        islemYap(3,"","","","","");

    }
    public  static void islemYap(int sayi,String...strings){

        System.out.println(sayi*strings.length);
    }
}
