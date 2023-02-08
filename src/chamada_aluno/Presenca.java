package chamada_aluno;

public class Presenca {
	Aluno aluno = new Aluno();
	
	
	public void chamada(int totAluno) throws IndexOutOfBoundsException{
		String[][] vChamada = new String[totAluno][31];
		
		
		for (int i = 0; i < 31; i++ ) {
			for (int j = 0; j < totAluno; j++ ) {
				if (j == 0) {
					vChamada[i][j] = "Aluno";
				}else {
					
					vChamada[i][j] = aluno.getNome();;
				
				}
				
				System.out.println(vChamada[i][j]);
			}
			
			
		}
	}


	
}
