import java.util.Scanner;
public class Banco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("digite o seu nome: ");
        String nome = sc.nextLine();

        System.out.printf("digite o numero da agencia: ");
        String numeroAgencia = sc.nextLine();

        System.out.printf("digite o numero da conta: ");
        int numeroConta = sc.nextInt();

        System.out.printf("digite o saldo da conta: ");
        double saldo = sc.nextDouble();


        System.out.println("Olá " + nome +  ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo de " + saldo + " já está disponível para saque.");
    }
}
