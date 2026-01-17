package application;

import java.util.Locale;
import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, nmenores;
		double somaAltura, alturaMedia, porcentagem; 
		
		System.out.print("Quantas pessoas serao digitadas? ");
		n = sc.nextInt();
		
		String[] nomes = new String [n];
		int[] idades = new int [n];
		double[] alturas = new double [n];
		
		for (int i=1; i<n; i++) {
			System.out.printf("Dados da %da pesspa:\n", i + 1);
			System.out.print("Nome:");
			nomes[i] = sc.next();
			System.out.print("Idade:");
			idades[i] = sc.nextInt();
			System.out.print("Altura");
			alturas[i] = sc.nextDouble();
		}
		
		nmenores = 0;
		somaAltura = 0;
		for (int i=0; i<n; i++) {
			if (idades[i] < 16) {
				nmenores++;
			}
 			somaAltura = somaAltura + alturas[i];
		}
		
		alturaMedia = somaAltura/n;
		porcentagem = ((double)nmenores / n) * 100.0;
		
		System.out.printf("\nAltura media = %.2f\n", alturaMedia);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", porcentagem);
		
		for (int i=0; i<n; i++) {
			if (idades[i] < 16) {
				System.out.printf("%s\n", nomes[i]);
			}
		}
		
		sc.close();
	}

}
