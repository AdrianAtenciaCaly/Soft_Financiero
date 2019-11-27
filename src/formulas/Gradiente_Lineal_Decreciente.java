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
public class Gradiente_Lineal_Decreciente {

    public static double vPresente(double a, double i, double nPer, double gradiente) {
        double vPresente;
        vPresente = a * (((Math.pow((1 + i), nPer)) - 1) / (i * (Math.pow((1 + i), nPer)))) - (gradiente / i) * (((((Math.pow((1 + i), nPer)) - 1))) / (i* (Math.pow((1 + i), nPer))) - (nPer / (Math.pow((1 + i), nPer))));
        return vPresente;
    }

    public static  double cuota(double a, double gradiente, double nPer) {
        double cuota;
        cuota = a - (nPer - 1) * gradiente;
        return cuota;
    }
}
