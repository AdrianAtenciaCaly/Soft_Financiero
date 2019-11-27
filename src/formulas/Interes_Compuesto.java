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
public class Interes_Compuesto {

    public static double vPresente(double vFinal, double i, double nPer) {
        double vPresente;
        vPresente = (vFinal / Math.pow((1 +i),nPer));
        return vPresente;
    }

    public static  double vFinal(double vPresente, double i, double nPer) {
        double vFinal;
        vFinal = vPresente * Math.pow((1 +i),nPer);
        return vFinal;
    }

    public static double nPerido(double vPresente, double vFinal, double i) {
        double nPeriodo;
        nPeriodo = ((Math.log(vFinal / vPresente)) / Math.log(1 + i));
        return nPeriodo;
    }

    public static  double interes(double vFinal, double vPresente, double nPer) {
        double interes;
        interes = Math.pow((vFinal / vPresente),(1/nPer)) - 1;
        return interes;
    }

}
