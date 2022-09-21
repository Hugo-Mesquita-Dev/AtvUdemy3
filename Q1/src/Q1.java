import java.util.Scanner;

import javax.swing.JOptionPane;

public class Q1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a senha: ");
        int senha = sc.nextInt();

        while (senha != 2002) {
            System.out.println("Senha Inválida");
            senha = sc.nextInt();
        }

        JOptionPane.showMessageDialog(null, "Acesso Permitido");

        sc.close();
    }
}
