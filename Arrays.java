

public class Arrays {
    private static final int tieks = 15;
        private static final String ubKS = "  ";
        private static final char[] nomK = {'K', 'A', 'T', 'H', 'E', ' '};
        private static final char[] apS = {'S', 'A', 'N'};
    public void EjercicioA2(int tamañoSK, char Caracter){
        int col = tamañoSK, divSK =  tamañoSK/2 ,tabulacion=0;
        int[] distancias = {};
        for (int i = 0; i < divSK; i++) {
            for (int j = 0; j <= col; j++) {
                if(j == 0 || j == col)
                    System.out.print(Caracter);
                else
                    System.out.print(" ");  
            }
            col--;  
            System.out.println();
        }
        for (int i = divSK; i < tamañoSK; i++) {
            for (int j = 0; j <= col; j++) {
                if(j == 0 || j == col)
                    System.out.print(Caracter + " ");
                else
                    System.out.print(" ");  
            }
            col++;
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < divSK; i++) {
            for (int q = 0; q < tamañoSK; q++) {
                if (i == 0 || q == 0) 
                    System.out.print(Caracter);
            } 
            System.out.println();
        }
        for (int i = divSK; i < tamañoSK; i++) {
            for (int q = 0; q < tamañoSK; q++) {
                if (i == divSK || q == tamañoSK-1 || i == tamañoSK-1) 
                    System.out.print(Caracter);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void Ejercicio3AKS() {
        String[][] Ejercicio3AKS = new String[13][5];
        for (int j = 0; j < 13; j++) {
            for (int k = 0; k < 5; k++) {
                if (j == 10 - 3 * j)
                    Ejercicio3AKS[j][k] = ubKS + nomK[j] + ubKS;
                else if (j == 3 * j)
                    Ejercicio3AKS[j][k] = ubKS + apS[j] + ubKS;
                else
                    Ejercicio3AKS[j][k] = ubKS + ubKS;
            }
        }

        for (int j = 12; j >= 0; j--) {
            for (int k = 0; k < 5; k++) {
                System.out.print(ubKS + Ejercicio3AKS[j][k] + ubKS);
                try {
                    Thread.sleep(tieks);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println();
            try {
                Thread.sleep(tieks);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
        
    public void Arrays4KS() {
        System.out.println("");
        limpiterKS();
        Ejercicio3AKS();
        System.out.println();
    }

    private void limpiterKS() {
        System.out.print("\033[H\033[2J\033[3J");
        System.out.flush();
    }

    
}

        