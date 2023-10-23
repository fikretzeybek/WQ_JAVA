package day14_Arrays;

public class C01_Arrays {
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 10};
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result += (i % 2 == 0) ? array[i] : -array[i];
        }
        System.out.println(result);

    }
}