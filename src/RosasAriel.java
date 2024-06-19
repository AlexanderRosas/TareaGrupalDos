/*
 * Clase RosasAriel
 * @version 1.0
 * @author arielrosas
 */

import java.util.Scanner;

public class RosasAriel {
     Scanner scanner = new Scanner(System.in);
    /*
     * Genera la serie de Fibonacci hasta un tamano especificado.
     * @param tamano La cantidad de términos de la serie a generar.
     * Imprime los números de la serie de Fibonacci.
     */
    public static void raSN1(int tamano) {
        int arValAnt = 0;
        int arValAct = 1;
        int arResult = 0;
        System.out.print("SN1: ");
        for (int i = 0; i < tamano; i++) {
            System.out.print(arResult + " ");
            arResult = arValAct + arValAnt;
            arValAnt = arValAct;
            arValAct = arResult;
        }
    }

    /*
     * Genera una serie donde cada par de números consecutivos incrementan de dos en dos.
     * @param tamano La cantidad de pares de términos de la serie a generar.
     * Imprime la serie en pares consecutivos incrementando de dos en dos.
     */
    public static void raSN2(int tamano) {
        System.out.print("SN2: ");
        int arResltUno = 0;
        int arResltDos = 1;
        for (int i = 0; i < tamano; i++) {
            System.out.print(arResltUno + " " + arResltDos + " ");
            arResltDos = arResltDos + 2;
        }
    }

