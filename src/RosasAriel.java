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
        for(int i = 0;i<tamano;i++){
            System.out.print(arResult+" "); 
            arResult = arValAct +   arValAnt; 
            arValAnt = arValAct;
            arValAct = arResult; 
        }

    }
    public static void raSN2(int tamaño){
        System.out.print("SN2: ");
        int arResltUno = 0;
        int arResltDos = 1;
        for(int i = 0;i<tamaño;i++){
            System.out.print(arResltUno+" " + arResltDos +" "); 
            arResltDos = arResltDos+2;            
        }

    }
    public static void raSN3(int tamaño){
        int arNum = 0;
        int arDem = 0;
        int arValAnt = 0;
        int arValAct = 1;
        System.out.print("SN3: ");
        for(int i =0;i<tamaño;i++){
            if((arDem % 2)!=0){
                System.out.print(arNum + "/" + arDem +" ");
                if(arNum==0){
                    arNum+=1;
                }else{
                arNum = arValAct +   arValAnt; 
                arValAnt = arValAct;
                arValAct = arNum;
                }
            }
            arDem++;
        }

    }
    public static void raSN4(int tamaño){
        System.out.print("SN4: ");
        int arNum = 0;
        int arDem = 0;
        int arValAnt = 0;
        int arValAct = 1;
        System.out.print("SN3: ");
        for(int i =0;i<tamaño;i++){
            if((arDem % 2)==0){
                System.out.print(arNum + "/" + arDem +" ");
                if(arNum==0){
                    arNum+=1;
                }else{
                arNum = arValAct +   arValAnt; 
                arValAnt = arValAct;
                arValAct = arNum;
                }
            }
            arDem++;
        }

    }
    public static void raSN5(int tamaño){
        int arVal = 1;
        System.out.print("SN5: ");
        for(int i =0;i<tamaño;i++){
            if((arVal%2!=0)&&(arVal%3!=0)){
                System.out.print(arVal + " ");
            }
            arVal++;
        }
    }
    public static void raSN6(int tamaño){
        System.out.print("SN6: ");
        for(int i =0;i<tamaño;i++){
            
        }
    }
    public static void raSN7(int tamaño){
        
    }
    public static void raSN8(int tamaño){
        
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
      
    public static void raSN9(int tamaño){
        
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


