package application;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaSeqCon {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double valorHora, salarioBruto, imposto, salarioLiquido;
		int horasTrabalhadas;
		
		System.out.print("Digite o valor das horas trabalhadas");
		valorHora = sc.nextDouble();
		
		System.out.println("Digite o número de horas trabalhadas no mês");
		horasTrabalhadas = sc.nextInt();
		
		salarioBruto = valorHora * horasTrabalhadas;
		
		if (salarioBruto > 2000 || salarioBruto <= 5000) {
			imposto = salarioBruto * 15 / 100;
		} else {
			imposto = salarioBruto * 25 / 1000; 
		}
		
		salarioLiquido = salarioBruto - imposto;
		
		System.out.printf("O salario bruto é R$ %.2f, o valor do imposto é R$ %.2f, e o valor do salario liquido é %.2f%n", salarioBruto, imposto, salarioLiquido);
		
		sc.close();
	}

}
