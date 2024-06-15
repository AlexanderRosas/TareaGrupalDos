import java.util.Scanner;

public class RiosMarco {
    private Scanner scanner;

    public RiosMarco() {
        this.scanner = new Scanner(System.in);
    }

    public void rmSN3(int n) {
        int a = 0, b = 1, c;
        for (int i = 0; i < n; i++) {
            int numerator = a;
            int denominator = 2 * i + 1;
            System.out.print(numerator + "/" + denominator + " ");
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
    }

    public void rmSN7(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print((1 + 3 * i) + " ");
        }
        System.out.println();
    }

    public void rmSN11(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) * (i + 2) + " ");
        }
        System.out.println();
    }

    public void rmSC1(int n) {
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.print("+ ");
            } else {
                System.out.print("- ");
            }
        }
        System.out.println();
    }

    public void rmSC5(int n) {
        String[] symbols = {"\\", "|", "/", "-", "|"};
        for (int i = 0; i < n; i++) {
            System.out.print(symbols[i % symbols.length] + " ");
        }
        System.out.println();
    }

    public void rmF2(int tamanio) {
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                if (i == 0 || i == tamanio - 1) {
                    if (j % 2 == 0) {
                        System.out.print("* ");
                    } else {
                        System.out.print("+ ");
                    }
                } else if (j == 0 || j == tamanio - 1) {
                    if (i % 2 == 0) {
                        System.out.print("* ");
                    } else {
                        System.out.print("+ ");
                    }
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public void rmF6(int tamanio) {
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void rmF10(int tamanio){
        String positivo = "|_+_";
        String negativo = "|_-_";
        for(int i = 0; i < tamanio; i++){
            for(int j = 0; j < i; j++){
                System.out.print("     ");
            }
            if(i%2!=0){
                System.out.println(positivo);
            }else{
                System.out.println(negativo);
            }
        }
        System.out.println();
    }
    

    public void rmF14(int tamanio){
           
        for (int i = 0; i < tamanio; i++) {
            
            int mfNumero = 1;            
            for (int j = 0; j < (tamanio*2) - 2; j++) {
                System.out.print(" ");
            }
            
            for (int j = 0; j <= i; j++) {
                System.out.print(mfNumero + "   ");
                mfNumero = mfNumero * (i - j) / (j + 1);
            }
            
            tamanio += -1;
            System.out.println("");
        }
        System.out.println("");   
    }

    public void rmF18(int tamanio) {
        for (int i = 1; i <= tamanio; i++) {
            System.out.print("1 ");
            for (int j = 2; j <= i; j++) {
                int num = 1;
                for (int k = 2; k <= j; k++) {
                    num += k;
                }
                System.out.print(num + " ");
            }
            System.out.println("2");
        }
    }

    public void rmC03() {
        System.out.println("Ingrese una frase para eliminar una vocal:");
        String frase = scanner.nextLine();
        System.out.println("Ingrese una vocal para eliminar en rmC03:");
        char vocal = scanner.nextLine().charAt(0);
        String resultado = eliminarVocal(frase, vocal);
        System.out.println("Resultado rmC03: " + resultado);
    }

    private String eliminarVocal(String frase, char vocal) {
        char lowerVocal = Character.toLowerCase(vocal);
        char upperVocal = Character.toUpperCase(vocal);
        
        StringBuilder resultado = new StringBuilder();
        
        for (char c : frase.toCharArray()) {
            if (c != lowerVocal && c != upperVocal) {
                resultado.append(c);
            }
        }
        
        return resultado.toString();
    }

    public void rmC05() {
        System.out.println("\nIngrese una frase para invertirla :");
        String frase = scanner.nextLine();
        String resultado = invertirYMayusculas(frase);
        System.out.println("Resultado rmC05: " + resultado);
    }

    private String invertirYMayusculas(String frase) {
        StringBuilder resultado = new StringBuilder();
        
        for (int i = frase.length() - 1; i >= 0; i--) {
            char c = frase.charAt(i);
            if (esVocal(c)) {
                resultado.append(Character.toUpperCase(c));
            } else {
                resultado.append(c);
            }
        }
        
        return resultado.toString();
    }

    private boolean esVocal(char c) {
        char lowerC = Character.toLowerCase(c);
        return lowerC == 'a' || lowerC == 'e' || lowerC == 'i' || lowerC == 'o' || lowerC == 'u';
    }

    public void rmC07() {
        System.out.println("\nIngrese una frase para rmC07:");
        String frase = scanner.nextLine();
        String resultado = mayusculasSinJ(frase);
        System.out.println("Resultado rmC07: " + resultado);
    }

    private String mayusculasSinJ(String frase) {
        String upperCaseFrase = frase.toUpperCase();
        
        StringBuilder resultado = new StringBuilder();
        
        for (char c : upperCaseFrase.toCharArray()) {
            if (c != 'J') {
                resultado.append(c);
            }
        }
        
        return resultado.toString();
    }

    public void rmA04() {
        System.out.println("\nIngrese su nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese su apellido:");
        String apellido = scanner.nextLine();
        crearMatrizX(nombre, apellido);
    }

    private void crearMatrizX(String nombre, String apellido) {
        int lenNombre = nombre.length();
        int lenApellido = apellido.length();
        int n = Math.max(lenNombre, lenApellido);
        char[][] matriz = new char[n][n];
        
        for (int i = 0; i < n; i++) {
            if (i < lenNombre) {
                matriz[i][i] = nombre.charAt(i);
            }
            if (i < lenApellido) {
                matriz[i+1][n - i - 1] = apellido.charAt(i);
            }
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] == 0) {
                    System.out.print("   "); 
                } else {
                    System.out.print(matriz[i][j] + "  ");
                }
            }
            System.out.println();
        }
    }

    public void rmL02() {
        System.out.println("\nIngrese un caracter para la carga en mrL02:");
        char caracter = scanner.nextLine().charAt(0);
    
        System.out.print("Cargando: ");
        for (int i = 0; i <= 20; i++) {
            System.out.print("\r"); 
    
            StringBuilder barra = new StringBuilder("[");
            for (int j = 0; j < i; j++) {
                barra.append(caracter);
            }
            for (int j = i; j < 20; j++) {
                barra.append(" ");
            }
            barra.append("] " + (i * 5) + "%");
    
            System.out.print(barra.toString());
    
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }
    

    public void rmL08() {
        System.out.println("\nIngrese su nombre y apellidos para la carga en mrL08:");
        String nombreCompleto = scanner.nextLine();
    
        int totalCaracteres = nombreCompleto.length();
    
        System.out.print("Cargando: ");
        for (int i = 0; i <= totalCaracteres; i++) {
            System.out.print("\r"); 
    
            StringBuilder barra = new StringBuilder("[");
            for (int j = 0; j < i; j++) {
                barra.append(nombreCompleto.charAt(j));
            }
            for (int j = i; j < totalCaracteres; j++) {
                barra.append(" ");
            }
            int porcentaje = (int) ((i / (double) totalCaracteres) * 100);
            barra.append("] " + porcentaje + "%");
    
            System.out.print(barra.toString()); 
    
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }

}