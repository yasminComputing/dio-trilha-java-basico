import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: "Conhecer e importar a classe Scanner"
        var scanner = new Scanner(System.in);

        // Exibir as mensagens para nosso usuário
        // Obter pela scanner os valores digitados no terminar
        System.out.println("Por favor, digite o número da Agência !");
        int numero = scanner.nextInt();

        System.out.println("Agora,informe sua Agência !");
        String agencia = scanner.next();
        scanner.nextLine();

        System.out.println("Digite seu nome de cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por último, informe seu saldo R$: ");
        double saldo = scanner.nextDouble();
        
        // Exibir a mensagem conta criada
        System.out.println("Olá "+nomeCliente + ",obrigada por criar uma conta em nosso banco, sua agência é "+ agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");


        scanner.close();
    }
}
