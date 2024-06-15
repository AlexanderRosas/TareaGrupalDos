import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int NroTermino = 0, KsNroTermino2 = 0; 
        String caracter;
        RiosMarco riosMarco = new RiosMarco();
        KatherineSanchez ks = new KatherineSanchez();
        System.out.println("~~~~~~~~~~~Bienvenido~~~~~~~~~~~");
        System.out.print("Ingrese caracter con el que se formaran las figuras: ");
        caracter = sc.nextLine();
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
        riosMarco.rmSN3(NroTermino);
        ks.ksSN5(NroTermino);
        SacotoJonathan.jsSN4();
        riosMarco.rmSN7(NroTermino);
        riosMarco.rmSN11(NroTermino);
        SacotoJonathan.jsSN8();
        ks.ksSN9(NroTermino);
        System.out.println("~~~~~~~~~~~SERIES DE CARACTERES~~~~~~~~~~~");
        riosMarco.rmSC1(NroTermino);
        ks.ksSC3(NroTermino);
        SacotoJonathan.jsSC4();
        riosMarco.rmSC5(NroTermino);
        ks.ksSC7(NroTermino);
        SacotoJonathan.jsSC8();
        SacotoJonathan.jsSC9();
        
        System.out.println("~~~~~~~~~~~FIGURAS~~~~~~~~~~~");
        SacotoJonathan.jsFN1();
        riosMarco.rmF2(NroTermino);
        ks.ksFigura4(NroTermino, caracter);
        SacotoJonathan.jsFN5();
        riosMarco.rmF6(NroTermino);
        ks.ksFigura8(NroTermino);
        riosMarco.rmF10(NroTermino);
        ks.ksFigura12(NroTermino);
        SacotoJonathan.jsFN13();
        riosMarco.rmF14(NroTermino);

        ks.ksFigura16(NroTermino);
        riosMarco.rmF18(NroTermino);

        System.out.println("~~~~~~~~~~~CADENA CARACTERES~~~~~~~~~~~");

        System.out.println("~~~~~~~~~~~ARRAYS~~~~~~~~~~~");

        System.out.println("~~~~~~~~~~~LOADINGS~~~~~~~~~~~");
        
        System.out.println("~~~~~~~~~~~RECURSIVIDAD~~~~~~~~~~~");



    }    
}
