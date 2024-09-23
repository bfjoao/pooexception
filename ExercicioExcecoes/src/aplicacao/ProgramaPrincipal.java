package aplicacao;

import java.util.Scanner;

import model.entidades.Conta;
import model.excecoes.BusinessException;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe os dados da conta");
		System.out.print("Número: ");
		int numero = sc.nextInt();
		System.out.print("Titular: ");
		sc.nextLine();
		String titular = sc.nextLine();
		System.out.print("Saldo inicial: ");
		double saldo = sc.nextDouble();
		System.out.print("Limite de saque: ");
		double limiteSaque = sc.nextDouble();
		
		Conta acc = new Conta(numero, titular, saldo, limiteSaque);
		
		System.out.println();
		System.out.print("Informe uma quantia para sacar: ");
		double quantia = sc.nextDouble();
		
		try {
		acc.saque(quantia);
		System.out.println("Novo saldo: " + String.format("%.2f", acc.getSaldo()));
		}
		catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();
	}

}
