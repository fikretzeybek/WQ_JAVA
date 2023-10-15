package day04_IfStatements;

import java.util.Scanner;

public class C03_IfStatements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen notunuzu giriniz");
        double not = scanner.nextDouble();

        if(not >= 50){
            System.out.println("Gectiniz");
        }else {
            System.out.println("Kaldiniz");
        }

    }


}
