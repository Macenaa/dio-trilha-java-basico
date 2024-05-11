/**
 * <h1>ContaTerminal<h1/>
 * A conta terminal realiza operações interativas com o
 * objetivo de simular a criação de uma conta no banco. 
 * 
 * Leia Atentamente a documentação destas classes para desfrutar dos recursos
 * oferecidos pelo autor
 * 
 * @author Jessé Macena
 * @version 1.0
 * @since 11/05/2024
 */
import java.util.Locale;
import java.util.Scanner;
 

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o seu nome :");
        String nome = scanner.next();
        
        System.out.println("Por favor, digite o número da Agência :");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número da Conta :");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o seu Saldo :");
        double saldo = scanner.nextDouble();


        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }

}
