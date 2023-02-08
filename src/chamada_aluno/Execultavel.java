package chamada_aluno;
import java.util.Scanner;

public class Execultavel {
	
	public static void main (String [] args) {
		
		Aluno aluno = new Aluno();
		Presenca presenca = new Presenca();
		MostrarTela  mostrarTela = new MostrarTela();
		Scanner scanner = new Scanner (System.in);
	
		int opcaoAdcionar, opcaoSistema, opChamada, dia = 0;
		String nome;
		
		do {
			aluno.mostrarAlunos();
			opcaoSistema = mostrarTela.opcaoSistema();
			
			if (opcaoSistema == 1) {
				do {
					
					opcaoAdcionar = mostrarTela.opcaoAdicionar();;
					
					if (opcaoAdcionar == 1) {
						
						System.out.println("Digite o nome do aluno: ");
						nome = scanner.nextLine();
				
						aluno.dadosAluno(nome);
						aluno.addAluno();
					}else if (opcaoAdcionar == 2) {
						System.out.println("Digite o nome do Aluno: ");
						nome = scanner.nextLine();
						
						aluno.dadosAluno(nome);
						aluno.excluirAluno();
					}else if (opcaoAdcionar == 3) {
						
						aluno.mostrarAlunos();
					}
					
				}while (opcaoAdcionar != 0);
			}else if (opcaoSistema == 2) {
				do {
					System.out.println("--------------------------------");
					System.out.println("            Chamadas            ");
					System.out.println("--------------------------------");
					System.out.println("Selecione uma opção: ");
					System.out.println("1 - Chamar um aluno: ");
					System.out.println("0 - Sair");
					
					opChamada = scanner.nextInt();	
					
					if (opChamada == 1) {
						presenca.chamada(aluno.quantidaAluno());
					}
					
				}while(opChamada != 0);
			}
			
			
			
		}while (opcaoSistema != 0);
		
		
		
	}
}
