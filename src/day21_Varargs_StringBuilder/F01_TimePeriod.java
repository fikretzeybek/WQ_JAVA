package day21_Varargs_StringBuilder;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class F01_TimePeriod {
    public static void main(String[] args) {

        LocalDate dogumTarihi = LocalDate.of(1999,02,21);
        LocalDate bugun = LocalDate.now();

        Period yasim = Period.between(dogumTarihi,bugun);
        System.out.println(yasim);// P24Y7M13D

        System.out.println(yasim.getYears());//30
    }
}
