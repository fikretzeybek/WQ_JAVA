package day21_Varargs_StringBuilder;

public class F04_Varargs {

    public static void main(String[] args) {
        islem(3,4,5,6,7,8);//  3 + 4 + 8 = 15 c[3]
        islem(1,2,3,4,5,6); // 1 + 2 + 4 = 7  c[1]

    }

    public  static  void islem(int a , int b, int... c){
        System.out.println(a+b+c[a]);
    }
}
