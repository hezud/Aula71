package application;

import java.util.Scanner;

import hospedagem.Locacao;

public class Program {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = 0;

		System.out.print("How many rooms will be rented? ");
		n = sc.nextInt();

		Locacao locacao[] = new Locacao[10];

		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.printf("Rent #%d:%n", i + 1);
			System.out.print("Name: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Email: ");

			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			locacao[room - 1] = new Locacao(nome, email);
		}
		System.out.println();
		System.out.println("Busy rooms:");
		for (int i = 0; i < locacao.length; i++) {
			if (locacao[i] != null) {
				System.out.printf("%d: %s, %s%n", i + 1, locacao[i].getNome(), locacao[i].getEmail());
			}
		}

		sc.close();
	}

}
