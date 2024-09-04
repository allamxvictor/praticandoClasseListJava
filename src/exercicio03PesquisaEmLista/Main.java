package exercicio03PesquisaEmLista;

public class Main {

	public static void main(String[] args) {
		CatalogoDeLivros catalogo = new CatalogoDeLivros();
		
		catalogo.adicionarLivro(new Livro("Um estudante de Java", "Allan Victor", 2022));
		catalogo.adicionarLivro(new Livro("Java e Orientação a Objetos", "Mariazinha", 2023));
		catalogo.adicionarLivro(new Livro("Programando em Java para Web", "Marquinho", 2006));
		catalogo.adicionarLivro(new Livro("Programando em Java para Web", "Marquinho", 2006)); // duplicado para testar se retorna apenas a primeira ocorrência
		catalogo.adicionarLivro(new Livro("Java e JSP", "Joãozinho", 2015));

		//Testando os métodos: 
		System.out.println("Retorno da pesquisa por título:");
		System.out.println(catalogo.pesquisarPorTitulo("Programando em Java para Web"));
		System.out.println(catalogo.pesquisarPorTitulo("Java e JSP"));
		
		System.out.println();
		System.out.println("Retorno da pesquisa por autor: ");
		System.out.println(catalogo.pesquisarPorAutor("Allan Victor"));
		System.out.println(catalogo.pesquisarPorAutor("mariazinha"));
		System.out.println();
		
		System.out.println("Retorno da pesquisa por intervalo de lançamento (2015-2023)");
		System.out.println(catalogo.pesquisaPorIntervaloEmAno(2015, 2023));

		
		

	}

}
