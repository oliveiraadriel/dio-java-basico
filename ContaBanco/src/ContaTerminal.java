import java.util.Scanner;

public class ContaTerminal {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private String saldo;

    public ContaTerminal(int numero, String agencia, String nomeCliente, String saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public void exibirMensagem() {
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta " + numero + " e seu saldo de " + saldo + " já está disponível para saque.");
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Bem-vindo ao sistema bancário!");
            System.out.println("Por favor, digite o número da conta:");
            int numeroConta = scanner.nextInt();

            scanner.nextLine(); // Limpar o buffer do scanner

            System.out.println("Por favor, digite o número da agência:");
            String numeroAgencia = scanner.nextLine();

            System.out.println("Por favor, digite o nome do cliente:");
            String nomeCliente = scanner.nextLine();

            System.out.println("Por favor, digite o saldo inicial da conta:");
            String saldoInicial = scanner.nextLine();

            ContaTerminal conta = new ContaTerminal(numeroConta, numeroAgencia, nomeCliente, saldoInicial);
            conta.exibirMensagem();
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }
    }
}
