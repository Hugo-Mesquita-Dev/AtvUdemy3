import java.util.Scanner;

public class Q9 {

    /*
     * Ler um número inteiro N e
     * calcular todos os seus divisores.
     */

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("digite um numero: ");
        int n = sc.nextInt();

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                System.out.println("Divisores: " + i);
            }
        }

        sc.close();
    }
}
