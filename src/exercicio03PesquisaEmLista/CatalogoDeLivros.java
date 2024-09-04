package exercicio03PesquisaEmLista;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CatalogoDeLivros {
	List<Livro> catalogo;
	
	
	public CatalogoDeLivros() {
		catalogo = new ArrayList<>();
	}
	
	
	public void adicionarLivro(Livro livro) {
		catalogo.add(livro);
	}
	
	
	public List<Livro> pesquisarPorAutor(String autor) {
		List<Livro> listaLivrosEncontrados = new ArrayList<>();
		Iterator<Livro> iterator = catalogo.iterator();
		
		while(iterator.hasNext()) {
			Livro livro = iterator.next();
			
			if(livro.getAutor().equalsIgnoreCase(autor)){
				listaLivrosEncontrados.add(livro);
			}
		}
		
		return listaLivrosEncontrados;
	}
	
	
	public List<Livro> pesquisaPorIntervaloEmAno(int anoInicial, int anoFinal) {
		List<Livro> listaLivrosEncontrados = new ArrayList<>();
		Iterator<Livro> iterator = catalogo.iterator();
		
		while(iterator.hasNext()) {
			Livro livro = iterator.next();
			
			if(livro.getAnoDePublicao() >= anoInicial && livro.getAnoDePublicao() <= anoFinal){
				listaLivrosEncontrados.add(livro);
			}
		}
		
		return listaLivrosEncontrados;
	}
	
	
	public Livro pesquisarPorTitulo(String titulo) {
		Livro livroPorTitulo = null;
		Iterator<Livro> iterator = catalogo.iterator();
		
		while(iterator.hasNext()) {
			Livro livro = iterator.next();
			
			if(livro.getTitulo().equalsIgnoreCase(titulo)){
				livroPorTitulo = livro;
				break;
			}
		}
		
		return livroPorTitulo;
	}	
	
}
