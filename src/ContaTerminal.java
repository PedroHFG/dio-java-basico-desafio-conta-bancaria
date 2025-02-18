import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numeroConta;
        String agencia;
        String nomecliente;
        double saldo;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, digite o número da Agência: ");
        agencia = sc.nextLine();
        System.out.print("Digite o número da Conta: ");
        numeroConta = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite o nome do cliente: ");
        nomecliente = sc.nextLine();
        System.out.print("Digite o saldo da Conta: ");
        saldo = sc.nextDouble();

        String dadosConta = imprimeDadosConta(agencia, numeroConta, nomecliente, saldo);
        System.out.println(dadosConta);
        sc.close();
    }

    public static String imprimeDadosConta(String agencia, int numeroConta, String nomeCliente, double saldo) {
        return "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.";
    }
}