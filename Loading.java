public class Loading {
    /*
     * \|/-| 0% a 100%
    */
    public void Ejercicio1LKS(){
        String[] spinerKS = { "\\" , "|" ,"/" ,"-" ,"|" };
        for (int i = 0; i <= 100; i++) {
            System.out.print("\r" + spinerKS[i % 4] + " " + i + "%" );
            try {
                Thread.sleep(67);
            } catch (Exception e) {
            }
        }
    }
        
    /*
     * [-           ] 20%
     * @param caracterKS caracter en el interior de los corchetes
    */
    public void Ejercicio3LKS(char caracterKS){
        int porcKS = 0;
        System.out.println();
        while (porcKS <= 100) {
            int ubCarKS = porcKS / 5,
                espKS = 20 - ubCarKS; 
            System.out.print("\r[");
            for (int i = 0; i < ubCarKS; i++)
                System.out.print(" ");
            System.out.print(caracterKS);
            for (int i = 0; i < espKS; i++)
                System.out.print(" ");
            try {
                System.out.print("] " + porcKS + "%");
                Thread.sleep(1000);
                porcKS += 5;
            } catch (Exception e) {
            }
           
        }
        System.out.println("\n");
    }

    /*
     * [     <=>        ] 20%
    */
    public void Ejercicio6KS(){
        int porcentaje=0;
        while (porcentaje <= 100) { 
            String flechaKS = "<=>"; 
            int ubKS = porcentaje/5,
                espKS = 20 - ubKS;
            System.out.print("\r[");
            for (int i = 0; i < ubKS; i++) 
                System.out.print(" ");
            System.out.print(flechaKS);
            for (int i = 0; i < espKS; i++)
                System.out.print(" ");
            try {
                System.out.print("] " + porcentaje + "%");
                Thread.sleep(1000);
                porcentaje += 5;
            } catch (Exception e) {
            }
        }
    }
}

