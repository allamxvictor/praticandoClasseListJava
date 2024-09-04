package exercicio03PesquisaEmLista;

public class Livro {
	private String titulo;
	private String autor;
	private int anoDePublicao;
	
	
	public Livro() {
		
	}
	
	
	public Livro(String titulo, String autor, int anoDePublicacao) {
		this.titulo = titulo;
		this.autor = autor;
		this.anoDePublicao = anoDePublicacao;
	}
	
	@Override
	public String toString() {
		return "\n Livro: " + titulo + "\n" +
				" Autor: " + autor + "\n" +
				" Ano de publicação: " + anoDePublicao + "\n";
	}
	
	
	public String getTitulo() {
		return titulo;
	}
	
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	
	public String getAutor() {
		return autor;
	}
	
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	
	public int getAnoDePublicao() {
		return anoDePublicao;
	}
	
	
	public void setAnoDePublicao(int anoDePublicao) {
		this.anoDePublicao = anoDePublicao;
	}
	
	
}
