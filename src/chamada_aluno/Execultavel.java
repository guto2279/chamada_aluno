package chamada_aluno;
import java.util.Scanner;

public class Execultavel {
	
	public static void main (String [] args) {
		
		Aluno aluno = new Aluno();
		Scanner scanner = new Scanner (System.in);
		
		String nome = "None";
		int opcaoAdcionar;
		
		
		do {
			System.out.println("--------------------------------");
			System.out.println("       Cadastro de Alunos       ");
			System.out.println("--------------------------------");
			System.out.println("Selecione uma opção: ");
			System.out.println("1 - Cadastro de Aluno");
			System.out.println("2 - Excluir aluno cadastrado");
			System.out.println("3 - Mostrar Alunos cadastrados");
			System.out.println("0 - Sair");
			opcaoAdcionar = scanner.nextInt();
			
			if (opcaoAdcionar == 1) {
				
				System.out.println("Digite o nome do aluno: ");
				nome = scanner.next();
		
				aluno.dadosAluno(nome);
				aluno.addAluno();
			}else if (opcaoAdcionar == 2) {
				System.out.println("Digite o nome do Aluno: ");
				nome = scanner.next();
				
				aluno.dadosAluno(nome);
				aluno.excluirAluno();
			}else if (opcaoAdcionar == 3) {
				
				aluno.mostrarAlunos();
			}
			
		}while (opcaoAdcionar != 0);
		
	}
}
