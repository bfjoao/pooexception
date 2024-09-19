package aplicacao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		try {
		String vect[] = sc.nextLine().split(" ");
		int posicao = sc.nextInt();
		System.out.println(vect[posicao]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posição inválida!");
		}
		catch (InputMismatchException e) {
			System.out.println("Erro no input!");
		}
		
		System.out.println("Fim do programa!");
		
		sc.close();
	}

}
