package classes.exerciciosCondicionais;

import java.util.Date;
import java.util.stream.IntStream;

public class WhileTeste {
    public static void main(String[] args) {
//        int x= 0;
//        while (x < 3){
//            System.out.println ("Dentro do While...");
//            x++;
//        }
//
//        var y = 3;
//        do {
//            System.out.println ("dentro do Do/While...");
//        } while (y++ < 2);

        IntStream.of(1,2,3,4,5).forEach(n -> {
            while (n < 5) {
                System.out.println ("Número: " + n);
                n++;
            }
        });
        System.out.println ("====\n====");
        IntStream.range (0,6).forEach (n -> {
            while (n < 5) {
                System.out.println ("Número= " + n);
                n++;
            }
        });
    }
}
