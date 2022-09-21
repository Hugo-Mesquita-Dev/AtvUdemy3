import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de X: ");
        int x = sc.nextInt();

        System.out.println("Digite o valor de Y: ");
        int y = sc.nextInt();

        while (x != 0 || y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("primeiro");
            } else if (x > 0 && y < 0) {
                System.out.println("quarto");
            } else if (x < 0 && y < 0) {
                System.out.println("terceiro");
            } else if (x < 0 && y > 0) {
                System.out.println("Segundo");
            }
            x = sc.nextInt();
            y = sc.nextInt();
        }

        System.out.println(" ");

        sc.close();
    }
}
