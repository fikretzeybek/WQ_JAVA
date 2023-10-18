package F29_Exceptions_garbageCollector;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class F03_ParentChildExceptions {

    public static void main(String[] args) {
        /*
        birden fazla exception olusma ihtimali varsa
        ve bu E.lar arasinda Parent-Childe iliskisi olursa

         once Child sonra Parent yazilmalidir
         */

        try {
            FileInputStream fis = new FileInputStream("src/day28_exceptions1/text.txt");

            int k=0;
            while((k= fis.read() ) != (-1)) {
                System.out.print((char) k);
            }
        } catch (FileNotFoundException e) {

            System.out.println("Dosya yolu yanlistir ");

        } catch (IOException e) {

            System.out.println("Dosya okunamiyor ");
        }

    }
}
