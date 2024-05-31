import java.util.Scanner;

public class RiosMarco {

    static Scanner sc = new Scanner(System.in);

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
        int[][] matriz = new int[tamanio][tamanio];
        for (int i = 0; i < tamanio; i++) {
            int num = 1;
            for (int j = 0; j < tamanio; j++) {
                if (j <= i) {
                    if (j == 0 || j == 1) {
                        matriz[i][j] = 1;
                    } else {
                        matriz[i][j] = matriz[i][j - 1] + matriz[i - 1][j - 1];
                    }
                } else {
                    matriz[i][j] = num;
                    num++;
                }
            }
        }

        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }  


}