package classes.exerciciosCondicionais;

import java.util.Scanner;

public class AntecessorESucessor {
    public static void main(String[] args) {
        Scanner entrance = new Scanner (System.in);
        int num;
        int antec;
        int suces;

        System.out.println ("Informe um numero: ");
        num = entrance.nextInt ();
        suces = num + 1;
        antec = num -1;
        System.out.println ("O numero informado foi:" + num
                            + "\n O seu antecessor é: " + antec
                            + "\n Seu sucessor é: " + suces);
    }
}
