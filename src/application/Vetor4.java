package application;

import java.util.Locale;
import java.util.Scanner;

public class Vetor4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		int n;
		double soma, media;
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		n = sc.nextInt();
		
		double[] nReal = new double[n];
		
		for (int i=0; i<n; i++) {
			System.out.print("Digite um numero: ");
			nReal[i] = sc.nextDouble(); 
		}
		
		soma = 0;
		for (int i=0; i<n; i++) {
			soma = soma + nReal[i];
		}
		
		media= soma/n;
		
		System.out.printf("\nMEDIA DO VETOR = %.3f\n" + media);
        System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
        
		for (int i=0; i<n; i++) {
			if (nReal[i] < media) {
				System.out.printf("%.1f\n", nReal[i]);
			}
		}		
		sc.close();
		
	}

}
