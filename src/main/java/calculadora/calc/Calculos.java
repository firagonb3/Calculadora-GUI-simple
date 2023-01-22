package calculadora.calc;

public class Calculos {
    public static double iNumero;
   
    public static void setNumero(double iNum) {
        iNumero = iNum;
    }

    public static String getSuma(double num) {
        return (iNumero + num)+"";
    }

    public static String getMenos(double num) {
        return (iNumero - num)+"";
    }

    public static String getNull() {
        return "0";
    }

    public static String getDividir(double num) {
        
        return (iNumero / num)+"";
    }

    public static String getMultiplicar(double num) {
        return (iNumero * num)+"";
    }
}
