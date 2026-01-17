package application;

import java.util.Scanner;

public class Vetor2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n, nPares;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		
		int [] vect = new int[n];
		
		for (int i=0; i<n; i++) {
			System.out.print("Digite um numero: ");
			vect [i] = sc.nextInt();
		}
		
		nPares=0;
		System.out.println("\nNUMEROS PARES: ");
		for (int i=0; i<n; i++) {
			if (vect[i] % 2 == 0) {
				System.out.printf("%d ", vect[i]);
				nPares++;
			}
		}
		
		System.out.printf("\n\nQUANTIDADE DE PARES = %d\n",  nPares);
		
		sc.close();
	}

}
