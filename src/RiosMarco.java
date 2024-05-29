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
}