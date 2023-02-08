package chamada_aluno;
import java.util.Scanner;

public class Presenca {
	Aluno aluno = new Aluno();
	
	
	public void chamada(int totAluno) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Quantos dias deseja lançar de chamada? ");
		int dias = scanner.nextInt();
		dias += 1;
		totAluno = totAluno + 1;
		
		String[][] vChamada = new String[totAluno][dias];
		int verificador = 0;
		
		for (int i = 0; i < totAluno; i++ ) {
			for (int j = 0; j < dias ; j++ ) {
				
				if (verificador == 0) {
					vChamada[i][j] = "Aluno";
				}else if (verificador == 1 && i == 0){
					
					vChamada[i][j] = Integer.toString(j);
					
				
				} else if (i >= 1 && j == 0) {
					
					vChamada[i][j] = "Wesley";
				} else {
					System.out.println("Deseja atribuir presença ao Aluno: " + vChamada[i][0] + ", no dia: " + vChamada[0][j] + "? (S/N)" );
					String opPresenca = scanner.next();
					
					if (opPresenca.equalsIgnoreCase("S")) {
						vChamada[i][j] = "P";
					}else if(opPresenca.equalsIgnoreCase("N") ) {
						vChamada[i][j] = "F";
					}
				}
				
				verificador = 1;
				
			}
		}
		
		for (int i = 0; i < totAluno; i++ ) {
			for (int j = 0; j <= dias ; j++ ) {
				
				if ( j < (dias)) {
					System.out.print(vChamada[i][j] + "   ");
				}else {
					System.out.println();
				}
				
			}
		}
	}
}
