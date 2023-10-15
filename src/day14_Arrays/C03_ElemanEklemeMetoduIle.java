package day14_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C03_ElemanEklemeMetoduIle {

    public static void main(String[] args) {

        int[] arr = new int[]{3, 4, 5};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen array'e eklemek icin bir tamsayi giriniz");
        int eklenecekSayi = scanner.nextInt();

        arr = C02_ArraysElemanEkleme.arrayeElemanEkle(arr, eklenecekSayi);
        System.out.println("Array'in yeni hali : " + Arrays.toString(arr));
    }
}
