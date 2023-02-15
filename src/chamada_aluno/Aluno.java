package chamada_aluno;
import java.util.ArrayList;
import java.util.List;

public class Aluno {

	private List <String> listaAluno = new ArrayList<String>();
	
	private String nome;
	
	public void dadosAluno (String nome){
		this.nome = nome;
	}
	
	public void addAluno() {
		listaAluno.add(nome);
	}
	
	public void excluirAluno (){
		listaAluno.remove(nome);
	}
	
	public void mostrarAlunos() {
		for (String alunos : listaAluno) {
			System.out.println(alunos);
		}
	}
	
	public int quantidaAluno() {
		return listaAluno.size();
	}
	
	public String pegarDadosAlunos(int i) {
		
		String nome = this.listaAluno.get(i-1);
		return nome;
		
	}
	
	
	
	public List<String> getListaAluno() {
		return listaAluno;
	}
	

	public void setListaAluno(List<String> listaAluno) {
		this.listaAluno = listaAluno;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
