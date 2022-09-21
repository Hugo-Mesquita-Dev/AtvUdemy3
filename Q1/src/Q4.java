import java.util.Scanner;

public class Q4 {
    /*
     * Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1
     * até X,
     * um valor por linha, inclusive o
     * X, se for o caso.
     */
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int x = sc.nextInt();

        for (int i = 1; i < x; i = i + 2) {
            System.out.println("Saída: " + i);
        }

        sc.close();
    }

}
