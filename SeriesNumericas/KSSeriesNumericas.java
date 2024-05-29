import java.util.Scanner;
public class KSSeriesNumericas{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        System.out.println("~~~~SERIES NUMERICAS~~~~");
        ksSN1();
        ksSN2();
        ksSN3();
        ksSN4();
        ksSN5();
        ksSN6();
        ksSN7();
        ksSN8();
        ksSN9();
        ksSN10();
        ksSN11();
    }

    public static void ksSN1(){
        int ksTam1 = 10, 
            ksSum  = 0, 
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
        sc.close();
        System.out.println();
    }

    private static void ksSN2() {
        int ksTam2=10;
        System.out.println();
        System.out.println("*Ejercicio N°2: ");
        for (int i = 0; i < ksTam2; i++) {
            if( i % 2 != 0)
                System.out.print(i + " ");
            else
                System.out.print("0 ");
            
        }
        sc.close();
        System.out.println();
    }

    private static void ksSN3() {
        int ksTam1 = 10, 
            ksSum  = 0, 
            ksVal1 = 0, 
            ksVal2 = 1;
        System.out.println();
        System.out.println("*Ejercicio N°3: ");        
        for (int i = 0; i < ksTam1; i++) {
            if( i % 2 != 0){
                System.out.print(ksSum + "/" + i + " ");
                if(ksSum ==0)
                    ksSum += 1;
                else{
                    ksSum   = ksVal1 + ksVal2;
                    ksVal1  = ksVal2;
                    ksVal2  = ksSum;
                }
            }
        }
        sc.close();
        System.out.println();
        
    }

    private static void ksSN4(){
        int ksTam1 = 10, 
            ksSum  = 0, 
            ksVal1 = 0, 
            ksVal2 = 1;
        System.out.println();
        System.out.println("*Ejercicio N°4: ");        
        for (int i = 0; i < ksTam1; i++) {
            if( i % 2 == 0){
                System.out.print(ksSum + "/" + i + " ");
                if(ksSum ==0)
                    ksSum += 1;
                else{
                    ksSum   = ksVal1 + ksVal2;
                    ksVal1  = ksVal2;
                    ksVal2  = ksSum;
                }
            }
        }
        sc.close();
        System.out.println();
    }

    private static void ksSN5() {
        int ksTam5 = 15;
        System.out.println();
        System.out.println("*Ejercicio N°5: ");
        for (int num = 2; num <= ksTam5; num++) {
            boolean ksNumPrim = true;
            if (num <= 1) {
                ksNumPrim = false;
            } else {
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        ksNumPrim = false;
                        break;
                    }
                }
            }
            if (ksNumPrim) {
                System.out.print(num + " ");
            }
        }
        sc.close();
        System.out.println();
    }

    private static void ksSN6() {
        int ksTam6 = 10, 
            ksSum6 = 0;
        System.out.println();
        System.out.println("*Ejercicio N°6: ");
        for (int i = 0; i < ksTam6; i++) {
            if(i % 2 != 0){
                ksSum6 +=i; 
                System.out.print(ksSum6 + " ");  
            }
        }
        sc.close();
        System.out.println();
    }

    private static void ksSN7() {
        int ksTam7 = 10, 
            ksSum7 = 1;
        System.out.println();
        System.out.println("*Ejercicio N°7: ");
        for (int i = 1; i < ksTam7; i++) {
            System.out.print(ksSum7 + " ");
            ksSum7 +=3;
        }
        sc.close();
        System.out.println();
        
    }

    private static void ksSN8() {
        int ksTam8 = 10, 
            ksSum8 = 3;
        System.out.println();
        System.out.println("*Ejercicio N°8: ");
        for (int i = 1; i < ksTam8; i++) {
            System.out.print(ksSum8 + " ");
            ksSum8 +=5;
        }
        sc.close();
        System.out.println();
    }

    private static void ksSN9() {
        int ksTam9 = 10, 
            ksSum9 = 2;
        System.out.println();
        System.out.println("*Ejercicio N°9: ");
        for (int i = 0; i < ksTam9; i++) {
            System.out.print(ksSum9 + " ");
            ksSum9 *= 2;
        }
        sc.close();
        System.out.println();
    }

    private static void ksSN10() {
        int ksTam10 = 10, 
            ksSum10 = 3;
        System.out.println();
        System.out.println("*Ejercicio N°10: ");
        for (int i = 0; i < ksTam10; i++) {
            System.out.print(ksSum10 + " ");
            ksSum10 *= 3;
        }
        sc.close();
        System.out.println();
    }

    private static void ksSN11() {
        int ksTam11    = 3, 
            ksSum11    = 2,
            ksSumTot11 = 2;
        System.out.println();
        System.out.println("*Ejercicio N°11: ");
        for (int i = 0; i < ksTam11; i++) {
            for (int j = 0; j <= 4; j++) {
                System.out.print(ksSum11 + " ");
                ksSum11 += ksSumTot11*2;
                ksSumTot11++;
            }
        }
        sc.close();
        System.out.println();
    }
}
