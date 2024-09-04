package listExercicio01;

public class Tarefa {
	private String descricao;
	
	public Tarefa() {
		
	}
	
	public Tarefa(String descricao) {
		setDescricao(descricao);
	}
	
	@Override
	public String toString() {
		return descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
