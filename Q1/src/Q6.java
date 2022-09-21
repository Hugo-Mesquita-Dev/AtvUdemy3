import java.util.Locale;
import java.util.Scanner;

public class Q6 {

    /*
     * Leia 1 valor inteiro N, que representa o número de casos de teste que vem a
     * seguir. Cada caso de teste consiste
     * de 3 valores reais, cada um deles com uma casa decimal. Apresente a média
     * ponderada para cada um destes
     * conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo
     * valor tem peso 3 e o terceiro valor tem
     * peso 5
     */

    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite n: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("digite a: ");
            double valor1 = sc.nextDouble();
            System.out.println("digite b: ");
            double valor2 = sc.nextDouble();
            System.out.println("digite c: ");
            double valor3 = sc.nextDouble();

            double media = (valor1 * 2.0 + valor2 * 3.0 + valor3 * 5.0) / 10.0;

            System.out.println(media);
        }

        sc.close();
    }
}
