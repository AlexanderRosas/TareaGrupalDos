import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int NroTermino = 0, KsNroTermino2 = 0; 
        Character caracter;
        RiosMarco riosMarco = new RiosMarco();
        KatherineSanchez ks = new KatherineSanchez();
        RosasAriel ar = new RosasAriel();
        String fraseString = null;
        System.out.println("~~~~~~~~~~~Bienvenido~~~~~~~~~~~");
        
        do {
            try {
                System.out.println("Por favor, ingrese un único carácter:");
                String userInput = sc.nextLine();

                if (userInput.length() != 1) {
                    throw new IllegalArgumentException("Debe ingresar exactamente un solo carácter. Inténtelo de nuevo.");
                }

                caracter = userInput.charAt(0);
                
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                caracter = null;
            }
        } while (caracter == null);


        do {
            try {
                System.out.print("Ingrese cantidad de terminos que desea ver: ");
                NroTermino = sc.nextInt();
            } 
            catch (Exception e) { 
                System.out.println("***Asegurese que el valor ingresado sea correcto***");
                sc.next();
            }
        } while (NroTermino <= 0);
        System.out.println("~~~~~~~~~~~SERIES NUMERICAS~~~~~~~~~~~");
        ks.ksSN1(NroTermino);
        ar.raSN2(NroTermino);
        riosMarco.rmSN3(NroTermino);
        ar.raSN4(NroTermino);
        ks.ksSN5(NroTermino);
        ar.raSN6(NroTermino);
        riosMarco.rmSN7(NroTermino);
        SacotoJonathan.jsSN8();
        ks.ksSN9(NroTermino);
        ar.raSN10(NroTermino);
        riosMarco.rmSN11(NroTermino);

        System.out.println("~~~~~~~~~~~SERIES DE CARACTERES~~~~~~~~~~~");
        riosMarco.rmSC1(NroTermino);
        ar.raSC2(NroTermino, caracter);
        ks.ksSC3(NroTermino);
        SacotoJonathan.jsSC4();
        riosMarco.rmSC5(NroTermino);
        ar.raSC6(NroTermino);
        ks.ksSC7(NroTermino);
        SacotoJonathan.jsSC8();
        SacotoJonathan.jsSC9();
        
        System.out.println("~~~~~~~~~~~FIGURAS~~~~~~~~~~~");
        SacotoJonathan.jsFN1();
        riosMarco.rmF2(NroTermino);
        ar.raSF3(caracter, NroTermino);
        ks.ksFigura4(NroTermino, caracter);
        SacotoJonathan.jsFN5();
        riosMarco.rmF6(NroTermino);
        ar.raSF7(NroTermino);
        ks.ksFigura8(NroTermino);
        riosMarco.rmF10(NroTermino);
        ar.raSF11(NroTermino);
        ks.ksFigura12(NroTermino);
        SacotoJonathan.jsFN13();
        riosMarco.rmF14(NroTermino);
        ar.raSF15(NroTermino);
        ks.ksFigura16(NroTermino);
        riosMarco.rmF18(NroTermino);

        System.out.println("~~~~~~~~~~~CADENA CARACTERES~~~~~~~~~~~");
        do {
            try {
                System.out.println("Por favor, ingrese una frase:");
                fraseString = sc.nextLine();
                
                if (fraseString.trim().isEmpty()) {
                    throw new IllegalArgumentException("La entrada no puede estar vacía. Inténtelo de nuevo.");
                }
                
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                fraseString = null;
            }
        } while (fraseString == null);

        do {
            try {
                System.out.println("Por favor, ingrese un único carácter:");
                String userInput = sc.nextLine();

                if (userInput.length() != 1) {
                    throw new IllegalArgumentException("Debe ingresar exactamente un solo carácter. Inténtelo de nuevo.");
                }

                caracter = userInput.charAt(0);
                
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                caracter = null;
            }
        } while (caracter == null);

        ar.raCC2(fraseString, caracter);
        riosMarco.rmC03();
        riosMarco.rmC05();
        SacotoJonathan.SerieCaracteres6();
        riosMarco.rmC07();
        SacotoJonathan.SerieCaracteres8();
        ar.raCC9(fraseString);

        System.out.println("~~~~~~~~~~~ARRAYS~~~~~~~~~~~");
        ar.raAR1();
        riosMarco.rmA04();
        SacotoJonathan.SeriesArrays5();

        System.out.println("~~~~~~~~~~~LOADINGS~~~~~~~~~~~");

        riosMarco.rmL02();
        SacotoJonathan.SeriesLoading4();
        SacotoJonathan.SeriesLoading5();
        ar.raLoadings7();
        riosMarco.rmL08();
        ar.raLoadings9();
        SacotoJonathan.SeriesLoading10();
        ar.raLoadings11();



        System.out.println("~~~~~~~~~~~RECURSIVIDAD~~~~~~~~~~~");
        RiosMarco.rmR02();
        ar.raRecur3();
        SacotoJonathan.SeriesRecursivas4();
        SacotoJonathan.SeriesRecursivas5();
        ar.raRecur6();


    }    
}
