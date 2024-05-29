/*
 * Clase RosasAriel
 * @version 1.0
 * @author arielrosas
 */
public class RosasAriel {

    /*
     * Genera la serie de Fibonacci hasta un tamaño especificado.
     * @param tamaño La cantidad de términos de la serie a generar.
     * Imprime los números de la serie de Fibonacci.
     */
    public static void raSN1(int tamaño) {
        int arValAnt = 0;
        int arValAct = 1;
        int arResult = 0;
        System.out.print("SN1: ");
        for (int i = 0; i < tamaño; i++) {
            System.out.print(arResult + " ");
            arResult = arValAct + arValAnt;
            arValAnt = arValAct;
            arValAct = arResult;
        }
    }

    /*
     * Genera una serie donde cada par de números consecutivos incrementan de dos en dos.
     * @param tamaño La cantidad de pares de términos de la serie a generar.
     * Imprime la serie en pares consecutivos incrementando de dos en dos.
     */
    public static void raSN2(int tamaño) {
        System.out.print("SN2: ");
        int arResltUno = 0;
        int arResltDos = 1;
        for (int i = 0; i < tamaño; i++) {
            System.out.print(arResltUno + " " + arResltDos + " ");
            arResltDos = arResltDos + 2;
        }
    }

    /*
     * Genera una serie de fracciones con numerador basado en la serie de Fibonacci y denominador en números impares.
     * @param tamaño La cantidad de términos de la serie a generar.
     * Imprime una serie de fracciones con denominador impar.
     */
    public static void raSN3(int tamaño) {
        int arNum = 0;
        int arDem = 0;
        int arValAnt = 0;
        int arValAct = 1;
        System.out.print("SN3: ");
        for (int i = 0; i < tamaño; i++) {
            if ((arDem % 2) != 0) {
                System.out.print(arNum + "/" + arDem + " ");
                if (arNum == 0) {
                    arNum += 1;
                } else {
                    arNum = arValAct + arValAnt;
                    arValAnt = arValAct;
                    arValAct = arNum;
                }
            }
            arDem++;
        }
    }

    /*
     * Genera una serie de fracciones con numerador basado en la serie de Fibonacci y denominador en números pares.
     * @param tamaño La cantidad de términos de la serie a generar.
     * Imprime una serie de fracciones con denominador par.
     */
    public static void raSN4(int tamaño) {
        System.out.print("SN4: ");
        int arNum = 0;
        int arDem = 0;
        int arValAnt = 0;
        int arValAct = 1;
        for (int i = 0; i < tamaño; i++) {
            if ((arDem % 2) == 0) {
                System.out.print(arNum + "/" + arDem + " ");
                if (arNum == 0) {
                    arNum += 1;
                } else {
                    arNum = arValAct + arValAnt;
                    arValAnt = arValAct;
                    arValAct = arNum;
                }
            }
            arDem++;
        }
    }

    /*
     * Genera una serie de números primos hasta un tamaño especificado.
     * @param tamaño La cantidad de números primos a generar.
     * Imprime una serie de números primos.
     */
    public static void raSN5(int tamaño) {
        int arVal = 2;
        System.out.print("SN5: ");
        for (int i = 0; i < tamaño; i++) {
            if (esPrimo(arVal)) {
                System.out.print(arVal + " ");
            }
            arVal++;
        }
    }

    /*
     * Determina si un número dado es primo.
     * @param valor El número a evaluar.
     * @return Devuelve true si el número es primo, de lo contrario false.
     */
    public static boolean esPrimo(int valor) {
        if (valor <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(valor); i++) {
            if (valor % i == 0) {
                return false;
            }
        }
        return true;
    }

    /*
     * Genera una serie donde cada término es el resultado de sumar el doble del índice anterior más uno.
     * @param tamaño La cantidad de términos de la serie a generar.
     * Imprime la serie resultante.
     */
    public static void raSN6(int tamaño) {
        System.out.print("SN6: ");
        int arVal = 1;
        int arValDos = 1;
        for (int i = 0; i < tamaño; i++) {
            System.out.print(arVal + " ");
            arValDos = arValDos + 2;
            arVal = arVal + arValDos;
        }
    }

    /*
     * Genera una serie donde cada término incrementa en tres unidades respecto al anterior.
     * @param tamaño La cantidad de términos de la serie a generar.
     * Imprime la serie resultante.
     */
    public static void raSN7(int tamaño) {
        System.out.print("SN7: ");
        int arVal = 1;
        for (int i = 0; i < tamaño; i++) {
            System.out.print(arVal + " ");
            arVal = arVal + 3;
        }
    }

    /*
     * Genera una serie donde cada término incrementa en cinco unidades respecto al anterior.
     * @param tamaño La cantidad de términos de la serie a generar.
     * Imprime la serie resultante.
     */
    public static void raSN8(int tamaño) {
        System.out.print("SN8: ");
        int arVal = 3;
        for (int i = 0; i < tamaño; i++) {
            System.out.print(arVal + " ");
            arVal = arVal + 5;
        }
    }

    /*
     * Genera una serie donde cada término es el resultado de multiplicar el término anterior por tres.
     * @param tamaño La cantidad de términos de la serie a generar.
     * Imprime la serie resultante.
     */
    public static void raSN10(int tamaño) {
        System.out.print("SN10: ");
        int arVal = 3;
        int arResult = 0;
        for (int i = 0; i < tamaño; i++) {
            System.out.print(arVal + " ");
            arResult = arVal;
            arVal = arResult * 3;
        }
    }
    /*
     * Series de Caracteres
     */
    public static void raSC2(int tamaño){
        System.out.print("SC2: ");
        
    }

}
