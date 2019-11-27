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
public class Gradiente_Geometrico_Creciente {

    public static double vPresenteD(double a, double i, double j, double nPer) {
        double vPresente;
        vPresente = a * (((Math.pow((1 + i), nPer)) - (Math.pow((1 + j), nPer))) / ((i - j) * (Math.pow((1 + i), nPer))));
        return vPresente;
    }
    public static double vPresenteI(double a, double j, double nPer){
    double vPresente;
    vPresente=((nPer-a)/(1+j));
    return vPresente;
    }

    public  static double anualidadVP(double vPresente, double i, double nPer, double j) {
        double anualidad;
        anualidad = vPresente * (((1 - j) / (1 - (1 + j))) / Math.pow((1 + i), nPer));
        return anualidad;

    }
    
    public static  double anualidadVF(double vFinal, double i, double nPer, double j) {
        double anualidad;
        anualidad= vFinal*((i-j)/((Math.pow((1+i),nPer))-(Math.pow((1+j),nPer))));
     return anualidad;   
    }

    public static double vFinal(double i, double a, double j, double nPer) {
        double vFinal;
        vFinal = a * (((Math.pow((1 + i), nPer)) - (Math.pow((1 + j), nPer))) / (i - j));
        return vFinal;
    }

    public static  double cuota(double a, double j, double nPer) {
        double cuota;
        cuota = a * (Math.pow((1 + j), (nPer - 1)));
        return cuota;
    }

}
