package listExercicio01;

public class Main {

	public static void main(String[] args) {
		ListaDeTarefas listaDeTarefas = new ListaDeTarefas();
		
		//Testando os métodos.
		listaDeTarefas.adicionarTarefa("Tarefa teste 01");
		listaDeTarefas.adicionarTarefa("Tarefa teste 01");
		listaDeTarefas.adicionarTarefa("Tarefa teste 03");

		System.out.println("Total de tarefas cadastradas: " + listaDeTarefas.obterNumeroTotalDeTarefas());
		listaDeTarefas.exibirTarefas();
		
		listaDeTarefas.removerTarefa("TaRefa Teste 01");
		
		System.out.println("Total de tarefas após remoção de uma tarefa: " + listaDeTarefas.obterNumeroTotalDeTarefas());

		listaDeTarefas.exibirTarefas();
		
		
		

		
		

	}

}
