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
public class Anualidades_Vencidas {
//Valor presente de una anualidad vencida y pagos

    public   static double  vPresente(double a, double i, double nPer) {
        double vPresente;
        vPresente = a * ((Math.pow((1 + i), nPer) - 1) / (i * (Math.pow((1 + i), nPer))));
        return vPresente;
    }

    public  static double anualidadVP(double vPresente, double i, double nPer) {
        double anualidad;
        anualidad = vPresente * ((i * Math.pow((1 + i), nPer)) / (Math.pow((1 + i), nPer) - 1));
        return anualidad;
    }

    public static  double nPerVP(double a, double vPresente, double i) {
        double nPerVP;
        nPerVP = (Math.log(a) - Math.log(a - vPresente * i)) /( Math.log(1 + i));
        nPerVP = (Math.log(a) - Math.log(a - vPresente * i)) /( Math.log(1 + i));
        return nPerVP;
    }

    //Valor fina de una anualidad vencia y pagos
    public  static double vFinal(double a, double nPer, double i) {
        double vFinal;
        vFinal = a * ((Math.pow((1 + i), nPer) - 1) / i);
        return vFinal;
    }

    public  static double anualidadVF(double vFinal, double i, double nPer) {
        double anualidad;
        anualidad = vFinal * (i / ((Math.pow((1 + i), nPer) - 1)));
        return anualidad;
    }

    public double nPperVF(double vFinal, double a, double i) {
        double nPerVF;
        nPerVF = ((Math.log(vFinal * i + a) - Math.log(a)) / Math.log(1 + i));
        return nPerVF;
    }

}
