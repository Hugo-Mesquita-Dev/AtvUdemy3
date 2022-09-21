import java.util.Scanner;

public class Q8 {

    /*
     * Ler um valor N. Calcular e escrever seu respectivo
     * fatorial.
     * Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
     * Lembrando que, por definição, fatorial de 0 é 1.
     */

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("digite um numero: ");
        int n = sc.nextInt();

        int fat = 1;

        for (int i = 1; i <= n; i++) {
            fat = fat * i;
        }

        System.out.print("O valor fatorial é : " + fat);

        sc.close();
    }
}
