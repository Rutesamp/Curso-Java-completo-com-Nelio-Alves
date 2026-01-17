package application;

import java.util.Scanner;

public class EstruturaRepCon {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n, multiplicado;
		
		System.out.println("Digite um número inteiro: ");
		n = sc.nextInt();
		
		if (n < 0 || n > 100) {
			
			System.out.println("Erro. Digite um número inteiro que seja maior que 0 e menor que 100: "); 
			while (n <0 || n >100) {
				n = sc.nextInt();
			}
		}
		
		int contador = 0;
		while (contador < 11) {
			multiplicado = n * contador;
			System.out.printf("%dx%d: %d%n", n, contador, multiplicado);
			contador ++;
		}
		
		sc.close();
	}

}
