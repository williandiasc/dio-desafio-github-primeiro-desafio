package ContaTerminal;

import java.util.Scanner;


public class ContaTerminal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nomeCliente = "Mario Andrade";
		double saldo = 237.48;
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Por favor, digite o número da Agência e depois aperte a tecla Enter: ");
		int agencia = scanner.nextInt();
		
		System.out.println("Por favor, digite o número da Conta e depois aperte a tecla Enter: ");
		int conta = scanner.nextInt();
		
		String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. " +
                "Sua agência é " + agencia + ", conta " + conta + " e seu saldo " +
                saldo + " já está disponível para saque.";
		
		System.out.println(mensagem);
		
	}

}
