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
public class Gradiente_Geometrico_Decreciente {

    public static double vPresenteD(double i, double a, double nPer, double j) {
        double vPresente;
        vPresente = a * (((Math.pow((1 + i), nPer)) - (Math.pow((1 - j), nPer))) / ((j + i) * (Math.pow((1 + i), nPer))));
        return vPresente;
    }
     public static double vPresenteI(double i, double a) {
        double vPresente;
        vPresente = (a/(1+i));
        return vPresente;
    }

    public static double cuota(double a, double j, double nPer) {
        double cuota;
        cuota = a * (Math.pow((1 - j), (nPer - 1)));
        return cuota;
    }
}
