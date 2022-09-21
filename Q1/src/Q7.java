import java.util.Scanner;

public class Q7 {

    /*
     * Fazer um programa para ler um número N. Depois leia N pares de números e
     * mostre a divisão do primeiro pelo
     * segundo. Se o denominador for igual a zero,
     * mostrar a mensagem "divisao impossivel"
     */

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("digite um numero: ");

        double n = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        double b = sc.nextInt();

        double div;

        for (int i = 0; i < n; i++) {
            if (n > 0 && b > 0) {
                div = n / b;
                System.out.printf("resultado: %.1f%n", div);
            } else {
                System.out.println("Divisão impossível");
            }
        }

        sc.close();
    }
}
