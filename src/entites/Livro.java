package entites;

public class Livro {
	
	private String titulo;
	private String autor;
	private int anoPublicado;
	private boolean disponivel;
	
	public Livro(String titulo, String autor, int anoPublicado) {
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicado = anoPublicado;
		this.disponivel = true;
	}

	public Livro(String titulo) {
		this(titulo, "Desconhecido", 0);
	}

	public String getTitulo() {
		return titulo;
	}


	public String getAutor() {
		return autor;
	}


	public int getAnoPublicado() {
		return anoPublicado;
	}


	public boolean isDisponivel() {
		return disponivel;
	}
	
	public void emprestar () {
		if (this.disponivel) {
			this.disponivel = false;
			System.out.println("O livro '" + this.titulo + "' foi emprestado com sucesso.");
		} else {
			System.out.println("ERRO: O livro '" + this.titulo + "' já está emprestado.");
		}
	}
	
	public void devolver () {
		if (!this.disponivel) {
			this.disponivel = true;
			System.out.println("O livro '" + this.titulo + "' foi devolvido com sucesso.");
		} else {
			System.out.println("AVISO: O livro '" + this.titulo + "' já estava disponivel.");
		}
	}

}
