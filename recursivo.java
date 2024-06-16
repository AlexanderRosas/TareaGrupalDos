public class recursivo {
    public void Ejercicio1RKS( int numFacKS){
        for (int i = 1; i <= numFacKS; i++) {
            System.out.print( factorial(i) + " ");
        }
    }

    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}

