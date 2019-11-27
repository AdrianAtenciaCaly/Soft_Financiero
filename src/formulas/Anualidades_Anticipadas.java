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
public class Anualidades_Anticipadas {
//Calculos de una anualidad anticipada

    public static double vPresente(double a, double i, double nPer) {
        double vPresente;
        vPresente = a * (1 + i) * (((Math.pow((1 + i), nPer) )- 1) / (i * ((Math.pow((1 + i), nPer))-1)));
        return vPresente;
    }

    public static double anualidadVP(double vPresente, double i, double nPer) {
        double anualidad;
        anualidad = (vPresente / (1 + i)) * ((Math.pow((1 + i), nPer) - 1) / i * (Math.pow((1 + i), nPer) - 1));
        return anualidad;
    }

    public static double vFinal(double a ,double i, double nPer) {
        double vFinal;
        vFinal = a * ((1 + i) * ((Math.pow((1 + i), nPer) - 1)) / i);
        return vFinal;
    }

    public static double anualidadVF(double vFinal, double i, double nPer) {
        double anualidad;
        anualidad = vFinal / ((1 + i) * (Math.pow((1 + i), nPer) - 1) / i);
        return anualidad;
    }
     public static  double nPperVP(double vPresente, double a, double i) {
        double nPerVF;
        nPerVF = ((Math.log(a) - Math.log(a+i*(vPresente-a))) / Math.log(1 + i));
        return nPerVF;
    }

}
