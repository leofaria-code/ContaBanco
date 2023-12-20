import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) {
        
        String nomeCliente;
        String agencia;
        int numeroConta;
        BigDecimal saldo = BigDecimal.valueOf(237.48);
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, digite o seu NOME!");
        nomeCliente = scanner.nextLine();
        
        System.out.println("Por favor, digite o NÚMERO da AGÊNCIA!");
        agencia = scanner.nextLine();
        
        System.out.println("Por favor, digite o NÚMERO da CONTA!");
        numeroConta = scanner.nextInt();
        
        scanner.close();
        
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco! %n" +
                "Sua agência é %s e sua conta é %d. %n" +
                "Seu saldo de R$ %.2f já está disponível para saque!",
                nomeCliente, agencia, numeroConta, saldo);
    }
    
}
