package formulas;

/**
 *
 * @author Adrian AC
 */
public class Interes_Simple {

    public static double vPresente(double vf, double i, double nPer) {
        double vPresente;
        vPresente = (vf) / (1 +nPer*i);
        return vPresente;
    }

    public  static double vFinal(double vPresente, double i, double nPer) {
        double vFinal;
        vFinal = vPresente * (1 + i * nPer);
        return vFinal;
    }

    public static double nPerido(double vPresente, double vFinal, double i) {
        double nPeriodo;
        nPeriodo = ((vFinal / vPresente - 1 )/ i);
        return nPeriodo;
    }

    public static double interes(double vFinal, double vPresente, double nPer) {
        double interes;
        interes = (((vFinal / vPresente) - 1) / nPer);
        return interes;
    }
}