    /*
     * Genera una serie de fracciones con numerador basado en la serie de Fibonacci y denominador en números impares.
     * @param tamano La cantidad de términos de la serie a generar.
     * Imprime una serie de fracciones con denominador impar.
     */
    public static void raSN3(int tamano) {
        int arNum = 0;
        int arDem = 0;
        int arValAnt = 0;
        int arValAct = 1;
        System.out.print("SN3: ");
        for (int i = 0; i < tamano; i++) {
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
     * @param tamano La cantidad de términos de la serie a generar.
     * Imprime una serie de fracciones con denominador par.
     */
    public static void raSN4(int tamano) {
        System.out.print("SN4: ");
        int arNum = 0;
        int arDem = 0;
        int arValAnt = 0;
        int arValAct = 1;
        for (int i = 0; i < tamano; i++) {
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
     * Genera una serie de números primos hasta un tamano especificado.
     * @param tamano La cantidad de números primos a generar.
     * Imprime una serie de números primos.
     */
    public static void raSN5(int tamano) {
        int arVal = 2;
        System.out.print("SN5: ");
        for (int i = 0; i < tamano; i++) {
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
     * @param tamano La cantidad de términos de la serie a generar.
     * Imprime la serie resultante.
     */
    public static void raSN6(int tamano) {
        System.out.print("SN6: ");
        int arVal = 1;
        int arValDos = 1;
        for (int i = 0; i < tamano; i++) {
            System.out.print(arVal + " ");
            arValDos = arValDos + 2;
            arVal = arVal + arValDos;
        }
    }

    /*
     * Genera una serie donde cada término incrementa en tres unidades respecto al anterior.
     * @param tamano La cantidad de términos de la serie a generar.
     * Imprime la serie resultante.
     */
    public static void raSN7(int tamano) {
        System.out.print("SN7: ");
        int arVal = 1;
        for (int i = 0; i < tamano; i++) {
            System.out.print(arVal + " ");
            arVal = arVal + 3;
        }
    }

    /*
     * Genera una serie donde cada término incrementa en cinco unidades respecto al anterior.
     * @param tamano La cantidad de términos de la serie a generar.
     * Imprime la serie resultante.
     */
    public static void raSN8(int tamano) {
        System.out.print("SN8: ");
        int arVal = 3;
        for (int i = 0; i < tamano; i++) {
            System.out.print(arVal + " ");
            arVal = arVal + 5;
        }
    }

    /*
     * Genera una serie donde cada término es el resultado de multiplicar el término anterior por tres.
     * @param tamano La cantidad de términos de la serie a generar.
     * Imprime la serie resultante.
     */
    public static void raSN10(int tamano) {
        System.out.print("SN10: ");
        int arVal = 3;
        int arResult = 0;
        for (int i = 0; i < tamano; i++) {
            System.out.print(arVal + " ");
            arResult = arVal;
            arVal = arResult * 3;
        }
    }
    /*
     * Imprime un patrón de caracteres basado en la secuencia de Fibonacci.
     * Esta función imprime una línea de caracteres donde cada grupo de caracteres se
     * imprime una cantidad de veces que corresponde a losvalores de Fibonacci.
     * @param tamano La cantidad de grupos de caracteres que se deben imprimir.
     * @param caracter El carácter que se imprimirá.
     */
    public static void raSC2(int tamano, char caracter) {
        System.out.print("SC2: ");
        for (int i = 1; i <= tamano; i++) {
            int fibValue = valoresFibonacci(i);
            for (int j = 0; j < fibValue; j++) {
                System.out.print(caracter);
            }
            System.out.print(" ");
        }
    }
    /*
     * Esta funcion devuelve el valor correspondiente a la posicion "arN" en la seucuencia
     * de Fibonnaci
     * @param arN La posicion en la secuencia de Fibonacci para cual se desea el valor
     * @return El valor de Fibonnaci en la posicion de "arN"
     */
    public static int valoresFibonacci(int arN) {
        if (arN <= 0) return 0;
        if (arN == 1) return 1;
        int arNum1 = 0, arN2 = 1;
        for (int i = 2; i <= arN; i++) {
            int next = arNum1 + arN2;
            arNum1 = arN2;
            arN2 = next;
        }
        return arN2;
    }
    /**
     * Imprime una secuencia de caracteres comenzando desde 'a' hasta un tamano especificado.
     * Esta función imprime caracteres en secuencia comenzando desde 'a' (ASCII 97)
     * hasta el número de caracteres especificado por el parámetro `tamano`
     * @param tamano
     */
    public static void raSC6(int tamano) {
        System.out.print("SC6: ");
        for (int i = 0; i <= tamano; i++) {
            if (tamano > 25 ){
                break;
            }
            System.out.print((char)(i + 97));
            System.out.print(" ");
        }
    }
    /*
     * Imprime un triángulo rectángulo usando un carácter especificado con espacios entre cada carácter.
     * Esta función imprime un triángulo rectángulo, donde cada fila tiene un número creciente
     * de caracteres especificados por el parámetro `caracter`, comenzando desde 1 hasta el tamano especificado.
     * @param caracter El carácter que se imprimirá para formar el triángulo.
     * @param tamano La altura del triángulo.
     */
    public static void raSF3(char caracter,int tamano){
        int arColum = 1;
        int arFil = tamano;
        for (;arColum<=arFil;arColum++){
            for (int i = 0; i < arColum; i++) {
                System.out.print(caracter+" ");
            }
            System.out.println();
        }
    }
    /*
     * Imprime una escalera de "---" y barras verticales "|", depende un tamano dado.
     */
    public static void raSF7(int tamano){
        int arColum = 1;
        int arFil = tamano;
        for (;arColum<=arFil;arColum++){
            for (int i = 0; i < arColum; i++) {
                System.out.print("---"+" ");
            }
            System.out.println("|");  
        }
    }
    /*
     * Imprime una escalera de "---" y barras verticales "|", depende un tamano dado.
     */
    public static void raSF11(int tamano){
        int arColum = 1;
        int arFil = tamano;
        for (;arColum<=arFil;arColum++){
            for (int i = 0; i < arColum; i++) {
                System.out.print("---"+" ");
            }
            System.out.println("|");  
        }
        
    }
    /**
     * Genera y imprime el Triángulo de Pascal hasta un tamaño dado.
     * El Triángulo de Pascal es una disposición de números en forma de triángulo
     * donde cada número es la suma de los dos números directamente arriba de él.
     * El primer número de cada fila y el diagonal son siempre 1.
     * @param tamano El tamaño del Triángulo de Pascal a imprimir.
     */
    public static void raSF15(int tamano){
        System.out.println("Figura 15:");
        int[][] arTrianguloPascal = new int[tamano][tamano];
        arTrianguloPascal[0][0] = 1;
        for (int i = 1; i < tamano; i++) {
            arTrianguloPascal[i][0] = 1;
            arTrianguloPascal[i][i] = 1;
            for (int j = 1; j < i; j++) {
                arTrianguloPascal[i][j] = arTrianguloPascal[i-1][j-1] + arTrianguloPascal[i-1][j];
            }
        }
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(arTrianguloPascal[i][j] + " ");
            }
        System.out.println();
        }
    }
    /**
     * Este método toma una frase y una vocal, y reemplaza todas las ocurrencias de la vocal en la frase por un espacio.
     *
     * @param frase La frase en la que se va a realizar la sustitución.
     * @param vocal La vocal que se va a reemplazar por un espacio.
     */
    public void raCC2(String frase, char vocal){
        System.out.println("Cadena 02");
        String fraseSinVocal;
        fraseSinVocal = frase.replace(String.valueOf(vocal), " ");
        System.out.println(fraseSinVocal);
    }
    /**
     * Este método toma una frase y convierte las letras alternadamente a mayúsculas y minúsculas.
     * Los caracteres no alfabéticos se agregan tal como están.
     *
     * @param frase La frase que se va a convertir.
     */
    public void raCC9(String frase){
        System.out.println("Cadena 09");
        StringBuilder fraseNv = new StringBuilder();
        boolean convMayuscula = true;
        for(int i = 0;i<frase.length();i++){
            char caracter = frase.charAt(i);
            if (Character.isLetter(caracter)) {
                if (convMayuscula) {
                    fraseNv.append(Character.toUpperCase(caracter));
                } else {
                    fraseNv.append(Character.toLowerCase(caracter));
                }
                convMayuscula = !convMayuscula;
            } else {
                fraseNv.append(caracter);
            }
        }
        System.out.println(fraseNv);
    }

    public void raAR1(){
        System.out.println("Arrays 01:");
        System.out.println("Ingrese su nombre completo");
        String nombreCompleto = scanner.nextLine();
        String[] palabras = nombreCompleto.split(" ");

        int[] porcentajes = new int[palabras.length];

        System.out.println("Ingrese el porcentaje de cada palabra: ");
        for(int i = 0;i < palabras.length;i++){
            do{
                System.out.print(palabras[i] + ": ");
                porcentajes[i] = scanner.nextInt();
                if(porcentajes[i]>100 || porcentajes[i]<0){
                    System.out.println("Ingrese un valor entre el 0 y 100");
                }
            }while(porcentajes[i]>100 || porcentajes[i]<0);
        }

        for (int i = 0; i < palabras.length; i++) {
            barraProgreso(palabras[i], porcentajes[i]);
        }
        scanner.close();
    }
    public static void barraProgreso(String palabra, int porcentaje){
        int longBarra = 20;
        int cantidadLLena = (int) ((porcentaje/100.0)*longBarra);
        int cantidadVacia = longBarra - cantidadLLena;

        StringBuilder barra = new StringBuilder("[");
        for (int i = 0; i < cantidadLLena; i++) {
            barra.append("=");
        }
        for (int i = 0; i < cantidadVacia; i++) {
            barra.append(" ");
        }
        barra.append("] ");

        int longitudPalabra = (int) ((porcentaje / 100.0) * palabra.length());
        String prePalabra = palabra.substring(0, longitudPalabra);
        System.out.printf("%s %3d%% %s%n", barra.toString(), porcentaje, prePalabra);
    }
    public void raLoadings7() throws InterruptedException{
        int porcentaje = 0;
        int longitudBarra = 20;
        int delay = 100;

        while (porcentaje <= 100) {
            System.out.print("\r");

            int cantidadLlena = (int) (porcentaje / 5.0);
            int cantidadVacia = longitudBarra - cantidadLlena;
            

            StringBuilder barra = new StringBuilder("[");
            for (int i = 0; i < cantidadLlena; i++) {
                barra.append("=");
            }
            if (cantidadVacia > 0) {
                barra.append(" "+ getSpinnerChar(cantidadVacia));
                cantidadVacia--;
            }
            for (int i = 0; i < cantidadVacia; i++) {
                barra.append(" ");
            }
            barra.append("]");

            System.out.printf("%s %3d%% ", barra.toString(), porcentaje);

            Thread.sleep(delay);

            porcentaje += 5;
        }
        System.out.println();
    }

    public static char getSpinnerChar(int porcentaje) {
        switch (porcentaje % 5) {
            case 0:
                return '|';
            case 1:
            case 4:
                return '/';
            case 2:
            case 3:
                return '-';
            default:
                return '|';
        }
    }
    public void raLoadings11(){
            
    }
    public void raLoadings9(){
            
    }
    public void raRecur3(){
            
    }
    public void raRecur6(){
            
    }

}
