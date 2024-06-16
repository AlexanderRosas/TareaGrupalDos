

public class Series {
    public void Ejercicio1KS(String Frase){
        int contador = 0;
        for (int i = 0; i < Frase.length(); i++) {
            char vocal = Character.toLowerCase(Frase.charAt(i));
            if ( vocal == 'a' ||
                 vocal == 'e' || 
                 vocal == 'i' ||
                 vocal == 'o' ||
                 vocal == 'u' ){
                contador++;
            }
        }
        System.out.println("La cantidad de vocales en la frase es: " + contador);
        
    }
   
     public void Ejercicio4KS(String frase2, String elimLet){
        char letraElim = elimLet.charAt(0);
        System.out.print("Salida: ");
        for (int i = 0; i < frase2.length(); i++) {
            char c = frase2.charAt(i);
            if (c != letraElim) {
                System.out.print(c);
            }else{
                System.out.print(" ");
            }
        }
     }
}
          