import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RiosMarco riosMarco = new RiosMarco();

        System.out.println("¿Cuántos términos de cada serie quieres imprimir?");
        int n = sc.nextInt();

        System.out.println("Serie SN3:");10
        riosMarco.rmSN3(n);

        System.out.println("Serie SN7:");
        riosMarco.rmSN7(n);

        System.out.println("Serie SN11:");
        riosMarco.rmSN11(n);
        
        System.out.println("Serie SC1:");
        riosMarco.rmSC1(n);

        System.out.println("Serie SC5:");
        riosMarco.rmSC5(n);

        sc.close();
    }
}
