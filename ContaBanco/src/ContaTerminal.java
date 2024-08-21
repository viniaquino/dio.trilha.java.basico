import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    private int numeroConta;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public void abrirConta() {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Por favor, digite o número da conta: ");
        this.numeroConta = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Por favor, digite o numero da agência: ");
        this.agencia = scanner.nextLine();
        
        System.out.println("Por favor, digite o nome do titular da conta: ");
        this.nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo inicial: ");
        this.saldo = scanner.nextDouble();

        System.out.println("Olá " + this.nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
        + this.agencia + ", conta " + this.numeroConta + " e seu saldo " + this.saldo + " já está disponível para saque.");
    }

    public static void main(String[] args) {
        ContaTerminal conta = new ContaTerminal();
        conta.abrirConta();
    }

}

