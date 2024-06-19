import java.util.Scanner;
public class App {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int KsNroTermino = 0, KsNroTermino2 = 0; 
        String skCaracter;
        KatherineSanchez ks = new KatherineSanchez();
        Series sks    = new Series();
        Arrays aks    = new Arrays();
        Loading lks   = new Loading();
        recursivo rks = new recursivo();
        Boolean kslBoolean    = true;
        int numFacKS = -1;
        System.out.println("~~~~~~~~~~~Bienvenido~~~~~~~~~~~");
        System.out.print("Ingrese caracter con el que se formaran las figuras: ");
        skCaracter = sc.nextLine();
        do {
            try {
                System.out.print("Ingrese cantidad de terminos que desea ver: ");
                KsNroTermino = sc.nextInt();
            } 
            catch (Exception e) { 
                System.out.println("***Asegurese que el valor ingresado sea correcto***");
                sc.next();
            }
        } while (KsNroTermino <= 0);
        System.out.println("~~~~~~~~~~~SERIES NUMERICAS~~~~~~~~~~~");
        ks.ksSN1(KsNroTermino);
        ks.ksSN5(KsNroTermino);
        ks.ksSN9(KsNroTermino);
        System.out.println("~~~~~~~~~~~SERIES DE CARACTERES~~~~~~~~~~~");
        ks.ksSC3(KsNroTermino);
        ks.ksSC7(KsNroTermino);
        System.out.println("~~~~~~~~~~~FIGURAS~~~~~~~~~~~");
        ks.ksFigura4(KsNroTermino, skCaracter);
        ks.ksFigura8(KsNroTermino);
        ks.ksFigura12(KsNroTermino);
        ks.ksFigura16(KsNroTermino);
        System.out.println("Bienvenido a cadena de series");
        System.out.println("-------------Ejercicio N°1-------------");
        System.out.print("Ingrese frase: ");
        String KSCaracter = sc.nextLine();
        sks.Ejercicio1KS(KSCaracter);
        System.out.println("-------------Ejercicio N°4-------------");
        do { 
            try {
                System.out.print("Ingrese letra que desea eliminar: ");
                String elimLetKS = sc.nextLine();
                sks.Ejercicio4KS(KSCaracter,elimLetKS);
                kslBoolean = false; 
            } catch (Exception e) {
                System.out.println("**Asegurese que la letra ingresada se encuentre en la frase**");
                sc.next();
                kslBoolean = true;
            }    
        } while (kslBoolean );
        
        System.out.println("*************Bienvenido a Array*************");
        System.out.println("-------------Ejercicio N°2-------------");
        System.out.print("Mi nombre es Katherine Sanchez => KS\nIngrese tamaño: ");
        int tamKS = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Ingrese caracter: ");
        String carKS = sc.nextLine();
        char caracter = carKS.charAt(0);
        aks.EjercicioA2(tamKS,caracter);
        aks.Ejercicio3AKS();
        System.out.println("*************Bienvenido a Loading*************");
        System.out.println("-------------Ejercicio N°1-------------");
        lks.Ejercicio1LKS();
        System.out.println("-------------Ejercicio N°3-------------");
        System.out.print("Ingrese un caracter: ");
        String carL3 = sc.nextLine();
        char caracterL3 = carL3.charAt(0);
        lks.Ejercicio3LKS(caracterL3);
        System.out.println("-------------Ejercicio N°6-------------");
        lks.Ejercicio6KS();
        System.out.println("*************Bienvenido a Recursivo*************");
        System.out.println("-------------Ejercicio N°1-------------");
        do { 
            try {
                System.out.println("Ingrese hasta que nuemero desea ver numeros de factorial" +
                                "(del 1 al 20)");
            numFacKS = sc.nextInt();
            } catch (Exception e) {
                System.out.println("**Asegurese que ingrese un numero entero**");
                sc.next();
            }
        } while (numFacKS < 0 || numFacKS > 20);
        rks.Ejercicio1RKS(numFacKS);
    }
}
