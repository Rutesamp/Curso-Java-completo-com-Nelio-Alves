package application;


import entites.Livro;



public class Poo {

	public static void main(String[] args) {
				
		System.out.println("--- 1. Criando Livro com Construtor Completo ---");
		Livro livro1 = new Livro("O Essencialismo", "Greg McKeonw", 2014);
		
		System.out.println("Título: " + livro1.getTitulo() + " | Disponível: " + livro1.isDisponivel());
		
		System.out.println("\n--- 2. Criando Livro com Sobrecarga ---");
		Livro livro2 = new Livro ("Java para Iniciantes");
		
		System.out.println("Título: " + livro2.getTitulo() + " | Autor Padrão: " + livro2.getAutor());
		
		System.out.println("\n--- 3. Testando Empréstimo e Devolução ---");
		
		livro1.emprestar();
		
		livro1.emprestar();
		
		livro2.devolver();
		
		livro2.devolver();
	}

}
