package classes.exerciciosCondicionais;

import java.util.Scanner;

public class IF {
    public static void main(String[] args) {
       final var condicao = false;

       if (condicao == false){
           System.out.println ( "A condição é verdadeira");
       } else {
           System.out.println ("A condição é falsa");
       }

       if (condicao == true)
           System.out.println ("\nUma unica linha...");

           final var ternario = condicao ? "\né verdadeira " : "é falsa";

           System.out.println (ternario);

    }
}
