package classes.exerciciosCondicionais;

import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;

        Scanner scanner = new Scanner (System.in);
        System.out.println ("Informe os tres primeiros numeros: ");
        num1 = scanner.nextInt ();
        num2 = scanner.nextInt ();
        num3 = scanner.nextInt ();

        double media = (num1 + num2 + num3) / 3;

        System.out.println ("A média dos valor informados é: " + media);
    }
}
