import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o numero da conta : ");
        int numeroDaConta  = scanner.nextInt();

        System.out.println("Digite a Agencia : ");
        String agencia = scanner.next();

        System.out.println( "Digite o Nome do Cliente : ");
        String nomeCliente = scanner.next();

        double decimal = 237.48 ;


        System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco,");
        System.out.println("sua agência é : " + agencia );
        System.out.println("Sua conta e : "+ numeroDaConta );
        System.out.println(" seu saldo e de  " + decimal + " e já está disponível para saque");
        


    


        
    }



}
