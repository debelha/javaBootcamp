//Desafio: https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/sintaxe

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("CONTA:");
        int numero = scanner.nextInt();
        scanner.nextLine();  // Consumir a nova linha

        System.out.println("AGÊNCIA");
        String agencia = scanner.nextLine();

        System.out.println("NOME:");
        String nomeCliente = scanner.nextLine();

        System.out.println("SALDO");
        double saldo = scanner.nextDouble();

        // Mensagem final
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia 
            + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";

        System.out.println(mensagem);

        scanner.close();
    }
}

