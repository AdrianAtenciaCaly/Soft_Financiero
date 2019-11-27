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
public class ConversionTasas {

    public static double Nomina_Efectiva(double iNom, double n) {
        double iE;
        iE = (((Math.pow((1 + iNom), n)) / n) - 1);
        return iE;
    }

    public static double Efectiva_Nominal(double n, double iE) {
        double iNom;
        iNom = (n * (Math.pow((1 + iE), (1 / n))) - 1);
        return iNom;
    }

    public static double EfectivaAnual_Periodica(double iE, double n) {
        double iP;
        iP = ((Math.pow((1 + iE), (1 / n))) - 1);
        return iP;
    }
     public static double EfectivaPeriodica_NominalAnual(double iP,double n){
     double iNom;
     iNom=(iP*n);
     return iNom;
         
     }
    
}
