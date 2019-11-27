/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulas;

/**
 *
 * @author Adrian AC
 */
public class Gradiente_Lineal_Creciente {

    public static  double vPresente(double a, double nPer, double gradiente, double i) {
        double vPresente;
        vPresente = (a * ((Math.pow((1 + i), nPer) - 1) / (i * Math.pow((1 + i), nPer)))) + (gradiente / i) * (((Math.pow((1 + i), nPer)-1) / (i *( Math.pow((1 + i), nPer)))) - (nPer / (Math.pow((1 + i), nPer))));
        return vPresente;
    }

    public static double vFinal(double a, double i, double nPer, double gradiente) {
        double vFinal;
        vFinal =( a *(((Math.pow((1 + i), nPer)) - 1)/i)) + (gradiente / i) * ((((Math.pow((1 + i), nPer)) - 1) / i) - nPer);
        return vFinal;
    }

    public static  double anualidad(double vFinal, double nPer, double i, double gradiente) {
        double anualidad;
        anualidad = (vFinal - (gradiente / i)) * (((((Math.pow((1 + i), nPer)) - 1) / i) - nPer)) / ((Math.pow((1 + i), nPer) - 1) / i);
        return anualidad;
    }

}
