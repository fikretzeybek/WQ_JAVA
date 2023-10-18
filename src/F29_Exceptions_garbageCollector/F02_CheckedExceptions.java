package F29_Exceptions_garbageCollector;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class F02_CheckedExceptions {

    public static void main(String[] args) throws IOException {
       /*
            Eger birden fazla exception olusma ihtimali varsa
            ve biz try-catch yerine throws keyword kullanmak istiyorsak
            en genis yakalama kapasitesi olan (en ince elek araligi olan)
            parent exception'i yazmamiz yeterli olacaktir
         */


        FileInputStream fis = new FileInputStream("src/day28_exceptions/text.txt");

        int k=0;
        while((k= fis.read() ) != (-1)) {
            System.out.print((char) k);
        }


    }
}