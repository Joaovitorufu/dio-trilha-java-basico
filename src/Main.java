import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nomeCliente, agencia;
        int numeroConta;
        double saldo;

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da agencia");
        agencia = sc.next();
        System.out.println("Por favor, digite o seu nome");
        nomeCliente = sc.next();
        System.out.println("Por favor, digite o número da conta");
        numeroConta = sc.nextInt();
        System.out.println("Por favor, digite o saldo da conta");
        saldo = sc.nextDouble();

        System.out.println(STR."Olá \{nomeCliente}, obrigado por criar uma conta em nosso banco, sua agência é \{agencia}, conta \{numeroConta} e seu saldo \{saldo} já está disponivel para saque.");

    }
}