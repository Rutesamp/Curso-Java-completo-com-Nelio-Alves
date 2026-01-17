package application;

import java.util.Locale;
import java.util.Scanner;

public class Vetor5 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, soma= 0, npares= 0;
		double media;
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		n = sc.nextInt();
		
		int[] vetor = new int[n];
		
		for (int i=0; i<n; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextInt();
		}
		
		for (int i=0; i<n; i++) {
			if (vetor[i] % 2 == 0) {
				soma = soma + vetor[i];
				npares++;
			}
		}
		
		media = soma/n;
		
			if (npares == 0) {
				System.out.println("NENHUM NUMERO PAR");
			} 
			else {
				media = (double)soma / npares;
				
				System.out.printf("MEDIA DOS PARES: %.1f\n", media);
			}
		
		sc.close();
	}
}
