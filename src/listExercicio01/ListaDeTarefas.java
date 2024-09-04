package listExercicio01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListaDeTarefas {
	private List<Tarefa> listaDeTarefas;
	
	public ListaDeTarefas() {
		listaDeTarefas = new ArrayList<>();
	}

	public List<Tarefa> getListaDeTarefas() {
		return listaDeTarefas;
	}

	public void adicionarTarefa(String descricao) {
		listaDeTarefas.add(new Tarefa(descricao));
	}
	
	public void removerTarefa(String descricao) {
        Iterator<Tarefa> iterator = listaDeTarefas.iterator();
        
        while(iterator.hasNext()) {
        	Tarefa tarefa = iterator.next();
        	
        	if(tarefa.getDescricao().equalsIgnoreCase(descricao)) {
        		iterator.remove();
        	}
        } 
	}
	
	public int obterNumeroTotalDeTarefas() {
		return listaDeTarefas.size();
	}
	
	public void exibirTarefas() {
		System.out.println(listaDeTarefas);
		
	}

	
}
