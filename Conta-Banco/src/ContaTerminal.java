import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        // Solicitando número da conta
        System.out.println("Por favor, digite o número da Conta:");
        numero = scanner.nextInt();

        // Limpando o buffer do scanner
        scanner.nextLine();

        // Solicitando agência
        System.out.println("Por favor, digite o número da Agência:");
        agencia = scanner.nextLine();

        // Solicitando nome do cliente
        System.out.println("Por favor, digite o nome do Cliente:");
        nomeCliente = scanner.nextLine();

        // Solicitando saldo
        System.out.println("Por favor, digite o saldo da conta:");
        saldo = scanner.nextDouble();

        // Exibindo os dados do cliente
        String mensagem = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", 
                                        nomeCliente, agencia, numero, saldo);

        System.out.println(mensagem);

        scanner.close();
    }
}
