import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int number = 0;
        String agency = "", clientName = "";
        double balance = 0;

        System.out.print("Bem-vindo!\nPor favor, digite o número da agência: ");
        agency = scanner.nextLine();

        System.out.print("Agora entre com seu nome: ");
        clientName = scanner.nextLine();

        System.out.print("Ótimo! Agora seu número, por favor: ");
        number = scanner.nextInt();

        System.out.print("Agora para finalizar, o saldo da conta: R$");
        balance = scanner.nextDouble();

        System.out.println("\nOlá " + clientName + ", obrigado por criar uma conta em nosso banco!");
        System.out.println("\nSeus dados são: ");
        System.out.println("\tAgência: " + agency);
        System.out.println("\tNúmero: " + number);
        System.out.printf("\tSaldo: R$%.2f\n", balance);

        scanner.close();
    }
}
