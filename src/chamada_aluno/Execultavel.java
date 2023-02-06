package chamada_aluno;
import java.util.Scanner;

public class Execultavel {
	
	public static void main (String [] args) {
		
		Aluno aluno = new Aluno();
		Scanner scanner = new Scanner (System.in);
		
		String nome = "None";
		int ID, opcaoAdcionar;
		
		
		do {
			System.out.println("--------------------------------");
			System.out.println("       Cadastro de Alunos       ");
			System.out.println("--------------------------------");
			System.out.println("Selecione uma opção: ");
			System.out.println("1 - Continuar cadastrando");
			System.out.println("0 - Sair");
			opcaoAdcionar = scanner.nextInt();
			
			if (opcaoAdcionar == 1) {
				
				System.out.println("Digite o nome do aluno: ");
				nome = scanner.next();
				System.out.println("Digite o ID do aluno: ");
				ID = scanner.nextInt();
		
				aluno.dadosAluno(nome, ID);
			}
			
		}while (opcaoAdcionar != 0);
		
	}
}
