package chamada_aluno;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

	List <String> listaAluno = new ArrayList <String>();
	
	private String nome;
	private int id;
	
	public void dadosAluno (String nome, int id){
		this.nome = nome;
		this.id = id;
		addAluno();
	}
	
	public void addAluno() {
		listaAluno.add(nome);
		System.out.println("Aluno = " + listaAluno.get(0));
	}
	
	public void excluirAluno (){
		
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
	
	
}
