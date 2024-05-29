import java.util.Scanner;
public class KSSeriesCaracteres {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        System.out.println("~~~~SERIES DE CARACTERES~~~~");
        
        ksSC2();
        ksSC3();
        ksSC4();
        ksSC5();
        ksSC6();
        ksSC7();
        ksSC8();
        ksSC9();
        ksSC10();
    }
        private static void ksSC1(){
            int ksTamC1 =10;
            System.out.println();
            System.out.println("*Ejercicio N°1: ");
            for (int i = 0; i < ksTamC1; i++) {
                if (i % 2 == 0) 
                    System.out.print("- ");
                else
                    System.out.print("+ ");
            }
            sc.close();
            System.out.println();
        }

        private static void ksSC2() {
            int ksTam1 = 7, 
                ksSum  = 0, 
                ksVal1 = 0, 
                ksVal2 = 1;
            System.out.println();
            System.out.println("*Ejercicio N°2: ");
            for (int i = 0; i < ksTam1; i++) {
                for (int j = 0; j < ksSum; j++) {
                    System.out.print("*");
                }
                System.out.print(" ");
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

        private static void ksSC3() {
            /*int ksTam5 = 10;
            System.out.println("*Ejercicio N°5: ");
            for (int num = 2; num <= ksTam5; num++) {
                boolean ksNumPrim = true;
                if (num <= 1) {
                    ksNumPrim = false;
                } 
                else {
                    for (int i = 2; i <= Math.sqrt(num); i++) {
                        if (num % i == 0) {
                            ksNumPrim = false;
                            break;
                        }
                    }
                }
                if (ksNumPrim) {
                    for (int j = 0; j < ksNumPrim; j++) {
                        System.out.print("*");
                    }
                }
            }*/
            sc.close();
            System.out.println();
        }

        private static void ksSC4() {
            int ksTamC4 =5;
            System.out.println();
            System.out.println("*Ejercicio N°4: ");
            for (int i = 0; i < ksTamC4; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print("+ - * / ");
                }
            }
            sc.close();
            System.out.println();
        }

        private static void ksSC5() {
            int ksTamC5 = 5;
            System.out.println();
            System.out.println("*Ejercicio N°5: ");
            for (int i = 0; i < ksTamC5; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(" \\ | / - |");
                }
            }
            sc.close();
            System.out.println();
        }

        private static void ksSC6() {
            int ksTamC6 = 26;
            char ksch = 'a';
            System.out.println();
            System.out.println("*Ejercicio N°6: ");
            for (int i = 0; i < ksTamC6; i++) {
                    System.out.print(ksch + " ");
                    ksch++;
            }
            sc.close();
            System.out.println();
        }

        private static void ksSC7() {
            int ksTamC6 = 52;
            char ksch = 'a';
            System.out.println();
            System.out.println("*Ejercicio N°6: ");
            for (int i = 1; i < ksTamC6; i++) {
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
            sc.close();
            System.out.println();
        }

        private static void ksSC8() {
            int ksTamC8=10;
            char ksch = 'a';
            System.out.println();
            System.out.println("*Ejercicio N°8: ");
            for (int i = 1; i < ksTamC8; i++) {
                if(i % 2 == 0){
                    for (int j = 0; j < i; j++) {
                        System.out.print(ksch);
                    }
                    System.out.print(" ");
                    ksch++;
                }
            }
            sc.close();
            System.out.println();
        }

        private static void ksSC9() {
            int ksTamC8=10;
            char ksch = 'a';
            System.out.println();
            System.out.println("*Ejercicio N°9: ");
            for (int i = 1; i < ksTamC8; i++) {
                if(i % 2 != 0){
                    for (int j = 0; j < i; j++) {
                        System.out.print(ksch);
                    }
                    System.out.print(" ");
                    ksch++;
                }
            }
            sc.close();
            System.out.println();
        }

        private static void ksSC10() {
            sc.close();
            System.out.println();
        }
    
}