package day14_Arrays;

public class C07_MultiDimensionalArrays {
    public static void main(String[] args) {

        int[] arr = {3, 6, 8, 1};

        // arr'nin tum elementlerini yazdirin

        for (int i = 0; i < arr.length ; i++) {

            System.out.print(arr[i] + " ");
        } // 3 6 8 1

        // for-each ile kodlama(hoca sonra anlatacagim dedi)
        //for (int k : arr) {
        //    System.out.print(k + " ");
        //} // 3 6 8 1

        System.out.println(" ");

        int[][] sayilar = {{3, 5, 6}, {2, 7}, {1, 5, 8}, {1}};
        // sayilar array'indeki tum elementleri yazdirin

        for (int[] ints : sayilar) { // outer loop outer array'i kontrol eder

            for (int anInt : ints) { // inner loop da inner array'i kontrol edecek

                System.out.print(anInt + " ");
            }
        } // 3 5 6 2 7 1 5 8 1

    }
}