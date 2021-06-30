package classes.exerciciosCondicionais;

import java.text.DecimalFormat;

public class Igualdade {
    public static void main(String[] args) {
        double salarioMinimo = 788.02;
        double salarioUsuario = 2589.55;
        double quantidadeSalarios = salarioUsuario/salarioMinimo;
        DecimalFormat dec = new DecimalFormat ("0.00");

        System.out.println (dec.format (quantidadeSalarios));

    }
}
