import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite sua agência: ");
        String agencia = scanner.nextLine();
        System.out.print("Digite o número da conta: ");
        int numero = scanner.nextInt();
        System.out.print("Digite seu saldo: ");
        float saldo = scanner.nextFloat();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque",
                nome, agencia, numero, saldo);
    }
}