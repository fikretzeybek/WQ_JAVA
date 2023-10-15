package day10_methodOlusturma_methodOverloading;

import java.util.Scanner;

public class S03_AsalSayiBulma {


	public static void main(String[] args) {

		for (;;) {
			if (!asalMiMethod()) {
				break;
			}
		}

	}

	public static boolean asalMiMethod() {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir sayi giriniz (0 girildiginde dongu sonlandırılacaktır)");
		int sayi = scanner.nextInt();

		if (sayi == 0) {
			System.out.println("Döngü sonlandırıldı.");
			return false; // sayı 0 ise döngüyü sonlandır
		}

		boolean asalMi = sayi == 2;

		for (int i = 2; i < sayi; i++) {

			if (sayi % i == 0) {
				asalMi = false;
				break;
			} else {
				asalMi = true;
			}

		}

		if (asalMi) {
			System.out.println(sayi + " Sayisi Asal Sayidir");
		} else {
			System.out.println(sayi + " Sayisi Asal Degildir");
		}

		return true; // döngüyü devam ettir
	}
}
