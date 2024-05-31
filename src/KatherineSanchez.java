public class KatherineSanchez {

    /*
     * Serie: 0 1 1 2 3 5 8 13 21 34...
     * @param ksTam1: numero de numeros a mostrar
     */
    public void ksSN1(int ksTam1){
        int ksSum  = 0, 
            ksVal1 = 0, 
            ksVal2 = 1;
        System.out.println();
        System.out.println("*Ejercicio N°1: ");
        for (int i = 0; i < ksTam1; i++) {
            System.out.print(ksSum + " ");
            if(ksSum ==0)
                ksSum += 1;
            else{
                ksSum   = ksVal1 + ksVal2;
                ksVal1  = ksVal2;
                ksVal2  = ksSum;
            }
        }
        System.out.println();
    }

    /*
     * Serie: 2 3 5 7 11 13...
     * @param ksTam5 : cantidad de numeros a mostrar
     */
    public void ksSN5(int ksTam5) {
        System.out.println();
        System.out.println("*Ejercicio N°5: ");
        int count = 0; 
        int num = 2;
        while (count < ksTam5) {
            boolean ksNumPrim = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    ksNumPrim = false;
                    break;
                }
            }
            if (ksNumPrim) {
                System.out.print(num + " ");
                count++; 
            }
            num++; 
        }
        System.out.println();
    }

    /*
     * Serie: 2 4 8 16 32 64 128 256 512 1024...
     * @param ksTam9 : cantidad de numeros a mostrar
     */
    public void ksSN9(int ksTam9) {
        int ksSum9 = 2;
        System.out.println();
        System.out.println("*Ejercicio N°9: ");
        for (int i = 0; i < ksTam9; i++) {
            System.out.print(ksSum9 + " ");
            ksSum9 *= 2;
        }
        System.out.println();
    }

    /*
     * Serie: \ | / - | \ | / - | \ | / - | \ |...
     * @param ksTamC7 : cantidad de caracteres a mostrar
     */
    public void ksSC3(int ksTam5) {
        String ksCarac[] = { "\\", "|", "/", "-", "|"};
        System.out.println();
        System.out.println("*Ejercicio N°5: ");
        for (int i = 0; i < ksTam5; i++) {
            System.out.print(ksCarac[i % 5] + " ");
        }
        System.out.println();
    }

    /*
     * Serie: a + b - c + d - e + f - g + h - i + j - k + l - m...
     * @param ksTamC7 : cantidad de caracteres a mostrar
     */
    public void ksSC7(int ksTamC7) {
        char ksch = 'a';
        System.out.println();
        System.out.println("*Ejercicio N°7: ");
        for (int i = 1; i <= ksTamC7; i++) {
            if(i % 2 != 0 ){
                System.out.print(ksch + " ");
                ksch++;
            }
            else {
                if(i % 4 != 0 )
                    System.out.print("+ ");
                else
                    System.out.print("- ");
            }
        }
        System.out.println();
    }

    /*
     * Figura: 
     *                  *
     *                * *
     *              * * *
     *            * * * *
     *          * * * * *
     * @param ksTamFig4 : Tamano de la figura a mostrar
     * @param ksCaracFig4 : caracter que forma la figura 
     */
    void ksFigura4(int ksTamFig4, String ksCaracFig4) {
        System.out.println();
        System.out.println("*Ejercicio N°7: ");
        for (int i = 0; i < ksTamFig4; i++) {
            for (int j = 0; j < ksTamFig4 - i - 1; j++) {
                System.out.print("  "); 
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(ksCaracFig4 + " "); 
            }
            System.out.println();
        }
    }

    /*
     * Figura: 
     *                   _ _ _
     *             _ _ _|
     *       _ _ _|   
     * _ _ _|
     *          
     * @param ksTamFig8 : Tamano de la figura a mostrar
     */
    void ksFigura8(int ksTamFig8) {
        int ksVal1 = ksTamFig8;
        System.out.println();
        System.out.println("*Ejercicio N°8: ");
        for (int i = 0; i < ksTamFig8; i++) {
            for (int j = 0; j <=ksVal1 ; j++) {
                if (j == ksVal1)
                    System.out.print(" _ _ _|");
                else
                    System.out.print("       ");
            }
            ksVal1--;
            System.out.println();
        }
    }

    /*
     * Figura:
     * ...
     * 123456
     * 12345
     * 1234
     * 123
     * 12
     * 1
     *        
     * @param ksTamFig12 : Tamano de la figura a mostrar
     */
    void ksFigura12(int ksTamFig12) {
        int skTamColum = ksTamFig12;
        System.out.println();
        System.out.println("*Ejercicio N°12: ");
        for (int i = 1; i <= ksTamFig12; i++) {
            for (int j = 1; j <= skTamColum ; j++){
                System.out.print(j);
            }
            skTamColum--;
            System.out.println();
        }
        
    }
    /* 
     * Figura:
     * ...
     * 1              1
     *     0     0    
     *        1
     *     0     0
     * 1              1
     *        
     * @param ksTamFig16 : Tamano de la figura a mostrar 
     */
    void ksFigura16(int ksTamFig16) {
        System.out.println();
        System.out.println("*Ejercicio N°16: ");
        for (int i = 1; i <= ksTamFig16; i++) {
            for (int j = 1; j <= ksTamFig16; j++) {
                if ((i == j || i + j == ksTamFig16 + 1)) {
                    if (i % 2 == 0) {
                        System.out.print(" " + '0' + " ");
                    } else {
                        System.out.print(" " + '1' + " ");
                    }
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println();
        
    }

    
    
}
