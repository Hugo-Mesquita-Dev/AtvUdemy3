import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int n = sc.nextInt();

        int primeiro;
        int quad;
        int cubo;

        for (int i = 1; i <= n; i++) {

            primeiro = i;

            quad = i * i;

            cubo = i * i * i;

            System.out.printf("%d %d %d%n", primeiro, quad, cubo);
        }

        sc.close();
    }
}
