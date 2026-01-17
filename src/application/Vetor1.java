//A dona de um pensionato possui dez quartos para alugar para estudantes
package application;

import java.util.Scanner;

import entites.Pensionato;

public class Vetor1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Pensionato[] vect = new Pensionato[10];
		
		System.out.print("Quantos quartos foram alugados? ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println();
			System.out.println("Estudante #" + i);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Quarto: ");
			int quarto = sc.nextInt();
			sc.nextLine();
			vect[quarto] = new Pensionato(nome, email);
		}
		
		System.out.println();
		System.out.println("Quartos ocupados:");
		
		for (int i = 0; i<10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		
		sc.close();
	}

}
