import java.util.Scanner;
public class App {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int KsNroTermino = 0, KsNroTermino2 = 0; 
        String skCaracter;
        KatherineSanchez ks = new KatherineSanchez();
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
    }
}
