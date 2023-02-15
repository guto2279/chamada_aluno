package chamada_aluno;

import java.util.Scanner;

public class MostrarTela {
		
		Scanner scanner = new Scanner(System.in);
		int escolha;
		
		public int opcaoSistema() {

			System.out.println("--------------------------------");
			System.out.println("      Sistema de Chamadas       ");
			System.out.println("--------------------------------");
			System.out.println("Selecione uma opção: ");
			System.out.println("1 - Cadastro de Aluno");
			System.out.println("2 - Realizar Chamadas");
			System.out.println("3 - Calendário");
			System.out.println("0 - Sair");
			escolha = scanner.nextInt();
			return escolha;
			
		}
		
		public int opcaoAdicionar(){
			
			System.out.println("--------------------------------");
			System.out.println("       Cadastro de Alunos       ");
			System.out.println("--------------------------------");
			System.out.println("Selecione uma opção: ");
			System.out.println("1 - Cadastrar Aluno");
			System.out.println("2 - Excluir aluno cadastrado");
			System.out.println("3 - Mostrar Alunos cadastrados");
			System.out.println("0 - Sair");
			escolha = scanner.nextInt();
			return escolha;
			
		}
		
		public int opcaoChamada() {
			
			System.out.println("--------------------------------");
			System.out.println("            Chamadas            ");
			System.out.println("--------------------------------");
			System.out.println("Selecione uma opção: ");
			System.out.println("1 - Chamar um aluno");
			System.out.println("0 - Sair");
			
			return escolha;
		}
		
}
