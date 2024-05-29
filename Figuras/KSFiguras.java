import java.util.Scanner;
public class KSFiguras {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ksF4();
        ksF8();
        ksF12();
        ksF16();
    }

    public static void ksF4(){
        int ksTam1 = 6;
        
        sc.close();
        System.out.println();
    }

    private static void ksF8() {
        
    }

    private static void ksF12() {
        int skTamF = 10, 
            skTamC = 10;
        for (int i=0; i<skTamF; i++) {
            for (int j = 1; j < skTamC; j++) {
                System.out.print(j);
                skTamC--;
            }
            System.out.println();
        }
    }

    private static void ksF16() {
        
    }
    
}















/* 
import java.util.Scanner;
public class App {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int nroTermino = 0;
        char caracter;      
        Katherin ks = new Katherin();
    
        do {
            System.out.print("Ingrese un caracter:");
            caracter = sc.nextLine().charAt(0);
            try {
                System.out.print("Ingrese el nro de terminos a obtener:");
                nroTermino = sc.nextInt();
            } catch (Exception e) { 
                sc.next();
            }
        } while (nroTermino<=0);

        ks.ksSC4(nroTermino);
        ks.ksSN1(nroTermino);
    }
}
*/
