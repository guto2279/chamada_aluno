package chamada_aluno;
import java.util.Scanner;

public class Execultavel {
	
	public static void main (String [] args) {
		
		Aluno aluno = new Aluno();
		Presenca presenca = new Presenca(aluno);
		MostrarTela  mostrarTela = new MostrarTela();
		Scanner scanner = new Scanner (System.in);
	
		int opcaoAdcionar, opcaoSistema, opChamada, dia = 0;
		String nome;
		
		do {
			opcaoSistema = mostrarTela.opcaoSistema();
			
			if (opcaoSistema == 1) {
				do {
					
					opcaoAdcionar = mostrarTela.opcaoAdicionar();
					
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
					
					
					opChamada = scanner.nextInt();	
					
					if (opChamada == 1) {
						presenca.chamada(aluno.quantidaAluno());
					}
					
				}while(opChamada != 0);
			}
			
		}while (opcaoSistema != 0);
		
		
		
	}
}
